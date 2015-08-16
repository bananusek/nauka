

class TapeEquilibrium {
    
    	public static void main(String[] args) {
    		
    		TapeEquilibrium te = new TapeEquilibrium();
    		int najmniejsza = te.solution(new int[]{3,1,2,4,3});
    		System.out.println("najmniejsza -> " + najmniejsza);
    }
    	
    	public int solution(int[] A)
    	{
    		int L;
    		int P;
    		int suma;
    		
    		for (int i = 0; i < A.length; i++) {
        		
    		suma = suma + A[i];
    		}
   
        	while (i < A.length+1) {
        		
        		L=L+A[i];
        		P=suma-L;	
        				
        		}
        	return 0;
    		
    		
    		
    		
    		
    		
    		
    	}
}