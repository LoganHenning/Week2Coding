package week2project;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 2;
		while (x <=100) {
			if (x % 2 == 0)
			System.out.println(x);
			x = x +1;
	//while loop for even numbers from 0 to 100
		}
		
		int y = 100;
		while (y<=100 && y>0) {
			System.out.println(y);
			y -= 3;
	//while loop for every 3rd number going backwards from 100 to 0
		}
		
		for (int z = 1; z <= 100; z += 2) {
			System.out.println(z);
	//for loop for every other number from 1 to 100
		}
		
		for (int n = 0; n<=100; n++) {
			if (n % 3 == 0 && n % 5 ==0)
				System.out.println("Hello World");
			else if (n % 3 == 0)
				System.out.println("Hello");
			else if (n % 5 == 0)
				System.out.println("World");
			else System.out.println(n);
				
			
		}
		}
		}
		
	
		
	
		
	


