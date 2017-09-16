
public class LoopPractice {

	public static void practiceWhileLoop() {
		int x = 0;
		while(x < 5) {
			System.out.println("The Value of X is " +x);
			x++;
		}
	}
	
	public static void practiceDoWhileLoop() {
		int x = 0;
		do {
			System.out.println("The Value of X is " + x);
			x++;
		}while (x < 10);
	}
	
	public static void practiceForLoop() {
		for(int x=0; x<10; x++) {
			for(int y = 0; y<10; y++) {
			 	System.out.println("("+x+","+y+")");
			}
		}
		System.out.println("This is the end!");
	}
	
	public static void main (String[] args)
	{
		System.out.println("practiceWhileLoop!");
		practiceWhileLoop();
		System.out.println("practiceDoWhileLoop!");
		practiceDoWhileLoop();
		System.out.println("practiceForLoop!");
		practiceForLoop();

	}
}