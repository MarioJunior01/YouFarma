import javax.swing.JOptionPane;
import java.util.ArrayList;



public  class Carrinho{

         public static ArrayList<String> elementos = new ArrayList<>();
         public static ArrayList<Double> precos = new ArrayList<>();
         

             
             static void carrinho() {
             
             // método de adição de ArrayList
             elementos.add(Produtos.elementoLido);
             precos.add(Produtos.precoLido);

             int produtos_comprados = elementos.size();

             if (produtos_comprados == 0) {
             JOptionPane.showMessageDialog(null, "O carrinho está vazio.");
             return; // Sai do método se o carrinho estiver vazio
              }

             String carrinhoMessage = "SEU CARRINHO:\n";

              for (int i = 0; i < produtos_comprados; i++) {
             String elemento = elementos.get(i);
             Double preco = precos.get(i);

             carrinhoMessage += elemento + " - R$" + preco + "\n";
             }

             JOptionPane.showMessageDialog(null, carrinhoMessage);
             
            
            }
            
             static double calcularTotal() {
             double total = 0.0;
             for (int i = 0; i < elementos.size(); i++) {
             double preco = precos.get(i);
             total += preco;
             }
              return total;
             }

             


     
}