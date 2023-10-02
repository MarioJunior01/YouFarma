import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
     // Lista de produtos selecionados
     static List<Map<String, Double>> produtosSelecionados = new ArrayList<>();

     // Adicionar produto ao carrinho
     public static void adicionarProduto(String nome, double preco) {
          Map<String, Double> produto = new HashMap<>();
          produto.put(nome, preco);
          produtosSelecionados.add(produto);
     }

     // Exibir o carrinho
     public static void exibirCarrinho() {
          for (Map<String, Double> produto : produtosSelecionados) {
               for (Map.Entry<String, Double> entry : produto.entrySet()) {
                    String nomeProduto = entry.getKey();
                    Double precoProduto = entry.getValue();
                    System.out.println("Produto: " + nomeProduto + " - Preço: R$" + precoProduto);
               }
          }
     }
}
