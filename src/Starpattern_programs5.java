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
*
 * */

public class Starpattern_programs5 {

	public static void main(String[] args) {
		
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
