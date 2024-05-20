import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class ArquivoTextoLeitura {

   private BufferedReader entrada;

   ArquivoTextoLeitura(String nomeArquivo) {

      try {
         entrada = new BufferedReader(new FileReader(nomeArquivo));
      } catch (FileNotFoundException excecao) {
         System.out.println("Arquivo nao encontrado");
      }
   }

   public void fecharArquivo() {

      try {
         entrada.close();
      } catch (IOException excecao) {
         System.out.println("Erro no fechamento do arquivo de leitura: " + excecao);
      }
   }

   @SuppressWarnings("finally")
   public String ler() {

      String textoEntrada = null;

      try {
         textoEntrada = entrada.readLine();
      } catch (EOFException excecao) { // Excecao de final de arquivo.
         textoEntrada = null;
      } catch (IOException excecao) {
         System.out.println("Erro de leitura: " + excecao);
         textoEntrada = null;
      } finally {
         return textoEntrada;
      }
   }
}

class MyIO {

   private static BufferedReader in = new BufferedReader(
         new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
   private static String charset = "UTF-8";

   public static void setCharset(String charset_) {
      charset = charset_;
      in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
   }

   public static void print() {
   }

   public static void print(int x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(String x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(boolean x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void print(char x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println() {
   }

   public static void println(int x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(String x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(boolean x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void println(char x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static void printf(String formato, double x) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.printf(formato, x);// "%.2f"
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
   }

   public static double readDouble() {
      double d = -1;
      try {
         d = Double.parseDouble(readString().trim().replace(",", "."));
      } catch (Exception e) {
      }
      return d;
   }

   public static double readDouble(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readDouble();
   }

   public static float readFloat() {
      return (float) readDouble();
   }

   public static float readFloat(String str) {
      return (float) readDouble(str);
   }

   public static int readInt() {
      int i = -1;
      try {
         i = Integer.parseInt(readString().trim());
      } catch (Exception e) {
      }
      return i;
   }

   public static int readInt(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readInt();
   }

   public static String readString() {
      String s = "";
      char tmp;
      try {
         do {
            tmp = (char) in.read();
            if (tmp != '\n' && tmp != ' ' && tmp != 13) {
               s += tmp;
            }
         } while (tmp != '\n' && tmp != ' ');
      } catch (IOException ioe) {
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readString(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readString();
   }

   public static String readLine() {
      String s = "";
      char tmp;
      try {
         do {
            tmp = (char) in.read();
            if (tmp != '\n' && tmp != 13) {
               s += tmp;
            }
         } while (tmp != '\n');
      } catch (IOException ioe) {
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readLine(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readLine();
   }

   public static char readChar() {
      char resp = ' ';
      try {
         resp = (char) in.read();
      } catch (Exception e) {
      }
      return resp;
   }

   public static char readChar(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readChar();
   }

   public static boolean readBoolean() {
      boolean resp = false;
      String str = "";

      try {
         str = readString();
      } catch (Exception e) {
      }

      if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") ||
            str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")) {
         resp = true;
      }

      return resp;
   }

   public static boolean readBoolean(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      return readBoolean();
   }

   public static void pause() {
      try {
         in.read();
      } catch (Exception e) {
      }
   }

   public static void pause(String str) {
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      } catch (UnsupportedEncodingException e) {
         System.out.println("Erro: charset invalido");
      }
      pause();
   }
}

class Jogo {
   private int rank;
   private String nomeJogo;
   private String plataforma;
   private int ano;
   private String genero;
   private String editora;
   private double NA_Vendas;
   private double EU_Vendas;
   private double JP_Vendas;
   private double Outras_Vendas;
   private double Vendas_Global;

   public Jogo(int rank, String nomeJogo, String plataforma, int ano, String genero, String editora, double NA_Vendas,
         double EU_Vendas, double JP_Vendas, double Outras_Vendas, double Vendas_Global) {
      this.rank = rank;
      this.nomeJogo = nomeJogo;
      this.plataforma = plataforma;
      this.ano = ano;
      this.genero = genero;
      this.editora = editora;
      this.NA_Vendas = NA_Vendas;
      this.EU_Vendas = EU_Vendas;
      this.JP_Vendas = JP_Vendas;
      this.Outras_Vendas = Outras_Vendas;
      this.Vendas_Global = Vendas_Global;
   }

   public Jogo(String nomeJogo, int ano, String editora, String plataforma) {
      this.nomeJogo = nomeJogo;
      this.plataforma = plataforma;
      this.ano = ano;
      this.editora = editora;
   }

   public int getRank() {
      return rank;
   }

   public void setRank(int rank) {
      this.rank = rank;
   }

   public String getNomeDoJogo() {
      return nomeJogo;
   }

   public void setNomeDoJogo(String nomeDoJogo) {
      this.nomeJogo = nomeDoJogo;
   }

   public String getPlataforma() {
      return plataforma;
   }

   public void setPlataforma(String plataforma) {
      this.plataforma = plataforma;
   }

   public int getAno() {
      return ano;
   }

   public void setAno(int ano) {
      this.ano = ano;
   }

   public String getGenero() {
      return genero;
   }

   public void setGenero(String genero) {
      this.genero = genero;
   }

   public String getEditora() {
      return editora;
   }

   public void setEditora(String editora) {
      this.editora = editora;
   }

   public double getNA_Vendas() {
      return NA_Vendas;
   }

   public void setNA_Vendas(double NA_Vendas) {
      this.NA_Vendas = NA_Vendas;
   }

   public double getEU_Vendas() {
      return EU_Vendas;
   }

   public void setEU_Vendas(double EU_Vendas) {
      this.EU_Vendas = EU_Vendas;
   }

   public double getJP_Vendas() {
      return JP_Vendas;
   }

   public void setJP_Vendas(double JP_Vendas) {
      this.JP_Vendas = JP_Vendas;
   }

   public double getOutras_Vendas() {
      return Outras_Vendas;
   }

   public void setOutras_Vendas(double Outras_Vendas) {
      this.Outras_Vendas = Outras_Vendas;
   }

   public double getVendas_Global() {
      return Vendas_Global;
   }

   public void setVendas_Global(double Vendas_Global) {
      this.Vendas_Global = Vendas_Global;
   }

   public Double compararVendas(double NA_Vendas, double EU_Vendas, double JP_Vendas, double Outras_Vendas) {
      if (NA_Vendas > EU_Vendas && NA_Vendas > JP_Vendas && NA_Vendas > Outras_Vendas) {
         return NA_Vendas;
      } else if (EU_Vendas > NA_Vendas && EU_Vendas > JP_Vendas && EU_Vendas > Outras_Vendas) {
         return EU_Vendas;
      } else if (JP_Vendas > NA_Vendas && JP_Vendas > EU_Vendas && JP_Vendas > Outras_Vendas) {
         return JP_Vendas;
      } else {
         return Outras_Vendas;
      }

   }

   public Jogo clone() {
      return new Jogo(this.rank, this.nomeJogo, this.plataforma, this.ano, this.genero, this.editora, this.NA_Vendas,
            this.EU_Vendas, this.JP_Vendas, this.Outras_Vendas, this.Vendas_Global);
   }

   public void imprimir() {
      System.out.println(this);
   }

}

class Fila {
   private Jogo[] fila;
   private int inicio;
   private int fim;
   private int totalElementos;
   private double somaVendasGlobais;

   public Fila(int capacidade) {
      fila = new Jogo[capacidade + 1];
      inicio = 0;
      fim = 0;

      totalElementos = 0;
      somaVendasGlobais = 0.0;
   }

   public void enfileirar(Jogo jogo) {
      if ((fim + 1) % fila.length == inicio) {
         desenfileirar();
      }
      fila[fim] = jogo;
      fim = (fim + 1) % fila.length;

      totalElementos++;
      somaVendasGlobais += jogo.getVendas_Global();
   }

   public Jogo desenfileirar() {
      if (inicio == fim) {
         throw new RuntimeException("Fila está vazia!");
      }

      Jogo jogo = fila[inicio];
      inicio = (inicio + 1) % fila.length;

      totalElementos--;
      somaVendasGlobais -= jogo.getVendas_Global();
      return jogo;
   }

   public void mostrar() {
      if (totalElementos == 0) {
         System.out.println("Fila está vazia!");
         return;
      }
      int index = inicio;
      for (int i = 0; i < totalElementos; i++) {
         double maiorVenda = fila[i].compararVendas(fila[i].getNA_Vendas(), fila[i].getEU_Vendas(),
               fila[i].getJP_Vendas(), fila[i].getOutras_Vendas());

         MyIO.print("[" + i + "] [" + fila[i].getNomeDoJogo() + "] [" + fila[i].getPlataforma() + "] [" +
               fila[i].getVendas_Global() + "] [" + fila[i].getRank() + "]. [" + fila[i].getGenero() + "]. ["
               + fila[i].getEditora() + "]. Mais vendido:[" + maiorVenda + "]");
         index = (index + 1) % fila.length;
      }
   }

   public int getSomaVendasGlobal() {
      return (int) Math.round(somaVendasGlobais);
   }

   public int getQtdElementos() {
      return totalElementos;
   }

}

class lista7 {

   public static Jogo PreencherJogo(String Dados) {

      String[] dados = Dados.split("\\|");

      int rank = Integer.parseInt(dados[0]);
      String nomeJogo = dados[1];
      String plataforma = dados[2];
      int ano = Integer.parseInt(dados[3]);
      String genero = dados[4];
      String editora = dados[5];
      Double NA_Vendas = Double.parseDouble(dados[6]);
      Double EU_Vendas = Double.parseDouble(dados[7]);
      Double JP_Vendas = Double.parseDouble(dados[8]);
      Double Outras_Vendas = Double.parseDouble(dados[9]);
      Double Vendas_Global = Double.parseDouble(dados[10]);

      // prencher
      return new Jogo(rank, nomeJogo, plataforma, ano, genero, editora, NA_Vendas, EU_Vendas, JP_Vendas, Outras_Vendas,
            Vendas_Global);
   }

   public static Jogo Preencherinput(String Dados) {

      String[] dados = Dados.split(";");

      String nomeJogo = dados[0];
      int ano = Integer.parseInt(dados[1]);
      String editora = dados[2];
      String plataforma = dados[3];

      // prencher
      return new Jogo(nomeJogo, ano, plataforma, editora);
   }

  

   public static void main(String[] args) {
      String linha;

      ArquivoTextoLeitura txt_1 = new ArquivoTextoLeitura("/tmp/jogos.txt");

      // contar jogos.txt
      int qtdJogos = 0;
      do {
         linha = txt_1.ler();
         qtdJogos++;
      } while (linha != null);

      txt_1.fecharArquivo();
      ArquivoTextoLeitura txt_2 = new ArquivoTextoLeitura("/tmp/jogos.txt");

      // preencher jogosvector
      Jogo jogosVetor[] = new Jogo[qtdJogos];

      for (int i = 0; i < qtdJogos; i++) {
         linha = txt_2.ler();
         jogosVetor[i] = PreencherJogo(linha);
      }

      txt_2.fecharArquivo();

      
      // contar pub.in
      int qtdJogosIn = 0;
      do {
         linha = MyIO.readLine();
         qtdJogosIn++;
      } while (linha != "FIM");

      // preencher jogosIn
      Jogo jogosVetorIn[] = new Jogo[qtdJogosIn];

      for (int i = 0; i < qtdJogosIn; i++) {
         linha = MyIO.readLine();
         jogosVetorIn[i] = Preencherinput(linha);
      }

      // aplicar na fila
      Fila fila = new Fila(60);
      int encontrados = 0;
      
      
      for (int i = 0; i < jogosVetor.length; i++) {
         for (int j = 0; j < jogosVetorIn.length; j++) {
             if (jogosVetor[i] != null && jogosVetorIn[j] != null &&
             jogosVetor[i].getNomeDoJogo().equals(jogosVetorIn[j].getNomeDoJogo()) &&
             jogosVetor[i].getAno() == jogosVetorIn[j].getAno() &&
             jogosVetor[i].getEditora().equals(jogosVetorIn[j].getEditora()) &&
             jogosVetor[i].getPlataforma().equals(jogosVetorIn[j].getPlataforma())) {
                 fila.enfileirar(jogosVetorIn[j]);
                 encontrados++;
             }
         }
     } 
         
      

      MyIO.println("Quantidade de jogos encontrados: " + encontrados);
      MyIO.println("Tamanho da fila: " + fila.getQtdElementos());

      int operacoes = MyIO.readInt();

      for (int i = 0; i < operacoes; i++) {

         linha = MyIO.readLine();

         String[] dados = linha.split(" ");

         // desenfileirar
         if (dados[0].equals("D")) {
            Jogo jogo = fila.desenfileirar();
            double maiorVenda = jogo.compararVendas(jogo.getNA_Vendas(), jogo.getEU_Vendas(), jogo.getJP_Vendas(),
                  jogo.getOutras_Vendas());

            MyIO.println("(D) [" + jogo.getNomeDoJogo() + "] [" + jogo.getPlataforma() + "] [" +
                  jogo.getVendas_Global() + "] [" + jogo.getRank() + "]. [" + jogo.getGenero() + "]. ["
                  + jogo.getEditora() + "]. Mais vendido:[" + maiorVenda + "]");

         }

         // enfileirar
         else if (dados[0].equals("E")) {

            String[] DadosJogo = dados[1].split(";");

            String nomeJogo = DadosJogo[0];
            int ano = Integer.parseInt(DadosJogo[1]);
            String editora = DadosJogo[2];
            String plataforma = DadosJogo[3];

            for (Jogo jogo : jogosVetor) {
               if (jogo.getNomeDoJogo().equals(nomeJogo) &&
                     jogo.getAno() == ano &&
                     jogo.getEditora().equals(editora) &&
                     jogo.getPlataforma().equals(plataforma)) {
                  Jogo jogo1 = new Jogo(nomeJogo, ano, editora, plataforma);
                  fila.enfileirar(jogo1);
                  break;
               }
            }
            MyIO.println(fila.getSomaVendasGlobal());
         }
      }
      fila.mostrar();

   }

}
