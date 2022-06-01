package learn.function;

public class For {

	public static void main(String[] args) {
		int a;

		for (a = 0; a < 10001; a++) {
			System.out.println(a);
			if(a == 10000) {
				a = 0;
			}
		}
	}

}
