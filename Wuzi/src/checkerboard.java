import java.awt.Graphics;


public class checkerboard {

	private static final double unit_length = 25;
	private static final int xWidth = 15;
	private static final int yheight = 15;
	private static int[][] a;
	public static final double Width = xWidth * unit_length;
	public static final double Height = yheight * unit_length;
	
	public static void init() {
		
		a = new int[xWidth][yheight];
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++){
				a[i][j]=0;
			}
		}
	}
	
	public void getCheckboard() {
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void playOne(int x,int y,int color) {
		this.a[x][y]=color;
	}
	
	public int[][] getPlay() {
		return this.a;
	}
	
	public boolean end() {
		return false;
	}
	
	public void draw(Graphics g) {
		
		for(int i=0;i<xWidth;i++) {
			
			g.drawLine(120+i*40, 60, 120+i*40, 620);
			g.drawLine(120, 60+40*i, 680, 60+40*i);
			
		}
	}
	
	
}
