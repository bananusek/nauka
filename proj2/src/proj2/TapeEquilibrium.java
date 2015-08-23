

class TapeEquilibrium {
    
    	public static void main(String[] args) {
    		
    		TapeEquilibrium te = new TapeEquilibrium();
    		int najmniejsza = te.solution (new int[]{3,1,2,4,3});
    		System.out.println("najmniejsza -> " + najmniejsza);
    }
    	

    	class Solution {
    	    public int solution(int[] A) {
    	        // write your code in Java SE 8
    	        int L =0;
    	    		int P;
    	    		int suma =0 ;
    	    		int roznica =0;
    	    		int poprzednia=Integer.MAX_VALUE;
    	 
    	    		for (int i = 0; i < A.length; i++) {
    	        		
    	    		suma = suma + A[i];
    	    		}
    	    		
    	    		int i=0;		
    	        	while  (i < A.length) {
    	        		roznica=poprzednia;
    	        		L=L+A[i];
    	        		P=suma-L;
    	        		roznica=Math.abs(P-L);
    	        		if(roznica<poprzednia){
    	        			poprzednia=roznica;
    	        		}
    	        		i++;
    	        	}
    	        			return poprzednia;
    	        
    	        	
    	    		
    	    	
    	    }
    	}
}
