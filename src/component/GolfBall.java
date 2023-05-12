package component;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class GolfBall extends Circle {
	private int x;
	private int y;
	private final int radius = 5;
	private int speed;
	
	public GolfBall(int x, int y) {
		this.setRadius(radius);
		this.setFill(Color.WHITE);
		this.setX(x);
		this.setY(y);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
}
