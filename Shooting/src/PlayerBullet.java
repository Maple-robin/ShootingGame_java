
public class PlayerBullet extends Character{
	public void draw(MyFrame f) {
		f.setColor(200, 200, 200);
		f.fillOval(x+5, y, 20, 20);
	}
	public PlayerBullet(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
}
