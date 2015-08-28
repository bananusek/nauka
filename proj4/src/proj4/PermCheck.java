package proj4;



public class PermCheck {

	public static void main(String[] args) {
	
		PermCheck pme = new PermCheck();
		int perm = pme.solution(new int[]{4,1,3});// powinno wyjsc 0
		System.out.println("czy jest? " + perm);
	
	
	
	}
	
	int solution(int A[]) {
	    
	    
	    
	    java.util.Arrays.sort(A);
	    
	    
	    
	    
	    for( int i=0; i< A.length -1 ; i++){
	        // tutaj w ogole przy i++ wyswietla sie komunikat ze jest to dead code :(? 
	        
	        if (A[i+1]== A[i] +1){
	        
	         //// tutaj nic
	        }
	        
	        ///jesli wszystkie tak to dawaj 1
	        
	        return 1;     
	    }
	    //jak nie to nie?
	     return 0;
	    
	    
	    
	} 
	
}
