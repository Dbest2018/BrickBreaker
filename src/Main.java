import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        Gameplay gameplay = new Gameplay();
        frame.add(gameplay);
        frame.setBounds(10, 10, 700, 700);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setTitle("Brick breaker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
