
public class DropEnemy extends Enemy{
	public DropEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}
	public void draw(MyFrame f) {
		f.setColor(0,128,0);
		f.fillRect(x+8, y, 30, 10);
		f.setColor(0,128,0);
		f.fillRect(x+18,y+10,10,20);
	}
}
