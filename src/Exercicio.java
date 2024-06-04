public class Exercicio {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        boolean true_false;

        true_false = (j < 5);            // falso
        System.out.println(true_false);

        true_false = (j > 3);            // verdadeiro
        System.out.println(true_false);

        true_false = (j < i);            // falso
        System.out.println(true_false);

        true_false = (i < 5);            // verdadeiro
        System.out.println(true_false);

        true_false = (j <= 5);           // falso
        System.out.println(true_false);

        true_false = (6 < 6);            // falso
        System.out.println(true_false);

        true_false = (i != j);           // verdadeiro
        System.out.println(true_false);

        true_false = (i == j || i < 50); // verdadeiro
        System.out.println(true_false);

        true_false = (i == j && i < 50); // falso
        System.out.println(true_false);

        true_false = (i > j || true_false && j >= 4); // verdadeiro
        System.out.println(true_false);

        true_false = (!(i < 2 && j == 5)); // verdadeiro
        System.out.println(true_false);

        true_false = !true_false;        // falso
        System.out.println(true_false);
    }
}
