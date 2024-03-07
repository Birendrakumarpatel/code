package Button;
import javax.swing.*;

public class Button {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Hello World");

        // Create a new JButton with the text "Click me!"
        JButton button = new JButton("Click me!");

        // Add the button to the frame's content pane
        frame.getContentPane().add(button);

        // Set the frame's size and make it visible
        frame.setSize(300, 50000);
        frame.setVisible(true);
    }
}