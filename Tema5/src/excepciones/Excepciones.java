package excepciones;

public class Excepciones {

	public static void main(String[] args) {

		System.out.println(1);
		try {
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	}

}
