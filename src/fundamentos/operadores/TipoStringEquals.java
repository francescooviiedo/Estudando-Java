package fundamentos.operadores;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("Bom dia" == "Bom dia");
        String s1 = new String("Bom dia");
        System.out.println("Bom dia" == s1);
        System.out.println("Bom dia".equals(s1));
    }
}
