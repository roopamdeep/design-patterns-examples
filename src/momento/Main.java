package momento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var editor = new Editor();
		editor.setContent("a");
		editor.setContent("b");
		editor.setContent("c");
		editor.undo();
		

	}

}
