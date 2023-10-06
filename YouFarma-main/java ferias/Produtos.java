
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Produtos {
  public static String elementoLido;
  public static Double precoLido;
  static int ProdutoSelecionado;
  static ArrayList<Double> precosProdutos = new ArrayList<>();
  static ArrayList<String> produtos = new ArrayList<>();

  public static void adicionarMedicamentos() {
    // Adiciona elementos ao ArrayList
    produtos.add("Paracetamol 500mg (20 comprimidos)\n");
    precosProdutos.add(5.99);
    produtos.add("Ibuprofeno 400mg (30 comprimidos)\n");
    precosProdutos.add(5.99);
    produtos.add("Aspirina 100mg (50 comprimidos)\n");
    precosProdutos.add(5.99);
    produtos.add("Dipirona 500mg (40 comprimidos)\n");
    precosProdutos.add(5.99);
    produtos.add("Anti-histamínico (20 comprimidos)\n");
    precosProdutos.add(5.99);
    produtos.add("Xarope para Tosse (120ml)\n");
    precosProdutos.add(10.88);
  }

  public static void mostrarMedicamentos() {
    String mensagem = "Lista de Produtos:\n";

    for (int i = 0; i < produtos.size(); i++) {
      String valor = produtos.get(i);
      Double preco = precosProdutos.get(i);

      mensagem += "[" + i + "] " + valor + "R$" + preco + "\n";
    }

    ProdutoSelecionado = Integer
        .parseInt(JOptionPane.showInputDialog(null, mensagem + "\n Digite o índice de seu produto para adicionar:"));
  }

  public static String getElementoLido() {
    elementoLido = produtos.get(ProdutoSelecionado);
    return elementoLido;
  }

  public static void getPrecoLido() {
    precoLido = precosProdutos.get(ProdutoSelecionado);
  }
  // repete para todas as abas de produtos

  static void adicionarBeleza() {

  // adiciona produtos a aba de saúde e beleza
  static ArrayList<String> produtos2 = new ArrayList<>();
  static ArrayList<Double> precosProdutos2 = new ArrayList<>();produtos2.add("sabonete antibacteriano\n");precosProdutos2.add(5.99);produtos2.add("Lenços de Papel ");precosProdutos2.add(15.99);produtos2.add("Desodorante ");precosProdutos2.add(24.90);produtos2.add("Àlcool líquido");precosProdutos2.add(12.99);produtos2.add("Termômetro infantil");precosProdutos2.add(27.99);produtos2.add("Pasta de dentes");precosProdutos2.add(22.99);
  }

  public static void mostrarSaudeBeleza() {

    String mensagem = "Lista de Produtos:\n";

    for (int i = 0; i < produtos2.size(); i++) {
      String valor = produtos2.get(i);
      Double preço = precosProdutos2.get(i);
      mensagem += "[" + i + "] " + valor + "R$" + preço + "\n";
    }
    ProdutoSelecionado = Integer
        .parseInt(JOptionPane.showInputDialog(null, mensagem + "\n Digite o índice de seu produto para adicionar:"));
  }

  public static String getElementoLido() {
    elementoLido = produtos.get(ProdutoSelecionado);
    return elementoLido;
  }

  public static void getPrecoLido() {
    precoLido = precosProdutos.get(ProdutoSelecionado);
  }

  produtos3.add("Hidratante Facial\n");precosProdutos3.add(34.70);produtos3.add("Creme Pós-Sol\n");precosProdutos3.add(40.00);produtos3.add("Tônico Facial\n");precosProdutos3.add(50.00);produtos3.add("Sérum de Vitamina C\n");precosProdutos3.add(82.00);produtos3.add("Ácido Hialurônico\n");precosProdutos3.add(45.00);

  String mensagem = "Lista de Produtos:\n";

  for(
  int i = 0;i<produtos3.size();i++)
  {
    String valor = produtos3.get(i);
    Double preço = precosProdutos3.get(i);
    mensagem += "[" + i + "] " + valor + "R$" + preço + "\n";
  }

  ProdutoSelecionado=Integer.parseInt(JOptionPane.showInputDialog(null,mensagem+"\n Digite o índice de seu produto para adicionar:"));

  }

  static void selecionarAba() {
    String[] array = { "Medicamentos", "Manipulados", "Saúde/Beleza", "Dermocosméticos" };

    String selecao = (String) JOptionPane.showInputDialog(null,
        "O que você precisa? ",
        "PRODUTOS",
        JOptionPane.PLAIN_MESSAGE,
        null,
        array,
        array[0]);

    switch (selecao) {
      case "Medicamentos" -> {
        buscaMedicamentos();
      }
      case "Manipulados" -> {
        buscaManipulados();
      }
      case "Dermocosméticos" -> {
        buscaDermocosmeticos();
      }
      case "Saúde/Beleza" -> {
        buscaSaudeBeleza();
      }
      // experesão lammbda permite criar instacias de interfaces funciaonais
      default -> {
        JOptionPane.showMessageDialog(null, "Obrigado pela confiança. Volte sempre!");
      }
    }

  }

  static void buscaMedicamentos() {
    JOptionPane.showMessageDialog(null, "Aba de Medicamentos\n\n"
        + "Aqui encontrará:\n\n "
        + "- Anti-inflamatórios\n"
        + "- Para gripe/resfriado\n"
        + "- Pílulas anticoncepcionais\n"
        + "- Para enxaqueca\n"
        + "- Problemas respiratórios\n"
        + "- Dores de garganta\n\n");

    Produtos.adicionarMedicamentos();
  }

  static void buscaManipulados() {
    JOptionPane.showMessageDialog(null,
        "Aba de Manipulados\n\nPara enviarmos seu medicamento, precisamos que envie sua receita.\n"
            + "Para isso, requeremos alguns de seus dados");
    Receita.cadastroReceita();
  }

  static void buscaSaudeBeleza() {
    JOptionPane.showMessageDialog(null, "Aba de Saúde e Beleza\n\n"
        + "Aqui encontrará:\n\n "
        + "- Vitaminas\n"
        + "- Produtos de higiene bucal/corporal\n"
        + "- Primeiros socorros\n"
        + "- Shakes e Snacks\n\n");

    Produtos.adicionarBeleza();
  }

  static void buscaDermocosmeticos() {
    JOptionPane.showMessageDialog(null, "Aba de Dermocosméticos\n\n"
        + "Aqui encontrará:\n\n"
        + "- produtos para a pele variados"
        + "- proteção solar"
        + "- limpeza da pele"
        + "- cuidado para mãos e unhas");

    Produtos.adicionarDermo();
  }
}