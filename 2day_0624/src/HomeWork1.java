import java.util.Scanner;

public class HomeWork1 {

	public static void isEnableTriangle(int x, int y, int z) {
		if ((x+y)>z && (y+z)>x && (z+x)>y ) {
			System.out.println("�ﰢ���� ���� �� ����");
		}
		else System.out.println("�ﰢ���� ���� �� ����");
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int y = a.nextInt();
		int z = a.nextInt();
		
		isEnableTriangle(x, y, z);
	}
}

