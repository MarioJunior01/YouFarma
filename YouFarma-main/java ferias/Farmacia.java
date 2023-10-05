
import javax.swing.JOptionPane;

public class Farmacia {
    
     public static void main(String[] args) {
    
         entrada();
         Layout.pagina();
         Carrinho.calcularTotal();
         Layout.class();
    
    }

    static void entrada() {
        JOptionPane.showMessageDialog(null,
                "BEM VINDO(A) a YourFarma,\n onde você encontra todas as variedades e melhores marcas de produtos.\n"
                        + "somos abertos 24h, com serviço delivery em toda a Curitiba e região\n - Para prosseguir selecione OK.");
    }

    static void continuarComprando(){
        //chamado após a adição de um produto no carrinho
        String continuar;
        continuar = JOptionPane.showInputDialog(null, "Deseja continuar comprando, ou ir diretamente ao carrinho?\nDigite S para sim, ou N para não.");
     switch (continuar){
         case "N":
         Carrinho.carrinho();
         break;
         case "n":
         Carrinho.carrinho();
         break;
         case "S":
         Produtos.selecionarAba();
         break;
         case "s":    
         Produtos.selecionarAba();
         break;
         default:
            JOptionPane.showMessageDialog(null, "opção inválida");
    }
  }
}
