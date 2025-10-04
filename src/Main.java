import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();

        while(sc.hasNext()) {
            if (sc.hasNextDouble()) {
                numeros.add(sc.nextDouble());
            } else {
                String entrada = sc.next();
                if (entrada.equalsIgnoreCase("x")) break;
                else System.out.println("Entrada Inválida");
            }
        }

        sc.close();

        for (double i: numeros) {
            System.out.println("X[i] = " + i);
        }
    }


}
