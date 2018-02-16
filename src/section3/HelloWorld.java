package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
System.out.println("hello");

String name = JOptionPane.showInputDialog(null, "When is your Birthday");
System.out.println(name);
	}
}