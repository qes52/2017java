public class Exercise1 {

	public static int Max(int x, int y) {
		if (x > y) {
			return x;
		} else if (y > x) {
			return y;
		} else return 0;
	}
	
	public static double Max(double x, double y) {
		if (x > y) {
			return x;
		} else if (y > x) {
			return y;
		} else return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("4�� 3 �� ū ���� " + Max(4,3) + "�Դϴ�.");
		System.out.println("5.5�� 5.2 �� ū ���� " + Max(5.5,5.2) + "�Դϴ�.");
	}
}
