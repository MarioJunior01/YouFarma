import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;




public class Cadastro {
         public static File arquivo= new File("dados_usuario.csv");
    public static ArrayList<String> dadosUsuario = new ArrayList<>();


     public static void dadosCliente() {
    // Verifique se o arquivo já existe
    boolean arquivoExiste = arquivo.exists();
    JPanel panel = new JPanel(new GridLayout(7,5)); // Usei 7,5 para corresponder aos campos que você tem
    JTextField nome = new JTextField();
    JTextField endereco = new JTextField();
    JTextField cpf = new JTextField();
    JTextField email = new JTextField();
    JTextField cidade = new JTextField();
              JTextField senha = new JTextField();


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
    panel.add(new JLabel("Senha:"));
    panel.add(senha);

    while (true) {
        int result = JOptionPane.showConfirmDialog(null, panel, "Informe os dados", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            // Obtenha os valores dos campos
            String Nome = nome.getText();
            String Cpf =cpf.getText();
            String Email = email.getText();
            String Endereco = endereco.getText();
            String Cidade = cidade.getText();
            String Senha = senha.getText();

            // Verifique se algum dos campos obrigatórios está vazio
            if (Cpf.isEmpty() || Email.isEmpty() || Cidade.isEmpty() || Nome.isEmpty() || Endereco.isEmpty() || Senha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
                continue;
            }
           

            // Todos os campos obrigatórios foram preenchidos
            String mensagem =  "Confirme suas informações abaixo:" +
                    "\nNome:" + Nome +
                    "\nEndereço (Rua e número): " + Endereco +
                    "\nCPF: " + Cpf +
                    "\nEmail: " + Email +
                    "\nCidade/Região: " + Cidade;
            JOptionPane.showConfirmDialog(null, mensagem, "Cadastro finalizado!", JOptionPane.INFORMATION_MESSAGE);
            else{
                Pagamento.pagamento();
            }

            // Agora, escreva os dados no arquivo
            try { 

                FileWriter escrever = new FileWriter(arquivo, true); // O segundo parâmetro true indica que você quer acrescentar ao arquivo, não substituir.
                escrever.write(" NomeUsuario:" +nome.getText()+
                 "\nCpfUsuario:"+cpf.getText()+
                 "\nEndercoUsuario:"+endereco.getText() +
                 "\nEmailUsuario:"+email.getText()+ 
                 "\nCidadeUsuario:"+cidade.getText()+
                 "\nSenhaUsuario:"+senha.getText());
                 escrever.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }


            break;
        }
    }
}
}

