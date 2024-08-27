import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.print("Digite algo: " + nome);
        input.close();
    }
}
