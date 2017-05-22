package Calc;

public class Fac extends Calculator {

	int a, b;

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {

		int i, fac = 1;
		for (i = a; i <= b; i++) {
			fac = fac * i;
		}

		return fac;
	}

}
