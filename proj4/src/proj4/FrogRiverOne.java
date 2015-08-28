package proj4;

public class FrogRiverOne {

	public static void main(String[] args) {

		FrogRiverOne fr = new FrogRiverOne();
		int tab = fr.solution(4, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 });

		System.out.println("sekunda-->" + j);

	}

	public int solution(int X, int A[]){
			 int [] leaves = new int [N];
			 int [] skoki = new int [X];
			 
			 
			 
			 
			 for (int j = 0; j < X; j++) {
				 skoki[j]=0;
			 } 
		    ////// wszedzie 0000000
			 
			 
			 
			 
			   /// leaves[1]=3    j=3
			 
			 
			 
			 for (int i = 0; i < A.length; i++) {
				 
				 int j = leaves[i];/// leaves[1]=3    j=3
				
				 skoki[j]=1;  //skoki[3]=1
				 
				 for (j = 0; j < A.length; j++) {
					 
						
						if (skoki[j]==1){  // 
							 
							 return 1;
						 
						
						 }
				 }
				 
			 
			 
			 
			
			 
		
		return j;	 
		}
}
}
