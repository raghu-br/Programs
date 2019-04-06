import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		float p, t, r;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		p = s.nextFloat();
		System.out.println("Enter the Rate of Interest: ");
		r = s.nextFloat();
		System.out.println("Enter the Time Period: ");
		t = s.nextFloat();
		float si;
		si = (p * t * r) / 100;
		System.out.println("The Simple Interest is: " + si);
	}// main()
}// class
