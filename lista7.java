import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.FileNotFoundException;



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
    private static int comparacoes = 0;
    private static int movimentos = 0;

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

    public Jogo(String nomeJogo int ano, String editora, String plataforma,) {
        this.nomeJogo = nomeJogo;
        this.plataforma = plataforma;
        this.ano = ano;
        this.editora = editora;
    }

    public Jogo(){}


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

    public Jogo clone() {
        return new Jogo(this.rank, this.nomeJogo, this.plataforma, this.ano, this.genero, this.editora, this.NA_Vendas,
                this.EU_Vendas, this.JP_Vendas, this.Outras_Vendas, this.Vendas_Global);
    }

    public void preencherIn(String Dados, int i, Jogos vetor[]) {
        String[] dados = Dados.split(";");
        this.nomeJogo = dados[0];
        this.ano = Integer.parseInt(dados[1]);
        this.editora = dados[2];
        this.plataforma = dados[3];

        //prencher
        vetor[i] = Jogo jogo = new jogo(nomeJogo,ano,editora,plataforma);
    }

   public void lerTxt(String Dados,int i ,Jogo vetor[]) {
        String[] dados = Dados.split("\\|");

        this.rank = Integer.parseInt(dados[0]);
        this.nomeJogo = dados[1];
        this.plataforma = dados[2];
        this.ano = Integer.parseInt(dados[3]);
        this.genero = dados[4];
        this.editora = dados[5];
        this.NA_Vendas = Double.parseDouble(dados[6]);
        this.EU_Vendas = Double.parseDouble(dados[7]);
        this.JP_Vendas = Double.parseDouble(dados[8]);
        this.Outras_Vendas = Double.parseDouble(dados[9]);
        this.Vendas_Global = Double.parseDouble(dados[10]);

        //prencher
        vetor[i] = Jogo jogo = new jogo(rank,nomeJogo,plataforma,ano,genero,editora,NA_Vendas,EU_Vendas,,JP_Vendas,,Outras_Vendas,Vendas_Global);
    }


    public void imprimir() {
        System.out.println(this);
    }
  
  

}

class Fila{
    void emfileirar(Jogo jogo);
    Jogo desenfileirar(){
        return Jogo[prox];
    }
    void mostrar(){
    }
    int obterSomaVendasGlobal(){
    }


    public Fila(){}
    public Fila(){}

}


public class lista6 {


    public static void main(String[] args) {

        // ler jogos.txt
        String jogos[] listaJogos;
        ArquivoTextoLeitura jogostxt = new ArquivoTextoLeitura("/tmp/jogos.txt");
       
        Jogo jogosVetor[];    

        String linha = txt.ler();
        while (!linha.equals(null)) {
            int i =0;
            preencherJogo(linha,i,jogosVetor);
            i++;
            linha = txt.ler();
        }
        jogostxt.close;

        // ler pub.in

        Jogo inVetor[];

        linha = MyIO.readLine();
        while (!linha.equals("FIM")) {
            int i =0;
            preencherIn(linha,i,inVetor[]);
            i++;
            linha = MyIO.readLine();
        }

        int tamanho = MyIO.readLine();

        


    }

}