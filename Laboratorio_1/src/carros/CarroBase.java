package carros;

import motores.Motor;

public abstract class CarroBase {
    
	public abstract void imprimirCategoria();
	private Motor motor;
	
	
	public CarroBase(Motor motor) {
		this.motor = motor;
	}
	
	public void imprimirMotor() {
		System.out.println(motor.getMotor());
	}
	
	
}
