package controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
        System.out.println(numero % 2 == 0 ? "Número par!" : "Número ímpar!");
    }
}