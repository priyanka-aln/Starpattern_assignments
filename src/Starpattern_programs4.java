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

public class Starpattern_programs4 {

	public static void main(String[] args) {
		
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
		
	}

}
