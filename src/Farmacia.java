import javax.swing.JOptionPane;

public class Farmacia {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(
            null,
            "BEM VINDO(A) a YourFarma," +
            "\n onde você encontra todas as variedades e melhores marcas de produtos." +
            "\nsomos abertos 24h, com serviço delivery em toda a Curitiba e região" +
            "\n - Para prosseguir selecione OK."
    );

    selecionarAba();

    boolean ver = true;

    while (ver){
      ver = selecionarAba();
    }

    //Carrinho.adicionarProduto();
    Carrinho.exibirCarrinho();
 
  }

  // seleção das abas
  static boolean selecionarAba() {
    String[] abas = {"Medicamentos" , "Dermocosmeticos", "Beleza", "Sair" };
    String resposta = (String) JOptionPane.showInputDialog(
        null,
        "Produtos ",
        "o que você precisa?",
        JOptionPane.PLAIN_MESSAGE,
        null,
        abas,
        abas[0]
    );

    switch (resposta) {

      case "Medicamentos":
        Produtos.adicionarMedicamentos();
        return Produtos.selecionarProduto();


      case "Dermocosmeticos":
        Produtos.adicionarDermocosmeticos();
        return Produtos.selecionarProduto();

      case "Beleza":
        Produtos.adicionarSaudeBeleza();
        return Produtos.selecionarProduto();

    }

    return true;
  }



}
