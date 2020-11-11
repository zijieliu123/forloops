package snippet;

import java.util.Scanner;

public class forloops{
	private Scanner in = new Scanner(System.in);
	public void table() {
		
		
		for (int count = 1; count < 13; count++) {
			
			for (int count2 = 1; count2 < 13; count++) {
				System.out.println(count*count2 + "");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public void nmtonum() {
		
		for (int count = 1; count < 6; count += count+ 1) {
			
			System.out.println(count);
			
		}
		
	}
	
	public void riddle(int answer) {
		
		answer = in.nextInt();
		
		while (answer != 10) {
			
			System.out.println("try again");
		}
		
	}
	
	public void atoz() {
		
		char A;
		
		for (A = 'a'; A <= 'z'; A++) {
			System.out.println(A);
			
		}
		
	}
	
	public void stars() {
	
	
		for (int n = 0; n < 10; n++) {
			for (int l = 0; l < 5; l++) {
				
				System.out.println("X" + "");
			}
				
			
		}
		
	}
	
	
	
}

