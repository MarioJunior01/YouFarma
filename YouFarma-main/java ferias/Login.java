import java.util.HashMap;

import javax.swing.JOptionPane;

public class Login{

public static void entrada(){
         
     String escolha ;
     escolha = JOptionPane.showInputDialog(null, "finalizar a compra, precisaremos de alguns de seus dados.\n Você já possui cadastro na farmácia?\n digite S para sim, N para não") ;

         switch(escolha){
         case "S": 
         login();
         break;
         case "s":
         login();
         break;
         case "N":
         Cadastro.cadastro();
         break;
         case "n":
         Cadastro.cadastro();
         break;
         
         }
         }


         static void login(){
         //chamar caso o usuário já for cliente
           HashMap <String,String> usuarios = new HashMap<>();
           usuarios.put(Cadastro.cpf, Cadastro.nomeCompleto);
           JOptionPane.showInputDialog(null, "LOGIN YourFarma\n Para finalizar a compra entre com seu login\nCPF");
           Cadastro.setCpf();
           Cadastro.getCpf();
           JOptionPane.showMessageDialog(null,"Seja bem vindo de volta! " + usuarios);
           
                
    }
}