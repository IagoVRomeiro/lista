import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;

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

   public Jogo() {
   };

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

   private ArrayList<Jogo> fila;
   private int totalElementos;
   private double somaVendasGlobais;

   public Fila() {
      fila = new ArrayList<>();

      totalElementos = 0;
      somaVendasGlobais = 0.0;
   }

   public void enfileirar(Jogo jogo) {
      fila.add(jogo);
      totalElementos++;
      somaVendasGlobais += jogo.getVendas_Global();
   }

   public Jogo desenfileirar() {
      if (totalElementos == 0) {
         throw new RuntimeException("Fila está vazia!");
      }

      Jogo jogo = fila.remove(0);
      totalElementos--;
      somaVendasGlobais -= jogo.getVendas_Global();
      return jogo;
   }

   public void mostrar() {
      if (totalElementos == 0) {
         MyIO.print("Fila está vazia!");
      }

      int indice = 0;
      for (Jogo jogo : fila) {

         double maiorVenda = jogo.compararVendas(jogo.getNA_Vendas(), jogo.getEU_Vendas(),
               jogo.getJP_Vendas(), jogo.getOutras_Vendas());

         MyIO.println("[" + indice + "] [" + jogo.getNomeDoJogo() + "] [" + jogo.getPlataforma() + "] [" +
               jogo.getVendas_Global() + "] [" + jogo.getRank() + "]. [" + jogo.getGenero() + "]. [" +
               jogo.getEditora() + "]. Mais vendido:[" + maiorVenda + "]");

         indice++;
      }
   }

   public int getSomaVendasGlobal() {
      return (int) Math.round(somaVendasGlobais);
   }

   public int getQtdElementos() {
      return totalElementos;
   }

   public ArrayList<Jogo> getvetor() {
      return fila;
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

   public static void main(String[] args) {

      String linha;
      ArquivoTextoLeitura txt = new ArquivoTextoLeitura("/tmp/jogos.txt");
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

            for (Jogo jogo : vetorjogos) {
               if (jogo.getNomeDoJogo().equals(nomeJogo) &&
                     jogo.getAno() == ano &&
                     jogo.getEditora().equals(editora) &&
                     jogo.getPlataforma().equals(plataforma)) {

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
