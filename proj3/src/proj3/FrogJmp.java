package proj3;


public class FrogJmp 
{
	public static void main(String[] args){
		
		FrogJmp fj = new FrogJmp();
		int skok = fj.solution (new int 10 ,85, 30);//tu chyba jest coœ nie tak przeciesz 10 i 85 to inty?
		System.out.println("skoczy" + skok + "razy");
		
		
		}
		
		
		class Solution {
		    public int solution(int X, int Y, int D) {
		        
		    	
		    	int jump;
		    	int reszta;
		    	
		    	jump=(Y-X)/ D;
		    	reszta=(Y-X)% D;
		    	if (reszta != 0) {
		    	
		    	jump=jump+1;
		    	
		    	}
		    	
		    	return jump;
		    	
		    }

}
}