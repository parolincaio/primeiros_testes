import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class teste5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> correto = new ArrayList<>();

        while (sc.hasNext()){
            String linha = sc.nextLine();
            Stack<Character> pilha = new Stack<>();
            boolean balanca = true;

            for (int i = 0; i < linha.length(); i++){
                char letra = linha.charAt(i);

                if (letra == '('){
                    pilha.push(letra);
                }
                else if (letra == ')'){
                    if (pilha.isEmpty()){
                        balanca = false;
                        break;
                    } else {
                        pilha.pop();
                    }
                }

            }

            if (!pilha.isEmpty()){
                balanca = false;
            }


            correto.add(balanca);
        }
        for (boolean i : correto){
            if (i){
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
        sc.close();
    }
}