
import javax.swing.JOptionPane;

public class Farmacia {

  public static void main(String[] args) {

    entrada();
    selecionarAba();
    Carrinho.mostrarCarrinho();

  }

  static void entrada() {
    JOptionPane.showMessageDialog(null,
        "BEM VINDO(A) a YourFarma,\n onde você encontra todas as variedades e melhores marcas de produtos.\n"
            + "somos abertos 24h, com serviço delivery em toda a Curitiba e região\n - Para prosseguir selecione OK.");
  }

  // seleção das Abas

  static void selecionarAba() {
    String[] array = { "Medicamentos", "Dermocosmeticos", "Beleza", "Sair" };
    String escolha;
    String resposta = (String) JOptionPane.showInputDialog(
        null,
        "Produtos ",
        "o que você precisa?",
        JOptionPane.PLAIN_MESSAGE,
        null,
        array,
        array[0]);
    escolha = resposta;
    switch (escolha) {
      case "Medicamentos": {
        Produtos.adicionarMedicamentos();
        Produtos.mostrarMedicamentos();
      }
        break;
      case "Dermocosmeticos": {
        Produtos.adicionarDermocosmeticos();
        Produtos.mostrarDermocosmeticos();
      }
        break;
      case "Beleza": {
        Produtos.adicionarSaudeBeleza();
        Produtos.mostrarSaudeBeleza();
      }
        break;
      default: {
        JOptionPane.showMessageDialog(null, "OBRIGADO PELA PREFERIENCIA\n" + "Esperamos você de novo");

        break;
      }
    }

  }

}
