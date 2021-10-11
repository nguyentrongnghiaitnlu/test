package a;

public abstract class Animal {
	private boolean isQuyHiem;

	public Animal(boolean isQuyHiem) {
		super();
		this.isQuyHiem = isQuyHiem;
	}
	
	
	public boolean isQuyHiem() {
		return isQuyHiem;
	}


	public void setQuyHiem(boolean isQuyHiem) {
		this.isQuyHiem = isQuyHiem;
	}


	public void speak() {
		System.out.println("Animal speak...");
	}
}
