package Ejercicio_tema_8;

public class NuevaPersona {

	public static void main(String[] args) {
		Persona NuevaPersona = new Persona();
		NuevaPersona.setEdad(30);
		NuevaPersona.setNombre("Juan");
		NuevaPersona.setTelefono(1120305588);
		System.out.println(NuevaPersona.getEdad());
		System.out.println(NuevaPersona.getNombre());
		System.out.println(NuevaPersona.getTelefono());
		

	}

}
