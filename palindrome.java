public class Main
{
	public static void main(String[] args) {
        System.out.print(digitCount(363));
	}
	
	   	static boolean digitCount(long n){
	   	    
		    long rev =0;
		    long temp=n;
		    while(temp!=0){
		        long l=temp%10;
		        rev=rev*10+l;
		        temp=temp/10;
		    }
		    return(rev==n);
		    
		}
	
	
}
