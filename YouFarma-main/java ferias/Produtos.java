
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

public class Produtos {

  public static ArrayList<Double> precos = new ArrayList<>();
  public static ArrayList<String> elementos = new ArrayList<>();
  public static ArrayList<Integer> elementoAdicionado = new ArrayList<>();
  public static ArrayList<Double> precoAdicionado = new ArrayList<>();

  public static int elementoAdd;

  // medicamentos
  public static void adicionarMedicamentos() {

    elementos.add("Paracetamol 20 comprimidos\n");
    precos.add(20.99);
    elementos.add("Prometazina 30 comprimidos\n");
    precos.add(29.99);
    elementos.add("Ibuprofeno gotas 20ml\n");
    precos.add(15.99);
    elementos.add("Antialérgico Koid D xarope 120ml\n");
    precos.add(35.59);
    elementos.add("Antiácido Sonrisal\n");
    precos.add(5.90);
    elementos.add("Xarope para tosse Vick \n");
    precos.add(33.00);
    elementos.add("Clorfeniramina\n");
    precos.add(5.99);

  }

  public static void mostrarMedicamentos() {
    String mensagem = "Lista Medicamentos\n ";

    // percorre os elementos e seus preços
    for (int i = 0; i < elementos.size(); i++) {
      String elemento = elementos.get(i);
      Double preço = precos.get(i);
      mensagem += "[" + i + "] " + elemento + "R$" + preço + "\n";
    }

    while (true) {
      String elementoSelecionado = JOptionPane.showInputDialog(null, mensagem +
          "Selecione a posição do seu produto, ou 'sair' para encerrar a compra");

      if (elementoSelecionado == null || elementoSelecionado.equalsIgnoreCase("sair")) {
        break; // Sai do loop se o usuário pressionar Cancelar ou digitar 'sair'
      }

      int elementoAdd = Integer.parseInt(elementoSelecionado);

      if (elementoAdd >= 0 && elementoAdd < elementos.size()) {
        elementoAdicionado.add(elementoAdd); // Adiciona o elemento correspondente ao ArrayList "elementoAdicionado"
        precoAdicionado.add(precos.get(elementoAdd)); // Adiciona o preço correspondente ao ArrayList "precoAdicionado"

        // Pergunta se o usuário deseja continuar comprando
        int continuarComprando = JOptionPane.showConfirmDialog(null,
            "Deseja continuar comprando?",
            "Continuar Comprando", JOptionPane.YES_NO_OPTION);

        if (continuarComprando == JOptionPane.NO_OPTION) {
          break; // Sai do loop se o usuário não desejar continuar comprando
        }
        if (continuarComprando == JOptionPane.YES_OPTION) {
          Farmacia.selecionarAba();
        }

      } else {
        JOptionPane.showMessageDialog(null, "Posição inválida.");
      }
    }
  }

  // ABA DEMOCOSMÉTICOS
  // adiciona produtos a aba de dermocosméticos
  public static void adicionarDermocosmeticos() {
    elementos.add("protetor sola fps50\n");
    precos.add(30.70);
    elementos.add("Loção hidratante Cerave 459ml\n");
    precos.add(105.90);
    elementos.add("Sérum anti-idade 30ml\n");
    precos.add(89.50);
    elementos.add("Sabonete gel de limpeza 30ml\n");
    precos.add(80.50);
    elementos.add("Shampoo Intensivo Hidratante 200ml\n");
    precos.add(89.50);
    elementos.add("Condicionador reequilibrante 200ml\n");
    precos.add(89.50);
    elementos.add("Sabonete faceal 30ml\n");
    precos.add(70.20);
  }

