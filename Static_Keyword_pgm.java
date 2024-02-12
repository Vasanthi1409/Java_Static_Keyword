package Static_Keyword.com;

public class Static_Keyword_pgm {
	static { // Static method invoked first at run-time instead of main method
		System.out.println("Hi, This is Vasanthi");
	}

	private void display() {
		System.out.println("Display Method");
	}

	public static void main(String[] args) {
		Static_Keyword_pgm sk = new Static_Keyword_pgm();
		sk.display();
	}

}
