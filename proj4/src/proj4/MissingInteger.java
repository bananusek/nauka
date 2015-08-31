package proj4;

public class MissingInteger {

	
	
	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] { 1,3,6,4,1,2 });
		System.out.println("ktora-->" + perm);
	
	}
	
	
	
	
	
	
	int solution(int[] A) {
	    java.util.Arrays.sort(A);  // {1,1,2,3,4,6}
	 
			for (int i = 0; i < A.length - 1;) { // 2==1+1 to i=3, 3==2+1 to i=4, 4==3+1 to i==5,
			
	        
	            if (A[i + 1] == A[i] + 1) { 

	             i++;

	                } else if (A[i + 1] == A[i]) { //1==1  to i=2,
	    
	                     i++;
	                } else {    //6!==4+1  wtedy
	                	
	                	int brakujaca=A[i-1]+1; // 4+1=5
	                	
	                	return brakujaca; //5
	                }
	        
	        
	        
	        
			return 0;

		}
			return 0; /// wychodzi 0

}
}
