import javax.swing.JOptionPane;

public class GUI {
public static void main(String[] args) {
    String Name=JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello "+ Name);
    int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "Hello "+ Name +" You are "+age+" years old");

    Double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
    JOptionPane.showMessageDialog(null, "Hello "+ Name +" You are "+age+" years old"+" you are "+ height+ "cm. tall.");


}

    
    
}
