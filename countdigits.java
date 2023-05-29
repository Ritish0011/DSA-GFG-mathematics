public class Main
{
	public static void main(String[] args) {

		System.out.println(digitCount(123));
	}
	
	   	static int digitCount(long n){
		    
		    int count =0;
		    while(n!=0){
		        n=n/10;
		        count++;
		    }
		    return count;
		}
	
	
}
