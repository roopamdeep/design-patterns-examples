package Polymorphism;


public abstract class UIControl {
	
	public void enable() {
		System.out.println("Enabled");
	}
	public abstract void draw();
	public void disable() {
		System.out.println("Disabled");
	}

}
