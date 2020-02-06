import java.awt.*;

public class player {

    int x,y;
    final int Width =100,Height = 10;
    double speed,dx,dy;

    public player(board board){
        x = board.getWidth()/2;
        y = board.getHeight() - (Height+10);
    }

    public void moveRight(){
        x+=dx;
    }
    public void moveLeft(){
        x-=dx;
    }

    public void paint(Graphics g){
        g.setColor(Color.pink);
        g.fillRect(x,y,Width,Height);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getWidth(){
        return Width;
    }
}

