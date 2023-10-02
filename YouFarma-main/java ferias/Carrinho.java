
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
     // Lista de produtos selecionados
     static  ArrayList<Map<String, Double>> produtosSelecionados = new ArrayList<>();

     // Construtor da classe Carrinho
     public Carrinho() {
     }

     public void adicionarProduto(String nome, double preco) {
          Map<String, Double> produto = new HashMap<>();
          produto.put(nome, preco);
          produtosSelecionados.add(produto);
     }

     public static void exibirCarrinho() {
          System.out.println("Produtos no Carrinho:");
          for (int i = 0; i < produtosSelecionados.size(); i++) {
               Map<String, Double> produto = produtosSelecionados.get(i);
               for (Map.Entry<String, Double> entry : produto.entrySet()) {
                    String nome = entry.getKey();
                    Double preco = entry.getValue();
                    System.out.println("[" + i + "] " + nome + " - R$" + preco);
               }
          }
     }
}