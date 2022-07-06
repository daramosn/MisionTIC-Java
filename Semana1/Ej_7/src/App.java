public class App {
    public static void main(String[] args) throws Exception {
        int a = 234242349;
        String b = (a % 2 == 0 ? "El número es par" : "El número es inpar");
        System.out.println(b);

        String palabra = "Hola Diego";

        System.out.println("---------------------------------");
        System.out.println(palabra.length());
        System.out.println(palabra.indexOf("e"));
        System.out.println(palabra.charAt(3));
        System.out.println(palabra.substring(1, 3));
        System.out.println(palabra.toLowerCase());
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.trim());

    }
}
