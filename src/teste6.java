import java.util.*;
import java.io.*;

public class teste6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> resp = new ArrayList<>();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            Stack<Integer> pilha = new Stack<>();
            Queue<Integer> fila = new LinkedList<>();
            PriorityQueue<Integer> filaimport = new PriorityQueue<>(Collections.reverseOrder());

            boolean ehpilha = true;
            boolean ehfila = true;
            boolean ehfilaimport = true;

            for (int i = 0; i < n; i++) {
                int op = sc.nextInt();
                int valor = sc.nextInt();

                if (op == 1) {
                    pilha.push(valor);
                    fila.add(valor);
                    filaimport.add(valor);
                } else if (op == 2) {
                    if ((pilha.isEmpty()) || (fila.isEmpty()) || (filaimport.isEmpty())) {
                        ehpilha = ehfila = ehfilaimport = false;
                        continue;
                    }

                    if (pilha.pop() != valor) ehpilha = false;
                    if (fila.remove() != valor) ehfila = false;
                    if (filaimport.poll() != valor) ehfilaimport = false;
                }
            }

            if (ehpilha && !ehfila && !ehfilaimport)
                resp.add("stack");
            else if (!ehpilha && ehfila && !ehfilaimport)
                resp.add("queue");
            else if (!ehpilha && !ehfila && ehfilaimport)
                resp.add("priority queue");
            else if (!ehpilha && !ehfila && !ehfilaimport)
                resp.add("impossible");
            else
                resp.add("not sure");

        }

        for (String i : resp){
            System.out.println(i);
        }

        sc.close();
    }
}