
public class Application
{

	public static void main(String[] args)
	{
//		Animal animal = new Animal();
//		animal.setLegs(4);
//		animal.setName(("Bluto"));
//		animal.setType("Something");
		
		Snake snake = new Snake();
		snake.setLegs(0);
		snake.setName(("Snake"));
		snake.setType("Reptilian");
		snake.makeSound();
		
		Cat cat = new Cat();
		cat.setLegs(4);
		cat.setName(("Cat"));
		cat.setType("Mammal");
		cat.makeSound();
		
		Dog dog = new Dog();
		dog.setLegs(4);
		dog.setName(("Dog"));
		dog.setType("Mammal");
		dog.makeSound();
		
		
	}

}
