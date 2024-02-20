
import javax.swing.*;
import java.awt.*;

public class PaintGui  extends JFrame {
    public  PaintGui(){
        super("Paint GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1500,1000));
        pack();
        setLocationRelativeTo(null);
        addGuiComponents();
    }

    private void addGuiComponents() {
        // JPanel configs
        JPanel conwasPanel = new JPanel();
        SpringLayout springLayout = new SpringLayout();
        conwasPanel.setLayout(springLayout);


        //1. Camvas
        Canvas canvas = new Canvas(1500 ,950);
        conwasPanel.add(canvas);
        springLayout.putConstraint(SpringLayout.NORTH,canvas,50,springLayout.NORTH,conwasPanel);

        //2.Color chocser


        this.getContentPane().add(conwasPanel);




    }


}
