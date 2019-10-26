import java.awt.*;
import javax.swing.*;
public class Window{
    public static void CreateWindow(){
        //Setting up the Window
        JFrame frame = new JFrame("My First Window ");
        //this part ensures the application stops running when the application is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creating the label
        JLabel label = new JLabel("My first time creating a window", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(300, 100));
        //Adding the label to the "Frame" or Window created
        frame.getContentPane().add(label, BorderLayout.CENTER);
        //positioning the window(to center) when opening 
        frame.setLocationRelativeTo(null);
        //Now to set the window size
        frame.pack();
        /*The pack() method looks at what the JFrame contains, 
        and automatically sets the size of the window. In this case, 
        it ensures the window is big enough to show the JLabel.
        */

        //Finally, we show the window
        frame.setVisible(true);
    }

    public static void main(String[] args){
        CreateWindow();
    }
}