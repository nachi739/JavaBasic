package java_basic.no03.obj_feld;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cat cat = new Cat();
		Human human = new Human();
		
		cat.cry();
		human.cry();
		animal.cry();
		
		cat.jump();
		human.jump();
		animal.jump();
		
		human.imagination();
	}
}