  public static void mostrarDermocosmeticos() {
    String mensagem = "Lista Dermocosméticos\n ";

    for (int i = 0; i < elementos.size(); i++) {
      String elemento = elementos.get(i);
      Double preço = precos.get(i);
      mensagem += "[" + i + "] " + elemento + "R$" + preço + "\n";
    }

    while (true) {
      String elementoSelecionado = JOptionPane.showInputDialog(null, mensagem +
          "Selecione a posição do seu produto, ou 'sair' para encerrar a compra");

      if (elementoSelecionado == null || elementoSelecionado.equalsIgnoreCase("sair")) {
        break; // Sai do loop se o usuário pressionar Cancelar ou digitar 'sair'
      }
      int elementoAdd = Integer.parseInt(elementoSelecionado);

      if (elementoAdd >= 0 && elementoAdd < elementos.size()) {
        elementoAdicionado.add(elementoAdd); // Adiciona o elemento correspondente ao ArrayList "elementoAdicionado"
        precoAdicionado.add(precos.get(elementoAdd)); // Adiciona o preço correspondente ao ArrayList "precoAdicionado"

        // Pergunta se o usuário deseja continuar comprando
        int continuarComprando = JOptionPane.showConfirmDialog(null,
            "Deseja continuar comprando?",
            "Continuar Comprando", JOptionPane.YES_NO_OPTION);
        if (continuarComprando == JOptionPane.NO_OPTION) {
          break; // Sai do loop se o usuário não desejar continuar comprando
        }
        if (continuarComprando == JOptionPane.YES_OPTION) {
          Farmacia.selecionarAba();
        }
      } else {
        JOptionPane.showMessageDialog(null, "Posição inválida.");
      }
    }
  }

  // ABA SAÚDE BELEZA
  // adicionar produtos à aba saúde e beleza
  public static void adicionarSaudeBeleza() {
    elementos.add("Desodorante Aerosol 150ml\n");
    precos.add(12.99);
    elementos.add("Pas de dentes tuti-fruti\n");
    precos.add(15.99);
    elementos.add("Band-aid infantil personagem\n");
    precos.add(20.90);
    elementos.add("Lenços de papel 10 unidades\n");
    precos.add(12.00);
    elementos.add("Termômetro plus\n");
    precos.add(40.99);
    elementos.add("Fio Dental 150cm\n");
    precos.add(18.00);
    elementos.add("Escova de dente\n");
    precos.add(20.00);
  }

  public static void mostrarSaudeBeleza() {
    // mostrar array
    String mensagem = "Lista Dermocosméticos\n ";

    for (int i = 0; i < elementos.size(); i++) {
      String elemento = elementos.get(i);
      Double preço = precos.get(i);
      mensagem += "[" + i + "] " + elemento + "R$" + preço + "\n";
    }

    while (true) {
      String elementoSelecionado = JOptionPane.showInputDialog(null, mensagem +

          "Selecione a posição do seu produto, ou 'sair' para encerrar a compra");

      if (elementoSelecionado == null || elementoSelecionado.equalsIgnoreCase("sair")) {
        break; // Sai do loop se o usuário pressionar Cancelar ou digitar 'sair'
      }

      int elementoAdd = Integer.parseInt(elementoSelecionado);

      if (elementoAdd >= 0 && elementoAdd < elementos.size()) {
        elementoAdicionado.add(elementoAdd); // Adiciona o elemento correspondente ao ArrayList "elementoAdicionado"
        precoAdicionado.add(precos.get(elementoAdd)); // Adiciona o preço correspondente ao ArrayList "precoAdicionado"
        // Pergunta se o usuário deseja continuar comprando
        int continuarComprando = JOptionPane.showConfirmDialog(null,
            "Deseja continuar comprando?",
            "Continuar Comprando", JOptionPane.YES_NO_OPTION);

        if (continuarComprando == JOptionPane.NO_OPTION) {
          break; // Sai do loop se o usuário não desejar continuar comprando
        }
        if (continuarComprando == JOptionPane.YES_OPTION) {
          Farmacia.selecionarAba();
        }
      } else {
        JOptionPane.showMessageDialog(null, "Posição inválida.");
      }
    }
  }
}
