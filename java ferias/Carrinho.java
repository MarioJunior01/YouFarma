import javax.swing.JOptionPane;
import java.util.ArrayList;

public  class Carrinho{

     public static void entrada(){
         
     String escolha ;
     escolha = JOptionPane.showInputDialog(null, "finalizar a compra, precisaremos de alguns de seus dados.\n Você já possui cadastro na farmácia?\n digite S para sim, N para não") ;

         switch(escolha){
         case "S": 
         Cadastro.login();
         case "s":
         Cadastro.login();
         case "N":
         Cadastro.cadastroCarrinho();
         case "n":
         Cadastro.cadastroCarrinho();

         }
         }
        
             static void carrinnho  (){
             Produtos.get(index);

     }
     private static void Meuspedidos(){

    }


}