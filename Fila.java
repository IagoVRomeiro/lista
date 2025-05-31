import java.util.ArrayList;

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