package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of matrix rows: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the number of matrix columns: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n]; 
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Enter an integer value at position [%d][%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Which element's neighbors do you want to see? ");
		int element = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == element) {
					System.out.printf("Position %d,%d:%n", i, j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
