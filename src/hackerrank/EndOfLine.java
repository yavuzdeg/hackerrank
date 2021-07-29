package hackerrank;

import java.util.Scanner;

public class EndOfLine {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        int counter = 1;
	        String str;
	        
	        
	        while(scan.hasNext()) {
	        
	            str = scan.nextLine();
	            System.out.println(counter + " " + str);
	            counter++;
	                        
	        }
	        
	        
	        scan.close();
	            }

	}


