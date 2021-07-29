package codingbat;

public class StringQuestion {
    /*
	Given two strings, return true if either of the strings appears at the very end of the other string, 
	ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
	Note: str.toLowerCase() returns the lowercase version of a string.

			endOther("Hiabc", "abc") → true
			endOther("AbC", "HiaBc") → true
			endOther("abc", "abXabc") → true
	                                               */
	public static void main(String[] args) {
		
		System.out.println(endOther("Hiabc", "abc"));

	}
	public static boolean endOther(String a, String b) {
		  
		if((b.toLowerCase().contains(a.toLowerCase())) && ((b.toLowerCase().charAt(b.length() - 1) == 
				(a.toLowerCase().charAt(a.length() -1))))){
			    return true;
		}else if((a.toLowerCase().contains(b.toLowerCase())) && ((a.toLowerCase().charAt(a.length() - 1) == 
				(b.toLowerCase().charAt(b.length() -1)))))
			{return true;
	     }else {
			return false;
		}

		  
	}
	

}
