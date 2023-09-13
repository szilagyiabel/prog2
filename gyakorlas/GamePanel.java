
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.xml.crypto.Data;

public class GamePanel extends JPanel{

    public GamePanel() {

    }
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(300, 100, 200, 200);
        g.fillRect(0, 0, 200, 200);
        g.drawChars(char[], 16, 32, 100, 100);
        
    }
    


}
