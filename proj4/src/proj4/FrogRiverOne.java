package proj4;

public class FrogRiverOne {
	
	public static void main (String[] args){
		
		FrogRiverOne fr = new FrogRiverOne();
		int tab = fr.solution (new int[]{1,3,1,4,2,3,5,4});
		int miejsce= fr.solution (5);
		System.out.println("sekunda-->"+ miejsce);
		
		
		
	}	
		
    public int solution(int X, int A[], int N){
			 int [] leaves = new int [N];
			 int [] skoki = new int [X];
			 
			 
			 
			 
			 for (int j = 0; j < X+1; j++) {
				 skoki[j]=0;
			 } 
		    
			 
			 
			 
			 
			 for (int i = 0; i < N; i++) {
				 int j = leaves[i];
				 skoki[j]=1;
				 
				 if (skoki[j]==1){
					 
					 return j;
				 }
				 
			 }
			 
			 
			
			
			 
		
		return X;	 
		}
}
	