package fact;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
    	try (// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in)) {
            int fact = 1;
            System.out.println("Introduce número");
            int num = teclado.nextInt();

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println("El factorial de " + num + " es " + fact);
        }
    }
}