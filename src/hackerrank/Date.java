package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Date {

	
	

	class Result {

	    /*
	     * Complete the 'findDay' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER month
	     *  2. INTEGER day
	     *  3. INTEGER year
	     */

	    public static String findDay(int month, int day, int year) {

	    	Calendar cal= Calendar.getInstance();
	        cal.set(2011, 2, 28);
	         int val = cal.get(Calendar.DAY_OF_WEEK);
	         System.out.println(val);
	    }

	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
