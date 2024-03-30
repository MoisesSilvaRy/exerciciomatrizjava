package exerciciomatriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        boolean found = false;

		System.out.println("Digite as linhas da matriz: ");
		int m = sc.nextInt();
		System.out.println("Digite as colunas da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		System.out.println("Digite os numeros que entraram na matriz: ");
		for(int i=0; i<mat.length; i++) {
		    for(int j=0; j<mat[i].length; j++) {
		    	mat[i][j] = sc.nextInt();
	
		       
		    }
		 }
		System.out.println("Digite o numero a ser encontrado na matriz: ");
		int x = sc.nextInt();
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Valor encontrado: " + x);
                    if (i > 0) {
                        System.out.println("Valor acima: " + mat[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Valor à esquerda: " + mat[i][j - 1]);
                    }
                    if (i < m - 1) {
                        System.out.println("Valor abaixo: " + mat[i + 1][j]);
                    }
                    if (j < n - 1) {
                        System.out.println("Valor à direita: " + mat[i][j + 1]);
                    }
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Valor não encontrado na matriz.");
        }
	}
}


