import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class Carrinho {
           static double total=0.0;

    // Lista de produtos selecionados
    static List<HashMap<String, Double>> produtosSelecionados = new ArrayList<>();

    // Método privado para adicionar um produto ao carrinho
    public static void adicionarProduto(String nome, double preco) {
        HashMap<String, Double> produto = new HashMap<>();
        produto.put(nome, preco);
        produtosSelecionados.add(produto);
    }

    public static void removerProduto(int indiceProduto) {
        produtosSelecionados.remove(indiceProduto);
    }

     public static void removerProduto(String nome) {
        int indice = -1; // valor inicial

        for (int i = 0; i < produtosSelecionados.size(); i++) {
            if (produtosSelecionados.get(i).keySet().toArray()[0] == nome) {
                indice = 0;
            }
        }

        // se o valor foi encontrado, remover da lista
        if (indice != -1)
            removerProduto(indice);
    }

         public static Double somarTotal(){
        for (HashMap<String, Double> produto : produtosSelecionados) {
            for (Double precoProduto : produto.values()) {
                total += precoProduto;
            }
    }
    return total;
}
    // Exibir o carrinho
    public static void exibirCarrinho() {
        StringBuilder carrinhoTexto = new StringBuilder("Produtos no carrinho:\n\n");

        for (HashMap<String, Double> produto : produtosSelecionados) {
            for (HashMap.Entry<String, Double> entry : produto.entrySet()) {
                String nomeProduto = entry.getKey();
                Double precoProduto = entry.getValue();
                carrinhoTexto.append("Produto: ").append(nomeProduto).append(" - Preço: R$").append(precoProduto)
                .append("\n");
            }
        }
        carrinhoTexto.append("\nTotal: R$").append(total).append("\n").append("Ir ao pagamento?");  
        int pagar=JOptionPane.showConfirmDialog(null, carrinhoTexto.toString(), "Seus pedidos", JOptionPane.YES_NO_OPTION);

        if (pagar==JOptionPane.YES_OPTION){
            Login.entrada();

        }
    }

}
