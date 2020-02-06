import java.awt.*;

public class bricks {
    int x, y;
    final int Height = 600, Width = 20;
    int numBricks = 50;

    public bricks(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g){
    g.setColor(Color.white);
    g.fillRect(x,y,Height,Width);
}
    public int getNumBricks(){return numBricks;}
}
