import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalUI {
    private JTextField textField1;
    private JPanel painelPrincipal;

    public PrincipalUI() {
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello, World!");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Escola Principal");
        frame.setContentPane((new PrincipalUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
