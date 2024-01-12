package ec.edu.puce.abstractas;

public class Main {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo("Rectáncgulo 1");
		r1.setBase(7);
		r1.setAltura(15);
		System.out.println(r1.toString());

		Rectangulo r2 = new Rectangulo("Rectáncgulo 2");
		r2.setBase(80);
		r2.setAltura(10);
		System.out.println(r2.toString());

		if (r1.mayorQue(r2))
			System.out.println("El mayo es: " + r1.toString());
		else
			System.out.println("El mayo es: " + r2.toString());
		Triangulo triangulo = new Triangulo("Triángulo", 5, 8);
        Circulo circulo = new Circulo("Círculo", 4);

        System.out.println(triangulo);  // Imprime: Triángulo con área 20.0
        System.out.println(circulo);   // Imprime: Círculo con área 50.26548245743669

        if (triangulo.mayorQue(circulo)) {
            System.out.println("El triángulo tiene un área mayor que el círculo.");
        } else {
            System.out.println("El círculo tiene un área mayor que el triángulo.");
        }
	}

}
