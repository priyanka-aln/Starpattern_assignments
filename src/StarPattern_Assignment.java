

public class StarPattern_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		
		for (int i = 0; i < n; i++) {

			for (int p = 0; p < n; p++) {

				if (i == 0 || p == 0 || i == (n) / 2 || (p == n - 1 && i <= n / 2))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");

			// R letter
			for (int r = 0; r < n; r++) {

				if (i == 0 || r == 0 || i == (n) / 2 || (r == n - 1 && i <= n / 2) || ((i == 3 * n / 4) && r == n / 2)
						|| (i == n - 1 && r == n - 1))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");

			// I letter
			for (int I = 0; I < n; I++) {

				if (i == 0 || I == n / 2 || i == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");

			// Y letter
			for (int j = 0; j < n; j++) {

				/* if ((i == j && j < n / 2) || (i == n / 4 && j == n - 2) || (i == 0 && j == n - 1)
						|| (i == n / 2 && j == n / 2) || (i == n - 2 && j == n / 2) || (i >= n - 1 && j == n / 2)) */
				if(i==j && i<=(n-1)/2  || i==(n-1)-j && i<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");

			// A letter
			for (int j = 0; j < n; j++) {

				if ((i == n / 2) || (i == n / 4 && j == n / 4) || (i == 0 && j == n / 2)
						|| (j == 3 * n / 4 && i == n / 4) || (i > n / 2 && j == 0) || (j == n - 1 && i > n / 2))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			// N letter
			for (int j = 0; j < n; j++) {

				if ((j == 0 && i <= n) || (j == n - 1 && i <= n) || (i == j))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			// K letter
			for (int j = 0; j < n; j++) {

				/*if ((j == 0 && i <= n) || (i == n / 4 && j == 3 * n / 4) || (i == 3 * n / 4 && j == 3 * n / 4)
						|| (j == n - 1 && i == 0) || (i == n - 1 && j == n - 1) || (i == n / 2 && j == n / 2)) */
				if( j==0 || (i<=(n-1)/2 && i==(n-2)-j) || (i>(n-1)/2 && i==j+1) )
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			// A letter
			for (int j = 0; j < n; j++) {

				if ((i == n / 2) || (i == n / 4 && j == n / 4) || (i == 0 && j == n / 2)
						|| (j == 3 * n / 4 && i == n / 4) || (i > n / 2 && j == 0) || (j == n - 1 && i > n / 2))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("    ");
			// INEURON - I letter
			for (int j = 0; j < n; j++) {

				if ((i == 0 && j <= n) || (i == n - 1 && j <= n) || (j == (n) / 2 && i <= n))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			// N letter
			for (int j = 0; j < n; j++) {

				if ((j == 0 && i <= n) || (j == n - 1 && i <= n) || (i == j))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			// E letter
			for (int j = 0; j < n; j++) {

				if ((i == 0 && j <= n) || (i == n - 1 && j <= n) || (j == 0 && i <= n) || (i == n / 2 && j <= n))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			// U letter
			for (int j = 0; j < n; j++) {

				if ((i <= n && j == 0) || (j == n - 1 && i <= n) || (i == n - 1 && j <= n))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			// R letter
			for (int r = 0; r < n; r++) {

				if (i == 0 || r == 0 || i == (n) / 2 || (r == n - 1 && i <= n / 2) || ((i == 3 * n / 4) && r == n / 2)
						|| (i == n - 1 && r == n - 1))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.print("  ");
			//O letter
			for (int j=0; j<n; j++) {
				if(i ==0 || j==0 || i==n-1 || j==n-1)
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			System.out.print("  ");
			// N letter
						for (int j = 0; j < n; j++) {

							if ((j == 0 && i <= n) || (j == n - 1 && i <= n) || (i == j))
								System.out.print("*");
							else
								System.out.print(" ");

						}
						System.out.println("  ");
			

		}
		
		
		

	}

}
