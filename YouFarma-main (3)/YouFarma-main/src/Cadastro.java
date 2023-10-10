import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.io.*;
import java.text.ParseException;

//import java.util.ArrayList;

public class Cadastro {
    public static File arquivo = new File("dados_usuario.csv");
    // public static ArrayList<String> dadosUsuario = new ArrayList<>();

    public static void dadosCliente() throws ParseException {
        // Usei 7,5 para corresponder aos campos que você tem
        JPanel panel = new JPanel(new GridLayout(20, 10));
        JTextField nome = new JTextField();
        JTextField cep = new JFormattedTextField(new MaskFormatter("#####-###"));
        //JTextField cep = new JTextField(); 
        JTextField numeroDacasa = new JTextField();
        JTextField cpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        //JTextField cpf = new JTextField();
        JTextField email = new JTextField();
        JTextField cidade = new JTextField();
        JTextField senha = new JPasswordField();
        JTextField confimesenha = new JPasswordField();

        panel.add(new JLabel("Nome Completo:"));
        panel.add(nome);
        panel.add(new JLabel("CEP (Código de Endereçamento Postal):"));
        panel.add(cep);
        panel.add(new JLabel("CPF:"));
        panel.add(cpf);
        panel.add(new JLabel("n°"));
        panel.add(numeroDacasa);
    
        panel.add(new JLabel("Email:"));
        panel.add(email);
        panel.add(new JLabel("Cidade/Região:"));
        panel.add(cidade);
        panel.add(new JLabel("Senha de 6 digitos numéricos:"));
        panel.add(senha);
        panel.add(new JLabel("confirme sua senha "));
        panel.add(confimesenha);
        while (true) {
            int result = JOptionPane.showConfirmDialog(null, panel, "Informe os dados", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                // Obtenha os valores dos campos
                String Nome = nome.getText();
                String Cpf = cpf.getText();
                String Email = email.getText();
                String CEP = cep.getText();
                String Cidade = cidade.getText();
                String Senha = senha.getText();
                String NumeroCasa = numeroDacasa.getText();
                String Confirmesenha = confimesenha.getText();
                System.out.println(CEP);
                // Verifique se algum dos campos obrigatórios está vazio

                if (Cpf.isEmpty() || Email.isEmpty() || Cidade.isEmpty() || Nome.isEmpty() || CEP.isEmpty()
                        || NumeroCasa.isEmpty() || Senha.isEmpty() || Confirmesenha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
                    continue;
                }

                // Todos os campos obrigatórios foram preenchidos
                String mensagem = "Confirme suas informações abaixo:" +
                        "\nNome:" + Nome +
                        "\nCEP: " + CEP
                        + "\nCPF: " + Cpf +
                        "\n Numero da recidencia:" +
                        "\nEmail: " + Email +
                        "\nCidade/Região: " + Cidade;
                int escolha = JOptionPane.showConfirmDialog(null, mensagem, "Cadastro finalizado!",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                
                        

                if (!(Confirmesenha.equals(Senha))) {
                    JOptionPane.showMessageDialog(null, "confirme sua senha corretamente");
                    continue;
                }

                if (escolha != JOptionPane.YES_OPTION) {
                    continue;
                }

                // Agora, escreva os dados no arquivo
                try {
                    arquivo.createNewFile();
                    FileWriter escrever = new FileWriter(arquivo, true); // O segundo parâmetro true indica que você
                                                                         // quer acrescentar ao arquivo, não
                                                                         // substituir.
                    escrever.write(Nome + ",");
                    escrever.write(Email + ",");
                    escrever.write(CEP + ",");
                    escrever.write(Cidade + ",");
                    escrever.write(Cpf + ",");
                    escrever.write(Senha + ",");
                    escrever.write(NumeroCasa + ",");
                    escrever.close();
                } catch (IOException e) {
                    System.out.println("os dados nâo foram escritos");
                    e.printStackTrace();
                }

                Pagamento.pagamento();

                break;
            }
        }
    }
}
