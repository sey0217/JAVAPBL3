package Calc;

import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {

		System.out.println("<����>");
		Scanner input = new Scanner(System.in);
		Calculator cal = null;

		while (true) {

			System.out.println("�����ڸ� �Է��ϼ���.");
			char calc = input.next().charAt(0);

			if (calc == 'e') {
				break;
			}

			System.out.println("�� ������ �Է��ϼ���.");
			int a = input.nextInt();
			int b = input.nextInt();

			switch (calc) {
			case '+':
				cal = new Add();
				break;
			case '-':
				cal = new Sub();
				break;
			case '*':
				cal = new Mul();
				break;
			case '/':
				cal = new Div();
				break;
			case '^':
				cal = new Squ();
				break;
			case '!':
				cal = new Fac();
				break;
			default:
				System.out.println("�߸��� �������Դϴ�.");
				break;
			}

			cal.setValue(a, b);
			System.out.println("��� �� : " + cal.calculate());

		}
		System.out.println("����");
	}
}
