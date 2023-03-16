package EjerciciosTP3;

public class ejercicio1e {

	public static void main(String[] args) {
		
		String Curso[] = { "matematica", "ingles", "lengua"};
		int Notas[] = {10 , 8, 3};
		
		int Prom = (Notas[0] + Notas[1] + Notas[2])/3;
		int i;
		for( i=0; i<Curso.length;i++) {
			System.out.println(Curso[i]+": " + Notas[i]);
		}
		System.out.println("Promedio general: " + Prom);

	}

}
