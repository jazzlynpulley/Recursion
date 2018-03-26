import java.util.Scanner;

class Palindrome {
	
	public static boolean check(String input){
		
		if (input.length() == 0 || input.length() == 1)
			return true ;
	
		if(input.charAt(0) == input.charAt(input.length()-1))
			return check(input.substring(1, input.length()-1)) ;
		
		return false ;
		
	}
	
	
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Please enter a word: ");
		String palindrome = scan.nextLine() ;
		
		if (check(palindrome))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
