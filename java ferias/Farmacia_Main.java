
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


    public class Farmacia_Main{
         ArrayList<String> nomes=new ArrayList<>();
         public static void main(String[] args) {  
        
        entrada();
        Produtos.seleçaoDeProdutos();
        Carrinho.carrinho();
     
          
        
        
         }

     static void entrada(){
     JOptionPane.showMessageDialog(null, "Bem vindo(a) a YourFarma, onde você encontra todas as variedades e melhores marcas de produtos.\n"
             + "somos abertos 24h, com serviço delivery em toda a Curitiba e região, também em loja física. \n - Para prosseguir selecione OK.");
         }
     
}


     
     
     