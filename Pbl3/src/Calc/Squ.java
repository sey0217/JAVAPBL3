package Calc;

public class Squ extends Calculator {

	int a, b;

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {

		int i, squ = 1;
		for (i = 0; i < b; i++) {
			squ = squ * a;
		}

		return squ;
	}

}
