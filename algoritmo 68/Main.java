import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String C;
        String A = "Vermelho";
        String B = "Azul";

        C = A;
        A = B;
        B = C;

       System.out.println("A = " + A + "\n" + "B = " + B);
    }
}