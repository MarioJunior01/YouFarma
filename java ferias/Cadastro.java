import javax.swing.JOptionPane;
import java.util.HashMap;
import javax.swing.JFrame;


public class Cadastro {
     //atributos
     public static String email;
     public  static String telefone;
     public  static String nomeCompleto;
     public  static String endereço;
     public static String cidade;
     public static String cpf;
      
    

           static void setNome(){
           nomeCompleto=JOptionPane.showInputDialog(null, "CADASTRO YourFarma\n\n"+"digite seu nome completo");
           }
           static String getNome(){
           return nomeCompleto;
           }
           static void setEmail(){
           email=JOptionPane.showInputDialog(null,"digite seu e-mail:");
           }
           static String getEmail(){
           return email;
           }
           static void setCpf(){
           cpf=(JOptionPane.showInputDialog(null, "digite seu CPF:"));
           }
           static String getCpf(){
           return cpf;
           }
           static void setEndereço(){
           endereço= JOptionPane.showInputDialog(null,"digite seu endereço (Rua, número e Bairro):");
           }
           static String getEndereço(){
           return endereço;
           } 
           static void setCidade(){
           cidade= JOptionPane.showInputDialog(null, "digite o nome de sua cidade/região metropolitana");
           }
           static String getCidade(){
               return cidade;
           }

      
      static void cadastroCarrinho (){
      //chamar ao finalizar compra
           
           setNome();
           getNome();
           setEndereço();
           getEndereço();
           setCpf();
           getCpf();
           setEmail();
           getEmail();
           setCidade();
           getCidade();

      }
      static void login(){
      //chamar caso o usuário já for cliente
           HashMap <String,String> usuarios = new HashMap<>();
           usuarios.put(cpf, nomeCompleto);
           JOptionPane.showInputDialog(null, "LOGIN YourFarma\n Para finalizar a compra entre com seu login\nCPF");
           setCpf();
           getCpf();
           JOptionPane.showMessageDialog(null,"Seja bem vindo de volta! " + usuarios);
           
                
    }



   

}
    

