package component;

public abstract class Obstacle {
	private int bounciness;
	private int x;
	private int y;
	public Obstacle(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public abstract int bounce();
	public abstract int getBounciness();	
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
