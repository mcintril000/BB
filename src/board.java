import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class board extends JPanel implements ActionListener {

final int Width = 800;
final int Height = 600;
    private final Game Game;
    player player;
    ball ball;
    Timer timer;
    bricks[][] bricks = new bricks[10][10];
    Long timeDelay;


    public board(Game game) {
        this.Game = game;
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.blue);
        timer = new Timer(1000/60, this);

    }

    public void setup() {
        player = new player(this);

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                bricks[row][col] = new bricks(col * 50, row * 50);
            }
        }
        ball = new ball(this);
        timeDelay = System.currentTimeMillis();
    }
    public void init() {
        ball.setPosition(Width/2,Height/2);
    }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            player.paint(g);

            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 10; col++) {
                    bricks[row][col].paint(g);
                }
            }
            ball.paint(g);
        }

    @Override
        public void actionPerformed(ActionEvent e){

        long currentTime = System.currentTimeMillis();

        if(Game.isLeftPressed() && player.getX() >0){
            player.moveLeft();
        }
        if(Game.isRightPressed() && (player.getX() + player.getWidth() < getWidth())){
                player.moveRight();
            }
        repaint();
        }

}

