package projlekcja3;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv dv = new CountDiv();
		int div = dv.solution(6);
		System.out.println("w przedziale od A do B  " + div + " jest podzielnych przez K");
	}

	public int solution(int B) {
		int ile = 0;
		int [] tab = new int[B];
		for(int i=0; i<B ;i++){
		
		tab[i]=i+1;                    						/// to powinno nadac od 1,2,3,4,5,6,7,8,9,10,11
		}
		
		System.out.println("tablica to"+ tab);
		
		
		
		
		
		
		return ile;

	}

}
