package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cow c = new Cow();
		Cat cat = new Cat();
		
		d.voice();
		c.voice();
		cat.voice();
		
		//task3 Amphibia
		
		Frog f = new Frog(5,2);
		
		System.out.println(f);
		f.eat();
		f.swim();
		f.walk();
		f.sleep();
	}
}
