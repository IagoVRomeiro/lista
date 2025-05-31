public class Jogo {

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

    public Jogo() {
    }

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
