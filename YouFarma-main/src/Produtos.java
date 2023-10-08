     import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Produtos {

    static ArrayList<HashMap<String, Double>> listaDeProdutos = new ArrayList<>();
    public static HashMap<Integer, String> elementoAdicionado = new HashMap<>();
    public static HashMap<Integer, Double> precoAdicionado = new HashMap<>();
    public static int proximoIndice = 0; // Índice global para os produtos

    public static void adicionarProduto(String nome, double preco) {
        HashMap<String, Double> produto = new HashMap<>();
        produto.put(nome, preco);
        listaDeProdutos.add(produto);
        proximoIndice++; // Incrementa o índice global
    }

    public static void adicionarMedicamentos() {
        resetarlista(); // deixa a lista de produtos vazia
        adicionarProduto("Paracetamol 20 comprimidos", 20.99);
        adicionarProduto("Prometazina 30 comprimidos", 29.99);
        adicionarProduto("Ibuprofeno gotas 20ml", 15.99);
        adicionarProduto("Antialérgico Koid D xarope 120ml", 35.59);
        adicionarProduto("Antiácido Sonrisal", 5.90);
        adicionarProduto("Xarope para tosse Vick", 33.00);
        adicionarProduto("Clorfeniramina", 5.99);
    }

    public static void adicionarDermocosmeticos() {
        resetarlista();
       
        adicionarProduto("Shampoo", 5.99);
        adicionarProduto("Sabonete", 2.99);
      
    }

    public static void adicionarSaudeBeleza() {
        resetarlista();
        
        adicionarProduto("Shampoo", 5.99);              
        adicionarProduto("Sabonete", 2.99);
        
    }

    public static boolean selecionarProduto() {
        
        StringBuilder mensagem = new StringBuilder("Lista de Produtos\n");
        Carrinho carrinho = new Carrinho();
        // Percorre os elementos e seus preços
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            HashMap<String, Double> produtos = listaDeProdutos.get(i);
            for (Map.Entry<String, Double> entry : produtos.entrySet()) {
                String elemento = entry.getKey();
                Double preco = entry.getValue();

                //mensagem += "[" + i + "] " + elemento + " - R$" + preco + "\n";
                // %d -> inteiro
                // %s -> String
                // %f -> Números decimais
                mensagem.append(String.format("[%d] %s - R$%S   0\n", i, elemento, preco));
            }
        }

        while (true) {
            String elementoSelecionado = JOptionPane.showInputDialog(null, mensagem +
                    "Selecione a posição do seu produto, ou 'sair' para encerrar a compra");

            if (elementoSelecionado == null || elementoSelecionado.equalsIgnoreCase("sair")) {
                break; // Sai do loop se o usuário pressionar Cancelar ou digitar 'sair'
            }

            int elementoAdd = Integer.parseInt(elementoSelecionado);

            if (elementoAdd >= 0 && elementoAdd < listaDeProdutos.size()) {
                HashMap<String, Double> produtosSelecionados = listaDeProdutos.get(elementoAdd);


                for (Map.Entry<String, Double> entry : produtosSelecionados.entrySet()) {
                    String produtoSelecionado = entry.getKey(); //obs, talvez n seja necessário td isso
                    Double precoProdutoSelecionado = entry.getValue();
                    elementoAdicionado.put(elementoAdd, produtoSelecionado);
                    precoAdicionado.put(elementoAdd, precoProdutoSelecionado);
                    carrinho.adicionarProduto(produtoSelecionado, precoProdutoSelecionado); //coloca o produto selecionado 
                                                                                            // no carrinho
                    JOptionPane.showMessageDialog(null,
                            "Produto selecionado: " + produtoSelecionado + " - R$" + precoProdutoSelecionado);
                }

                // Pergunta se o usuário deseja continuar comprando
                int continuarComprando = JOptionPane.showConfirmDialog(null,
                        "Deseja continuar comprando?",
                        "Continuar Comprando", JOptionPane.YES_NO_OPTION);

                if (continuarComprando == JOptionPane.NO_OPTION) {
                    return false; // retorna false, quebrando o loop do while da classe farmácia
                }
                if (continuarComprando == JOptionPane.YES_OPTION) {
                    return true; // retorna true no método onde foi chamado, no caso o da clásse farmácia
                }
            } else {
                JOptionPane.showMessageDialog(null, "Posição inválida.");
            }

        }
        return true;
    }

    public static void resetarlista(){
        listaDeProdutos = new ArrayList<>(); // reseta a lista para que não repita os produtos
    }
}