package fundamentos.operadores;

public class DesafiosLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        // Se os dois trabalhos derem certo, comprar TV 50 polegadas
        // Se um dos trabalhos der certo, comprar TV 32 polegadas
        // Se nenhum dos trabalhos derem certo, não comprar TV
        boolean trabalho1 = true;
        boolean trabalho2 = true;
        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 || trabalho2;
        System.out.println("TV 50\": " + tv50);
        System.out.println("TV 32\": " + tv32);
        System.out.println("Sorvete: " + sorvete);

        trabalho1 = false;
        trabalho2 = false;
        tv50 = trabalho1 && trabalho2;
        tv32 = trabalho1 ^ trabalho2;
        sorvete = trabalho1 || trabalho2;
        System.out.println("TV 50\": " + tv50);
        System.out.println("TV 32\": " + tv32);
        System.out.println("Sorvete: " + sorvete);

        trabalho1 = true;
        trabalho2 = false;
        tv50 = trabalho1 && trabalho2;
        tv32 = trabalho1 ^ trabalho2;
        sorvete = trabalho1 || trabalho2;
        System.out.println("TV 50\": " + tv50);
        System.out.println("TV 32\": " + tv32);
        System.out.println("Sorvete: " + sorvete);

        trabalho1 = false;
        trabalho2 = true;
        tv50 = trabalho1 && trabalho2;
        tv32 = trabalho1 ^ trabalho2;
        sorvete = trabalho1 || trabalho2;
        System.out.println("TV 50\": " + tv50);
        System.out.println("TV 32\": " + tv32);
        System.out.println("Sorvete: " + sorvete);
    }
}
