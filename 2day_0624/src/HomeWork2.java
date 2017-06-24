import java.util.Scanner;

public class HomeWork2 {

	public static double triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		if (isEnableTriangle(x1, y1, x2, y2, x3, y3) == true) {
			return Math.abs((x1*y2 + x2*y3 + x3*y1) - (x2*y1 + x3*y2 + x1*y3)) / 2;	
		}
		else return 0;
	}
	
	public static boolean isEnableTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		double z1;
		double z2;
		double z3;
		z1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		z2 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
		z3 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
		if ((z1+z2)>z3 && (z2+z3)>z1 && (z3+z1)>z2 ) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int x1 = a.nextInt();	
		int y1 = a.nextInt();	
		int x2 = a.nextInt();	
		int y2 = a.nextInt();	
		int x3 = a.nextInt();	
		int y3 = a.nextInt();	
		
		System.out.println("삼각형의 면적은" + triangle(x1, y1, x2, y2, x3, y3) +
				"입니다.");
		
	}
}
