import javax.swing.JOptionPane;


import java.util.ArrayList;

public class Produtos {
    
     static void addMed(){
     ArrayList<String> produtos = new ArrayList <>();
     produtos.add("Dipirona de 500g\n");
     produtos.add("Dipirona\n");
     produtos.add("Dipirona\n");
     produtos.add("Dipirona\n");
     produtos.add("Dipirona\n");

     String mensagem = "Lista de Produtos:\n";

         for (int i = 0; i < produtos.size(); i++) {
            String valor = produtos.get(i);
            mensagem += "[" + i + "] " + valor + "\n";
         }

         JOptionPane.showMessageDialog(null, mensagem);
    
//Neste código, estamos atualizando a mensagem diretamente dentro do loop, 
//usando a operação de concatenação += para adicionar cada novo valor à mensagem anterior. 
//Isso resultará em uma única mensagem que será exibida em uma única caixa de diálogo no final do loop.
       }

     static void addBlz(){
     ArrayList<String> produtos2 = new ArrayList <>();
     produtos2.add("Dipirona de 500g\n");
     produtos2.add("Dipirona\n");
     produtos2.add("Dipirona\n");
     produtos2.add("Dipirona\n");
     produtos2.add("Dipirona\n");

       String mensagem = "Lista de Produtos:\n";

         for (int i = 0; i < produtos2.size(); i++) {
         String valor = produtos2.get(i);
         mensagem += "[" + i + "] " + valor + "\n";
         }

         JOptionPane.showMessageDialog(null, mensagem);
    
    
}

     static void addDermo(){
     ArrayList<String> produtos3 = new ArrayList <>();
     produtos3.add("Dipirona de 500g\n");
     produtos3.add("Dipirona\n");
     produtos3.add("Dipirona\n");
     produtos3.add("Dipirona\n");
     produtos3.add("Dipirona\n");

       String mensagem = "Lista de Produtos:\n";

         for (int i = 0; i < produtos3.size(); i++) {
            String valor = produtos3.get(i);
            mensagem += "[" + i + "] " + valor + "\n";
         }

         JOptionPane.showMessageDialog(null, mensagem);
    
   }
}
   

