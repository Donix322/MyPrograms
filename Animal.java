
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Bird extends Animal{
	 public void animalSound() {
		    System.out.println("Tweet Tweet");
 }
}

class Dog extends Animal{
	public void animalSound() {
	    System.out.println("Arf! Arf! Arf!");
}
}

class MainMethod{
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Bird myBird = new Bird();
		Dog myDog = new Dog();
		myAnimal.animalSound();
		myBird.animalSound();
		myDog.animalSound();
		
		
	}
}

