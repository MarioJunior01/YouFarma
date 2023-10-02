import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Cadastro {

     public static void dadosCliente() {
          JPanel panel = new JPanel(new GridLayout(5, 2)); // Usei 5,2 para corresponder aos campos que você tem
          JTextField nome = new JTextField();
          JTextField endereco = new JTextField();
          JTextField cpf = new JTextField();
          JTextField email = new JTextField();
          JTextField cidade = new JTextField();

          panel.add(new JLabel("Nome:"));
          panel.add(nome);
          panel.add(new JLabel("Endereço:"));
          panel.add(endereco);
          panel.add(new JLabel("CPF:"));
          panel.add(cpf);
          panel.add(new JLabel("Email:"));
          panel.add(email);
          panel.add(new JLabel("Cidade/Região:"));
          panel.add(cidade);

          while (true) {

               // Exibe o JOptionPane com o painel personalizado
               int result = JOptionPane.showConfirmDialog(null, panel, "Informe os dados",
                         JOptionPane.OK_CANCEL_OPTION);

               // Verifique se o usuário pressionou OK
               if (result == JOptionPane.OK_OPTION) {
                    // Obtenha os valores dos campos
                    String nomeUsuario = nome.getText();
                    String enderecoUsuario = endereco.getText();
                    String cpfUsuario = cpf.getText();
                    String emailUsuario = email.getText();
                    String cidadeUsuario = cidade.getText();

                    // Verifique se algum dos campos obrigatórios está vazio
                    boolean cadastroCompleto = false;

                    if (nomeUsuario.isEmpty() || enderecoUsuario.isEmpty() || emailUsuario.isEmpty()
                              || cidadeUsuario.isEmpty()) {
                         JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");

                    }

                    else {
                         // Todos os campos obrigatórios foram preenchidos, faça algo com os valores
                         String mensagem = "Confirme suas informações abaixo:\n" +
                                   "Nome: \n" + nomeUsuario + "\nEndereço (Rua e número): " + enderecoUsuario
                                   + "\nCPF:\n "
                                   + cpfUsuario +
                                   "\nEmail:\n " + emailUsuario + "\nCidade/Região:\n " + cidadeUsuario;
                         JOptionPane.showMessageDialog(null, mensagem + "\nCadastro finalizado com sucesso!\n");
                         break;
                    }
               }
          }
     }
}
