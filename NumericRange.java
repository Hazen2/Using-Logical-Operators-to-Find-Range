import javax.swing.JOptionPane; // Needed for JOptionPane class

/**
 * This program will demonstrate the validity of a number if it falls
 * within a certain range using logical operators.
 */

public class NumericRange
{
  public static void main(String[] args)
  {
    String inputStr; // For user input.
    int speed;       // Saved for speed variable
    
    // Ask the user to enter a number
    inputStr = JOptionPane.showInputDialog("Please enter a number.");
    speed = Integer.parseInt(inputStr);
    
    // Determine if speed is within 0 - 200.
    if (speed < 0 || speed > 200)
      JOptionPane.showMessageDialog(null, "Your speed is outside the range.");
    else
      JOptionPane.showMessageDialog(null, "Your speed is within range.");
    
    System.exit(0);
  }
}
