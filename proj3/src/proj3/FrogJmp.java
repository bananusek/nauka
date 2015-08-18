package proj3;


public class FrogJmp 
{
	public static void main(String[] args){
		
		FrogJmp fj = new FrogJmp();
		int skok = fj.solution (new int  10, 85,30);
		System.out.println("skoczy " + skok + "razy");
		
		
		}
		
		
		class Solution {
		    public int solution(int X, int Y, int D) {
		        // write your code in Java SE 8
		    	
		    	int jump;
		    	
		    	jump=(Y-X)/D;
		    	
		    	jump=jump+1;
		    	
		    	
		    	return jump;
		    	}
		
		
		
		
		
		
		    	return 0;	
			}

}
