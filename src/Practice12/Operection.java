package Practice12;

public class Operection {
	public static void main(String[] args) {

		Animal[] pets = { new Cat("タマ"),new Dog("ポチ")};
		
		for(Animal i : pets) { //int i=0;i<pets.length;i++
			i.AnimalName();
			i.bark();
			
			//pets[i].AnimalName();
			//pets[i].bark();
		}
		
	}

}
