package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new ostrich());
		animals.add(new peacock());
		animals.add(new chameleon());
		animals.add(new kraken());
		for (Animal a : animals) {
			a.makeNoise();
			a.eat();
			System.out.println("");
		}
	}
}
