import javax.swing.JOptionPane;
public class GuiHypoOfTriangle {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "This is Basic Application to find the hypotenous of a tringle.");
		double ht = Double.parseDouble(JOptionPane.showInputDialog("Enter Height of triangle. "));
		double bs = Double.parseDouble(JOptionPane.showInputDialog("Enter Base of the triangle. "));
		double hypo = Math.sqrt((bs*bs)+(ht*ht));
		
		JOptionPane.showMessageDialog(null, "Hypotenous of triangle is "+hypo);
		JOptionPane.showMessageDialog(null, "Thank You.");
		
	}

}
