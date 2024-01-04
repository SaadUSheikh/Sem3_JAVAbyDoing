import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarRacingGame extends JPanel implements ActionListener {
    private final int WIDTH = 800, HEIGHT = 300;
    private final int CAR_WIDTH = 60, CAR_HEIGHT = 30;
    private Timer timer;
    private int[] carX = {0, 0, 0};
    private int[] carSpeeds = {2, 3, 4};

    public CarRacingGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCars(g);
    }

    private void drawCars(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(carX[0], 50, CAR_WIDTH, CAR_HEIGHT);

        g.setColor(Color.GREEN);
        g.fillRect(carX[1], 120, CAR_WIDTH, CAR_HEIGHT);

        g.setColor(Color.BLUE);
        g.fillRect(carX[2], 190, CAR_WIDTH, CAR_HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveCars();
        repaint();
    }

    private void moveCars() {
        for (int i = 0; i < carX.length; i++) {
            carX[i] += carSpeeds[i];
            if (carX[i] > WIDTH) {
                carX[i] = -CAR_WIDTH;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Racing Game");
        CarRacingGame gamePanel = new CarRacingGame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}