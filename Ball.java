import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle {

    Random rand;
    int xVelocity, yVelocity;
    int initialSpeed = 2;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        rand = new Random();
        int randXDirection = rand.nextInt(2);
        if (randXDirection == 0) {
            randXDirection--;
        }
        setXDirection(randXDirection * initialSpeed);
        int randYDirection = rand.nextInt(2);
        if (randYDirection == 0) {
            randYDirection--;
        }
        setYDirection(randYDirection * initialSpeed);

    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, height, width);
    }
}
