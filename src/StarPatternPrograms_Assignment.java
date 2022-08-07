

public class StarPatternPrograms_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 0; i < n; i++) {

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
			// O letter
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
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
		// To print extra spaces
		System.out.println("  ");
		System.out.println("  ");
		
/*
 program 2
1 1 1 1  
2 2 2 2  
3 3 3 3  
4 4 4 4

* */
		
		int range = 4;

		for (int i = 1; i <= range; i++) {

			for (int j = 1; j <= range; j++) {

				System.out.print(i);
				System.out.print(" ");
			}

			System.out.println(" ");
		}
		// To print extra spaces
				System.out.println("  ");
				
		
		/* Program 3

		**************
		******* ****** 
		******   ***** 
		*****     **** 
		****       *** 
		***         ** 
		**           * 
		*            * 
		*            * 
		*            * 
		*            * 
		*            * 
		*            * 
		************** 
		*
		 * */
		
		int r = 14;
		
		for(int i=0; i<r; i++) {
			
			for (int j=0; j<r; j++) {
				
				if(i == 0 || j ==0 || i==r-1 || j==r-1 || (i+j)<=r/2 || (j-i)>=r/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println(" ");
		}
		
		// To print extra spaces
		System.out.println("  ");
		
		/* Program 4

        
        
        
        
        
        
		*              
		**           * 
		***         ** 
		****       *** 
		*****     **** 
		******   ***** 
		******* ****** 
		************** 
		*
		 * */
		
		int x = 14;
		
		for(int i=0; i<x; i++) {
			
			for (int j=0; j<x; j++) {
				
				if(i==x-1 || (i-j)>=(x-1)/2 || (i+j)>=x+(x-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println(" ");
		}
		
		// To print extra spaces
				System.out.println("  ");
		
		/* Program 5
		************** 
		******         
		*****          
		****           
		***            
		**             
		*              
		**             
		***            
		****           
		*****          
		******         
		*******        
		************** 
		
		 * */
		
		int y = 14;
		
		for(int i=0; i<y; i++) {
			
			for (int j=0; j<y; j++) {
				
				if(i==0 || i==y-1 || (i-j)>=(y-1)/2 || (i+j)<=(y-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println(" ");
		}

	

	}

}
