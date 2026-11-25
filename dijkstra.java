import java.util.Scanner;

public class Dijkstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 5;
        int[][] grafo = new int[n][n];
        int[] distancia = new int[n];
        boolean[] visitando = new boolean[n];
        int origem, atual, menor;
        int i, j, v;

        int[][] matriz = {
            {0, 10, 0, 30, 100},
            {10, 0, 50, 0, 0},
            {0, 50, 0, 20, 10},
            {30, 0, 20, 0, 60},
            {100, 0, 10, 60, 0}
        };

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                grafo[i][j] = matriz[i][j];
            } // laco for de dentro
        } // laco for de fora

        System.out.println("\nALGORITMO DIJISKTRA");
        System.out.println("Verticais: 0, 1, 2, 3, 4");
        System.out.print("Informe o vertice de origem: ");
        origem = scanner.nextInt();

        for (i = 0; i < n; i++) {
            distancia[i] = 9999;
            visitando[i] = false;
        }

        distancia[origem] = 0;

        for (i = 0; i < n; i++) {
            menor = 9999;
            atual = -1;

            for (j = 0; j < n; j++) {
                if (!visitando[j] && distancia[j] < menor) {
                    menor = distancia[j];
                    atual = j;
                }

                if (atual == -1) {
                    break;
                }

                for (v = 0; v < n; v++) {
                    if (grafo[atual][v] > 0 && !visitando[v]) {
                        if (distancia[atual] + grafo[atual][v] < distancia[v]) {
                            distancia[v] = distancia[atual] + grafo[atual][v];
                        } // if de dentro
                    } // if de fora
                } // laco for de dentro
            } // laco for do meio
        } // laco for de fora

        System.out.println("\nMenores distancias " + origem + ":");
        for (i = 0; i < n; i++) {
            System.out.println("Vertice " + i + "=" + distancia[i]);
        }

        scanner.close();
    }
}
