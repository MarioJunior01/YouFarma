import java.awt.GridLayout;
import java.io.*;
import java.text.ParseException;

import javax.swing.*;

public class Login {
  static String cpfUsuario = "";
  static String senhaUsuario = "";

  public static void entrada() {
    String escolha = JOptionPane.showInputDialog(null,
        "Para finalizar a compra, precisaremos de alguns de seus dados.\n Você já possui cadastro na farmácia?\n Digite S para sim, N para não");

    switch (escolha.toLowerCase()) {
      case "s":
        login();
        lerLogin();
        break;
      case "n":
        try {
          Cadastro.dadosCliente();
        } catch (ParseException e) {

          e.printStackTrace();
        }
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha S ou N.");
    }
  }

  public static void login() {
    JPanel panel = new JPanel(new GridLayout(2, 2));
    JTextField cpf = new JTextField();
    JTextField senha = new JPasswordField();

    panel.add(new JLabel("CPF:"));
    panel.add(cpf);
    panel.add(new JLabel("Senha:"));
    panel.add(senha);

    while (true) {
      int resultado = JOptionPane.showConfirmDialog(null, panel,
          "Informe seu CPF para realizar o login\nInforme sua senha",
          JOptionPane.OK_CANCEL_OPTION);
      if (resultado == JOptionPane.OK_OPTION) {
        cpfUsuario = cpf.getText();
        senhaUsuario = senha.getText();
        if (cpfUsuario.isEmpty() || senhaUsuario.isEmpty()) {
          JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente!");
        } else {
          break;
        }
      } else {

        return; // Sair do método
      }
    }
  }

  static void lerLogin() {
    boolean credenciaisValidas = false; // Inicialize como false
    try (BufferedReader reader = new BufferedReader(new FileReader("dados_usuario.csv"))) {
      String leitura;

      while ((leitura = reader.readLine()) != null) {
        String[] campos = leitura.split(",");

        // Verificar se as credenciais correspondem aos dados no arquivo CSV
        if (campos.length >= 2 && campos[4].trim().equals(cpfUsuario) && campos[5].trim().equals(senhaUsuario)) {
          credenciaisValidas = true;
          break;
        }
      }

      if (credenciaisValidas) {
        JOptionPane.showMessageDialog(null, "Login bem-sucedido! Você está logado em sua conta.");
        Pagamento.pagamento();
      } else {
        JOptionPane.showMessageDialog(null, "Credenciais inválidas. O login falhou.");

      }

    } catch (IOException ex) {
      System.out.println("os dados não foram lidos");
      ex.printStackTrace();
    }
  }
}