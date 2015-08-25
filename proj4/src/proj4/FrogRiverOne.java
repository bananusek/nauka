package proj4;

public class FrogRiverOne {
	
	public static void main (String[] args){
		
		FrogRiverOne fr = new FrogRiverOne();
		int tab = fr.solution (new int[]{1,3,1,4,2,3,5,4});
		int miejsce= fr.solution (5);
		System.out.println("sekunda-->"+ miejsce);
		
		
		
	}	
		
		 public int solution(int X, int A[], int N){
			 int sek;
			 int n;
			 n=A.length;
			 int[] leaves= new int [n];
			 
			 for (int i = 0; i < n; i++) {
				 
				 if(leaves[i]>=miejsce){
					
					 sek=i;
				 
				 }
				 
				 
				
			}
			
			
			
			
		return sek;	
		}
		
		
	

}
