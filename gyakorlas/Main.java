public class Main
{
    private static GameWindow gameWindow;
    private static GamePanel gamePanel;
    public static void main(String[] args)
    {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        
    }
}