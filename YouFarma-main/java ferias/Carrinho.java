import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Carrinho extends Produtos {
     // maneira de como colocar os elementos e os preços no carriinho//
     // metodo Remove para remover alguma coisa do array list//

     /*
      * static double calcularTotal() {
      * double total = 0.0;
      * for (int i = 0; i < elementos.size(); i++) {
      * double preco = precos.get(i);
      * total += preco;
      * }
      * return total;
      * 
      * }
      */

     public static void mostrarCarrinho() {
          for (int i = 0; i < elementoAdicionado.size(); i++) {

               JOptionPane.showMessageDialog(null, "Seus produtos:\n" + elementos.get(Produtos.elementoAdd) + "R$"
                         + precos.get(Produtos.elementoAdd));
          }
     }

     public static void removerItem() {
     public static void adicionarItem(){

                    }
     }
}
//