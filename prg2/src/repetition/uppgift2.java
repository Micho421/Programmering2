package repetition;

public class uppgift2 {
	
	public static void main(String[] args) {
		
		String str = "TAOG eht si odlanoR";
		String reversed = reverseString(str);
		System.out.println(reversed);
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		
		if (str.isEmpty())
		return str;
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
}
