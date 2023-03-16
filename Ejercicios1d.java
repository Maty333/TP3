package EjerciciosTP3;

public class Ejercicios1d {

	public static void main(String[] args) {
		
		String productos [] =  {"botines", "pelota", "camiseta", "medias de futbol", "guantes arquero"};
		int precios[] = {7500, 1500, 8000, 2000, 10000};
		int i;
		System.out.println("Lista de productos deportivos y sus precios");
		for(i=0; i< productos.length;i++) {
			System.out.println("Producto:\n " + productos[i] +" $" + precios[i]); 
		 }
	}

}