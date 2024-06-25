package javaTasks;

public class Example2 {
	
	/**
	 * Write a java program to get highest value among the given numbers.
	 *103, 409, 455, 201, 450
     *Note: use conditional operator(?:).
	 */
	
    public static void main(String[] args) {
        int a = 103;
        int b = 409;
        int c = 455;
        int d = 201;
        int e = 450;

        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        max = (max > d) ? max : d;
        max = (max > e) ? max : e;

        System.out.println("The highest value is: " + max);
    }
}

