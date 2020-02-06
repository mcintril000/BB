import java.awt.*;

public class ball {

    int x,y,diameter = 25;
    double speed,dx,dy=10;
    board board;
    public ball(board board){
       x=0;
       y=0;
       this.board=board;
    }
    public void setPosition(int x,int y){
        this.x = x-diameter/2;
        this.y = y-diameter/2;
    }

public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,diameter,diameter);
}
public int getY(){
        return y;
}
    public int getX(){
        return x;
    }
    public int getDiameter(){
        return diameter;
    }
}
