package hackerrank;

import java.util.Scanner;

public class javaLoops2 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int sum = a;
	            for (int k = 0; k < n; k++ ){
	             sum += (int) (b * Math.pow(2, k));
	             System.out.print(sum + " ");
	            }
	            System.out.println();
	        }
	        in.close();

	}

}
