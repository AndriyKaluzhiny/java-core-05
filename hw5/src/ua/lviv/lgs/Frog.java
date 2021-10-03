package ua.lviv.lgs;

public class Frog extends Amphibia{

	int age;
	double weight;
	
	Frog (int age, double weight) {
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Frog [age=" + age + ", weight=" + weight + "]";
	}
}
