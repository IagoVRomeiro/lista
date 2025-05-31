
import java.util.ArrayList;

class Main {


    public static void main(String[] args) {

        String linha;
        ArquivoTextoLeitura txt = new ArquivoTextoLeitura("jogos.txt");
        ArrayList<Jogo> vetorjogos = new ArrayList<>();

        // preencher jogosvector
        do {
            linha = txt.ler();
            vetorjogos.add(PreencherJogo(linha));
        } while (linha != null);

        txt.fecharArquivo();

        // colocar na fila
        Fila fila = new Fila();

        do {
            linha = MyIO.readLine();
            String[] info = linha.split(";");
            String nomeDoJogo = info[0];
            int ano = Integer.parseInt(info[1]);
            String editora = info[2];
            String plataforma = info[3];

            for (Jogo jogo : vetorjogos) {
                if (jogo.getNomeDoJogo().equals(nomeDoJogo) && jogo.getAno() == ano && jogo.getEditora().equals(editora)
                        && jogo.getPlataforma().equals(plataforma)) {
                    fila.enfileirar(jogo);
                    MyIO.println(fila.getSomaVendasGlobal());
                    break;
                }
            }
        } while (!linha.equals("FIM"));

        MyIO.println("Quantidade de jogos encontrados: " + fila.getQtdElementos());
        MyIO.println("Tamanho da fila: " + fila.getvetor().size());

        int operacoes = MyIO.readInt();

        for (int i = 0; i < operacoes; i++) {

            linha = MyIO.readLine();

            String[] dados = linha.split(" ");

            // desenfileirar
            if (dados[0].equals("D")) {
                Jogo jogo = fila.desenfileirar();
                double maiorVenda = jogo.compararVendas(jogo.getNA_Vendas(), jogo.getEU_Vendas(), jogo.getJP_Vendas(),
                        jogo.getOutras_Vendas());

                MyIO.println("(D) [" + jogo.getNomeDoJogo() + "] [" + jogo.getPlataforma() + "] ["
                        + jogo.getVendas_Global() + "] [" + jogo.getRank() + "]. [" + jogo.getGenero() + "]. ["
                        + jogo.getEditora() + "]. Mais vendido:[" + maiorVenda + "]");

            } // enfileirar
            else if (dados[0].equals("E")) {

                String[] DadosJogo = dados[1].split(";");

                String nomeJogo = DadosJogo[0];
                int ano = Integer.parseInt(DadosJogo[1]);
                String editora = DadosJogo[2];
                String plataforma = DadosJogo[3];

                for (Jogo jogo : vetorjogos) {
                    if (jogo.getNomeDoJogo().equals(nomeJogo)
                            && jogo.getAno() == ano
                            && jogo.getEditora().equals(editora)
                            && jogo.getPlataforma().equals(plataforma)) {

                        fila.enfileirar(jogo);
                        break;
                    }
                }
                MyIO.println(fila.getSomaVendasGlobal());
            }
        }

        fila.mostrar();

    }

}
