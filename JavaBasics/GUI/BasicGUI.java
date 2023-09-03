
import javax.swing.JOptionPane;

public class BasicGUI {
	public static void main(String[] args) {
		//Very Basic GUI(Graphical User Interface) Application
		String name = JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null, "Hello " +  name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
		JOptionPane.showMessageDialog(null, "You are "+ age + " years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));
		JOptionPane.showMessageDialog(null, "You are "+ height + " years old.");
	}
}
