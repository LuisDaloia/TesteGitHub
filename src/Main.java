import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter with matrix dimension (line/column): ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int [][] mat = new int [M][N];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Enter with element (" + (i+1) + ", " + (j+1) +"): ");
				mat[i][j] = sc.nextInt();  
			}
		}
		
		System.out.println("Matrix: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Enter with element searched: ");
		int X = sc.nextInt();
		boolean exist = false;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == X) {
					
					exist = true;
					
					System.out.println("Position (" + (i+1) + ", " + (j+1) + "):");
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		if (exist == false) {
			System.out.println("Item not found!");
		}
		
		sc.close();
		
	}
}
