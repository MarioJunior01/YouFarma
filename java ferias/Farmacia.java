
import javax.swing.JOptionPane;

public class Farmacia {

  public static void main(String[] args) {
    

    entrada();
    selecionarAba();
    

    boolean ver = true;

    while (ver == true){
      ver = selecionarAba();
    }
    //Carrinho.adicionarProduto();
    Carrinho.exibirCarrinho();
 
  }

  
  static void entrada() {
    JOptionPane.showMessageDialog(
        null,
        "BEM VINDO(A) a YourFarma,\n onde você encontra todas as variedades e melhores marcas de produtos.\n" +
            "somos abertos 24h, com serviço delivery em toda a Curitiba e região\n - Para prosseguir selecione OK.");
  }


  

  // seleção das abas
  static boolean selecionarAba() {
    String[] array = { "Medicamentos", "Dermocosmeticos", "Beleza", "Sair" };
    String resposta = (String) JOptionPane.showInputDialog(
        null,
        "Produtos ",
        "o que você precisa?",
        JOptionPane.PLAIN_MESSAGE,
        null,
        array,
        array[0]);

    switch (resposta) {

      case "Medicamentos":
        Produtos.adicionarMedicamentos();
        return Produtos.selecionarProduto();
       // break;

      case "Dermocosmeticos":
        Produtos.adicionarDermocosmeticos();
        return Produtos.selecionarProduto();
        //break;

      case "Beleza":
        Produtos.adicionarSaudeBeleza();
        return Produtos.selecionarProduto();
        //break;
           
    }
    return true;
  }



}
