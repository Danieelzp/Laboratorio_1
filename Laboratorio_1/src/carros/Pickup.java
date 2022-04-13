package carros;

import motores.Motor;

public class Pickup extends CarroBase {

	public Pickup(Motor motor) {
		super(motor);
	}

	@Override 
	public void imprimirCategoria() {
		System.out.println("Soy Pickup");
		imprimirMotor();
	
	}
	
	public void imprimirCategoria(String name) {
	  System.out.println(name);
	}
	

}
