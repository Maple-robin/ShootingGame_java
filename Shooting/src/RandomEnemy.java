
public class RandomEnemy extends Enemy{
	public RandomEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=2+GameWorld.stage;
	}
	public void move() {
		super.move();
		vx=Math.random()*(4+GameWorld.stage)-2;
	}
	public void draw(MyFrame f) {
		f.setColor(0,128,0);
		f.fillRect(x+8, y, 10, 20);
		f.setColor(0,128,0);
		f.fillRect(x+28,y,10,20);
		f.setColor(0,128,0);
		f.fillRect(x+18,y+20,10,10);
	}
}
