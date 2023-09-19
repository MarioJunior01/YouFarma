
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


    public class farmacia{
        ArrayList<String> nomes=new ArrayList<>();
    public static void main(String[] args) {  
         entrada();
         seleçaoDeProdutos();
         Carrinho.entrada();
          

        

 
                
          
        
        
         }

     static void entrada(){
     JOptionPane.showMessageDialog(null, "Bem vindo(a) a YourFarma, onde você encontra todas as variedades e melhores marcas de produtos.\n"
             + "somos abertos 24h, com serviço delivery em toda a Curitiba e região, também em loja física. \n - Para prosseguir selecione OK.");
         }
     
     static void buscaMedicamentos(){
      JOptionPane.showMessageDialog(null, "Aba de Medicamentos\n\n"
         +"Aqui, pesquise por:\n\n ");
         Produtos.addMed();
    }

     static void buscaManipulados(){
        JOptionPane.showMessageDialog(null, "Aba de Manipulados\n\nPara enviarmos seu medicamento, precisamos que envie sua receita.\n"
     +"Para isso, requeremos alguns de seus dados");
    }
     static void buscaSaudeBeleza(){
      JOptionPane.showInputDialog(null, "Aba de Saúde e Beleza\n\n"
      +"Aqui, pesquise por:\n\n "
              + "- Vitaminas\n"
              + "- Colágenos\n"
              + "- Alimentos proteícos\n"
              + "- Shakes e Snacks\n\n"
      +"Digite abaixo o nome do produto que deseja buscar.");
    }
    static void buscaDermocosmeticos(){
      JOptionPane.showInputDialog(null, "Aba de Dermocosméticos\n\n"
      +"Digite abaixo o nome do produto que deseja buscar.");
    }
    
    static void seleçaoDeProdutos(){
     int seleçao = Integer.parseInt( JOptionPane.showInputDialog("Para iniciar a pequisa de produtos, selecione se procura:\n"
             +"1 - medicamentos \n 2 - manipulados \n 3 - saúde/beleza \n 4 - dermocosméticos"));
     
     switch (seleçao){
         case 1:
             buscaMedicamentos();
             break;
         case 2:
             buscaManipulados();
             break;
         case 3:
             buscaSaudeBeleza();
             break;
         case 4:
             buscaDermocosmeticos();
             break;
         default:
             JOptionPane.showMessageDialog(null, "Obrigado pela confiança. Volte sempre!");
         }  
     
    }    
}


     
     
     