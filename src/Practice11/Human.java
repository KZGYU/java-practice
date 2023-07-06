package Practice11;

public class Human extends Animal {

	public Human(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("初めまして、私の名前は" + this.name + "です。");

	}

	public void eat() {
		System.out.println("もぐもぐ");

	}

}
