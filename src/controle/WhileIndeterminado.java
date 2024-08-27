package controle;
import java.util.Scanner;

public class WhileIndeterminado {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;

            do {
                System.out.print("Write something (type 'sair' to exit): ");
                input = scanner.nextLine();
            } while (!input.equalsIgnoreCase("sair"));

            scanner.close();
        }
    }

