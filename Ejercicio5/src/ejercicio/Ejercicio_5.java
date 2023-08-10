package ejercicio;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		int a = 14;
		int b = 5;
		int c = 97;
		int d = 26;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		System.out.println("D = " + d);

	}

}
