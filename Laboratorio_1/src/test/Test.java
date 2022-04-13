package test;

import carros.CarroBase;
import carros.Pickup;
import carros.Sedan;
import carros.Crossover;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	       
		MotorGasolina motorGasolina = new MotorGasolina();
		MotorDiesel motorDiesel = new MotorDiesel();
		
		CarroBase carro = new Pickup(motorDiesel);
		carro.imprimirCategoria();
		System.out.println();
		
		carro = new Sedan(motorGasolina);
		carro.imprimirCategoria();
		System.out.println();
		
		carro = new Crossover(motorDiesel);
		carro.imprimirCategoria();
		
		
	}
	
}
