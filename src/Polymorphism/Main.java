package Polymorphism;

public class Main {
  public static void main(String[] args) {
	  
  drawUIControl(new Checkbox());
	
}
  
  public static void drawUIControl(UIControl control)
  {
	  control.draw();
  }
}
