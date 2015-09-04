package proj1;

public class PermMissingElem {

	public static void main(String[] args) {
		PermMissingElem pme = new PermMissingElem();
		int brakujaca = pme.solution(new int[]{2,3,1,5});
		System.out.println("brakujaca -> " + brakujaca);
	}
	
    public int solution(int[] A) {
    	int[] tab = new int [A.length+2];
    	for (int i = 0; i < A.length; i++) {
    		
			tab[A[i]]=1;
		}
    	
    	for(int i = 1; i < tab.length; i++)
    		
    	{ if (tab[i] == 0) {
    		return i;
    	}
    		
    	}
    	
    	return 0;
    }
}
