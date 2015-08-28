package proj4;



public class PermCheck {

	public static void main(String[] args) {
	
		PermCheck pme = new PermCheck();
		int perm = pme.solution(new int[]{4,3,1,2});
		System.out.println("czy jest? " + perm);
	
	
	
	}
	int solution(int A[], int N) {
	    
	    int b;
	    
	    java.util.Arrays.sort(A);
	    
	    for( int i=0; i< A.length ; i++){
	        
	        
	        if (A[i+1]== A[i] +1){
	        
	        
	        }
	        
	        
	        
	        
	    } 
	    return 1;   
	} 
	
}
