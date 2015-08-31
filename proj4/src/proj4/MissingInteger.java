package proj4;

public class MissingInteger {

	
	
	public static void main(String[] args) {

		MissingInteger pme = new MissingInteger();
		int perm = pme.solution(new int[] { 1,3,6,4,1,2 });
		System.out.println("ktora-->" + perm);
	
	}
	
	
	
	
	
	
	int solution(int[] A) {
	    java.util.Arrays.sort(A);

			for (int i = 0; i < A.length - 1;) {
			
	        
	            if (A[i + 1] == A[i] + 1) {

	             i++;

	                } else if (A[i + 1] == A[i]) {
	    
	                     i++;
	                } else {

	                	return A[i];
	                }
	        
	        
	        
	        
			return A[i];

		}
			return -1;

}
}
