public class matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[12][12];

        // Preenchendo a matriz só para exemplo
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = i + j; // qualquer lógica de preenchimento
            }
        }

        // Escolhendo a coluna
        int coluna = 5;
        int soma = 0;

        // Percorrendo todas as linhas, mas fixando a coluna
        for (int i = 0; i < 12; i++) {
            soma += matriz[i][coluna];
        }

        double media = (double) soma / 12;
        System.out.println("Média da coluna " + coluna + ": " + media);
    }
}


/*
// Criando matriz 12x12
let matriz = [];

// Preenchendo a matriz
for (let i = 0; i < 12; i++) {
    matriz[i] = []; // cria uma linha
    for (let j = 0; j < 12; j++) {
        matriz[i][j] = i + j; // só um exemplo
    }
}

// Imprimindo a matriz
for (let i = 0; i < 12; i++) {
    console.log(matriz[i].join("\t")); // imprime cada linha formatada
}

 */
