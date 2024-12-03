//
// Ainsley Weaver
// CSCE 145 Section 021
//

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//First Matrix
		System.out.println("Welcome to the matrix adder program! Please enter the length and width of the first matrix:");
		int matrixLength1 = keyboard.nextInt();
		int matrixWidth1 = keyboard.nextInt();
		int[][] matrix1 = new int[matrixLength1][matrixWidth1];
		for (int i=0; i<matrixLength1; i++) {
			for (int j=0; j<matrixWidth1; j++) {
				System.out.println("Enter value at index " + i + j);
				matrix1[i][j] = keyboard.nextInt();
			}
		}
		//Second Matrix
		System.out.println("Please enter the length and width of the second matrix:");
		int matrixLength2 = keyboard.nextInt();
		int matrixWidth2 = keyboard.nextInt();
		int[][] matrix2 = new int[matrixLength2][matrixWidth2];
		for (int i=0; i<matrixLength2; i++) {
			for (int j=0; j<matrixWidth2; j++) {
				System.out.println("Enter value at index " + i + j);
				matrix2[i][j] = keyboard.nextInt();
			}
		}
		//displays each matrix	
		//first, checks to see if the dimensions are the same values
		if (matrixLength1==matrixLength2 && matrixWidth1==matrixLength2) {
			for (int i=0; i<matrixLength1; i++) {
				for (int j=0; j<matrixWidth1; j++ ) {
					//checks to see if value at that index is the first in the array
					if (j==0) {
						System.out.print("\n" + matrix1[i][j] + " ");
					}
					else {
						System.out.print(matrix1[i][j] + " ");
					}
				}
			}
			System.out.println("\n" + "+");
			for (int i=0; i<matrixLength2; i++) {
				for (int j=0; j<matrixWidth2; j++ ) {
					//checks to see if value at that index is the first in the array
					if (j==0) {
						System.out.print("\n" + matrix2[i][j] + " ");
					}
					else {
						System.out.print(matrix2[i][j] + " ");
					}
				}
			}
			System.out.println("\n" + "=");
			
			//calculates each index to create one total matrix
			int[][] matrixTotal = new int[matrixLength1][matrixWidth1];
			for (int i=0; i<matrixLength1; i++) {
				for(int j=0; j<matrixWidth1; j++) {
					//adds the values of matrix1(index) and matrix2(index), then sets the value at matrixTotal(index) to that added value
					matrixTotal[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
			for (int i=0; i<matrixLength2; i++) {
				for (int j=0; j<matrixWidth2; j++ ) {
					//checks to see if value at that index is the first in the array
					if (j==0) {
						System.out.print("\n" + matrixTotal[i][j] + " ");
					}
					else {
						System.out.print(matrixTotal[i][j] + " ");
					}
				}
			}
		}
		//if dimensions of both matrices are not the same, then the program cannot run
		else {
			System.out.println("Invalid Dimensions. These cannot be added.");
		}
		
	}

}
