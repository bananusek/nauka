

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
    		int roznica;
    		int poprzednia;
 
    		for (int i = 0; i < A.length; i++) {
        		
    		suma = suma + A[i];
    		}
    		
    		roznica=0;
    		int i;		
        	while  (i < A.length+1) {
        		roznica=poprzednia;
        		L=L+A[i];
        		P=suma-L;
        		roznica=P=L;
        		if(roznica<poprzednia){
        			poprzednia=roznica;
        			return roznica;
        		}

    		
    		return 0;
    		
    		
    	}
}