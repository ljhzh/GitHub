import java.awt.Color;
import java.awt.Graphics;


public class piece {
	
	private int x;
	private int y;
	private int color;
	private static final int width = 38;
	private static final int height =38;
	
	public piece(int color,int x,int y){
		this.color = color;
		this.x = 120+x*40-width/2;
		this.y = 60+y*40-height/2;
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		if(this.color == 1) {
			g.setColor(Color.GREEN);
		} else if(this.color == 2){
			g.setColor(Color.BLACK);
		}
		
		g.fillArc(x, y, width, height,0,360);
		g.setColor(c);
	}
}
