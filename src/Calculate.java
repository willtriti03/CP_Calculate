

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int x, y;
		String operator;
		while (true) {
			System.out.println("�뿰�궛�븷 �몢 媛믪쓣 �엯�젰�븯�떆�삤.");
			x = input.nextInt();
			y = input.nextInt();
			System.out.println("�뿰�궛�븷 �뿰�궛�옄瑜� �엯�젰�븯�떆�삤. (+, -, *, /)");
			operator = input.next();
			if (operator.equals("+")) {
				System.out.println(x + " + " + y + " = " + add(x, y));
			} else if (operator.equals("-")) {
				System.out.println(x + " - " + y + " = " + sub(x, y));
			} else if (operator.equals("*")) {
				System.out.println(x + " * " + y + " = " + mul(x, y));
			} else if (operator.equals("/")) {
				System.out.println(x + " / " + y + " = " + div(x, y));
			} else {
				System.out.println("�봽濡쒓렇�옩�쓣 醫낅즺�빀�땲�떎.");
				break;
			}
		}
	}

	public static int add(int x, int y) {
		return x+y;
	}

	public static int sub(int x, int y) {

		return x-y;
	}

	public static int mul(int x, int y) {

		return x*y;
	}

	public static double div(int x, int y) {
		// �떎�닔濡� 諛섑솚�씠 �릺�룄濡� 援ы쁽
		if(y!=0)
			return x/y;
		else
			return 0;
	}
}