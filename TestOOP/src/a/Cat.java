package a;

public class Cat extends Animal{
	private String name;

	public Cat(boolean isQuyHiem, String name) {
		super(isQuyHiem);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void speak() {
		System.out.println("Meowww meowwwww");
	}
	
	
	public static void main(String[] args) {
		Animal cat = new Cat(true, "ba tu");
		cat.speak();
	}
}
