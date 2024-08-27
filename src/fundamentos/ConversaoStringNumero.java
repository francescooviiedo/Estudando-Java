package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = "10";
        int valor2 = Integer.parseInt(valor1);
        System.out.println(valor2 + 10);

        String valor3 = "10.5";
        double valor4 = Double.parseDouble(valor3);
        System.out.println(valor4 + 10);

        String valor5 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor6 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double sum = Double.parseDouble(valor5) + Double.parseDouble(valor6);
        System.out.println("A soma é " + sum);
    }
}
