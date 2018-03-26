import java.util.Scanner ;
class Division {
	
	public static int findDivisor(int a, int b){
		
		if (b != 0)
		       return findDivisor(b, a%b);
		    else 
		       return a;
		
	}
	
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Please enter the first value");
		
		int first = scan.nextInt() ;
		
		System.out.println("Please enter the second value");
		
		int second = scan.nextInt() ;
		
		System.out.println(findDivisor(first, second));
		
	}
	

}
