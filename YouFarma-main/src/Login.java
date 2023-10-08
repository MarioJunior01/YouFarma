import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login  {

  public static void entrada() {
    String escolha = JOptionPane.showInputDialog(null,
        "Para finalizar a compra, precisaremos de alguns de seus dados.\n Você já possui cadastro na farmácia?\n Digite S para sim, N para não");

    switch (escolha.toLowerCase()) {
      case "s":
        login();
        break;
      case "n":
        Cadastro.dadosCliente();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha S ou N.");
    }
  }

  public static void login() {
    JPanel panel = new JPanel(new GridLayout(2, 2));
    JTextField cpf = new JTextField();
    JTextField senha = new JTextField();
    
    panel.add(new JLabel("CPF:"));
    panel.add(cpf);
    panel.add(new JLabel("Senha:"));
    panel.add(senha);

    String cpfUsuario = ""; 
    String senhaUsuario = "";
    
    while (true) {
      int result = JOptionPane.showConfirmDialog(null, panel, "Informe seu CPF para realizar o login\nInforme sua senha",
          JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
         cpfUsuario = cpf.getText();
         senhaUsuario = senha.getText();
        if (cpfUsuario.isEmpty() || senhaUsuario.isEmpty()) {
          JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!");
        } else {
          break;
        }
      } else {
        // O usuário cancelou o diálogo
        return; // Sair do método
      }
    }
    
    // Move o bloco try para fora do loop while
    boolean credenciaisValidas = false;
    try (BufferedReader reader = new BufferedReader(new FileReader("dados_usuario.csv"))) {
        String line;

        while ((line = reader.readLine()) != null) {
            // Dividir a linha em campos usando ":" como delimitador
            String[] campos = line.split("CpfUsuario:"+"SenhaUsuario:");

            // Verificar se as credenciais correspondem aos dados no arquivo CSV
            if (campos.length >= 2 && campos[2].trim().equals(cpfUsuario) && campos[5].trim().equals(senhaUsuario)) {
                credenciaisValidas = true;
                break;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    if (credenciaisValidas) {
      JOptionPane.showMessageDialog(null, "Login bem-sucedido! Você está logado em sua conta.");
  } else {
      JOptionPane.showMessageDialog(null, "Credenciais inválidas. O login falhou.");
  }
  }
}

