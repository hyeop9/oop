import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ContentPaneEx2 extends JFrame {

    Button[] buttons = new Button[51];
    Random random = new Random();

    ContentPaneEx2() {
        setTitle("ContentPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);

        contentPane.setLayout(new FlowLayout());

        for (int i = 1; i <= 50; i++) {
            String text = "OK" + Integer.toString(i);

            buttons[i] = new Button(text);
            buttons[i].setFont(new Font("맑은고딕", Font.BOLD, 20));
            int R = random.nextInt(255);
            int G = random.nextInt(255);
            int B = random.nextInt(255);
            Color c = new Color(R, G, B);
            buttons[i].setBackground(c);
            contentPane.add(buttons[i]);
        }

        setSize(400, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        ContentPaneEx2 frame = new ContentPaneEx2();
    }
}
