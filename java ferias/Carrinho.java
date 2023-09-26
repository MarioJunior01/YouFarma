import javax.swing.JOptionPane;
import java.util.ArrayList;



public  class Carrinho{

         public static ArrayList<String> elementos = new ArrayList<>();
         public static ArrayList<Double> precos = new ArrayList<>();

     public static void entrada(){
         
     String escolha ;
     escolha = JOptionPane.showInputDialog(null, "finalizar a compra, precisaremos de alguns de seus dados.\n Você já possui cadastro na farmácia?\n digite S para sim, N para não") ;

         switch(escolha){
         case "S": 
         Cadastro.login();
         case "s":
         Cadastro.login();
         case "N":
         Cadastro.cadastroCarrinho();
         case "n":
         Cadastro.cadastroCarrinho();
         
         }
         }
         

             
             static void carrinho() {
             

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

             static void pagamento(){
             
             }


     
}