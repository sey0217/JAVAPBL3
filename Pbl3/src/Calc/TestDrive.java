package Calc;

import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {

		System.out.println("<계산기>");
		Scanner input = new Scanner(System.in);
		Calculator cal = null;

		while (true) {

			System.out.println("연산자를 입력하세요.");
			char calc = input.next().charAt(0);

			if (calc == 'e') {
				break;
			}

			System.out.println("두 정수를 입력하세요.");
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
				System.out.println("잘못된 연산자입니다.");
				break;
			}

			cal.setValue(a, b);
			System.out.println("결과 값 : " + cal.calculate());

		}
		System.out.println("종료");
	}
}
