import java.text.DecimalFormat;
import java.util.*;

import javax.swing.JOptionPane;

public class Carrinho {
    static double total = 0.0;
    static List<LinkedHashMap<String, Double[]>> produtosSelecionados = new ArrayList<>();

    public static void adicionarProduto(String nome, double preco, double quantidadeAdicional) {
        for (LinkedHashMap<String, Double[]> produto : produtosSelecionados) {
            if (produto.containsKey(nome)) {
                double quantidade = produto.get(nome)[0];
                produto.replace(nome, new Double[] { quantidade + quantidadeAdicional, preco });
                return;
            }
        }

        LinkedHashMap<String, Double[]> produto = new LinkedHashMap<>();
        Double[] quantidadeEPreco = { quantidadeAdicional, preco };
        produto.put(nome, quantidadeEPreco);
        produtosSelecionados.add(produto);
    }

    public static void adicionarProduto(String nome, double preco) {
        adicionarProduto(nome, preco, 1);
    }

    public static void removerProduto(String nome, double quantidadeRemovida) {
        for (int i = 0; i < produtosSelecionados.size(); i++) {
            if (produtosSelecionados.get(i).containsKey(nome)) {
                double quantidade = produtosSelecionados.get(i).get(nome)[0];
                double preco = produtosSelecionados.get(i).get(nome)[1];
                quantidade -= quantidadeRemovida;

                if (quantidade == 0) {
                    produtosSelecionados.remove(i);
                    return;
                }
                produtosSelecionados.get(i).replace(nome, new Double[] { quantidade, preco });
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Produto não encotrado");
    }

    public static void removerProduto(String nome) {
        removerProduto(nome, 1);
    }

    public static Double somarTotalProduto(String nome) {
        for (LinkedHashMap<String, Double[]> produto : produtosSelecionados) {
            if (produto.containsKey(nome)) {
                double quantidade = produto.get(nome)[0];
                double preco = produto.get(nome)[1];
                return quantidade * preco;
            }

        }

        return 0.0;
    }

    public static Double somarTotal(double quantidade, double preco) {
        for (LinkedHashMap<String, Double[]> produto : produtosSelecionados) {
            quantidade = produto.values().stream().toList().get(0)[1]; // pegar apenas o preço

            total += quantidade;

        }

        return total;
    }

    // Exibir o carrinho
    public static void exibirCarrinho() {
        StringBuilder carrinhoTexto = new StringBuilder("Produtos no carrinho:\n\n");
        DecimalFormat formatoNumero = new DecimalFormat("#.00");

        for (LinkedHashMap<String, Double[]> produto : produtosSelecionados) {
            for (var entryProduto : produto.entrySet()) {
                String nomeProduto = entryProduto.getKey();

                carrinhoTexto.append(String.format("Produto: %s - Preço: R$%s\n", nomeProduto,
                        formatoNumero.format(somarTotalProduto(nomeProduto))));
            }
        }

        somarTotal(total, total);

        carrinhoTexto.append("\nTotal: R$").append(total).append("\n").append("Ir ao pagamento?");
        int pagar = JOptionPane.showConfirmDialog(null, carrinhoTexto.toString(), "Seus pedidos",
                JOptionPane.YES_NO_OPTION);

        if (pagar == JOptionPane.YES_OPTION) {
            Login.entrada();

        }
    }

}
