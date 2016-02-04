import java.awt.Frame;


public class chese extends Frame {
	
	private static checkerboard checkerboard;//一个棋盘
	private static final int black = 1;
	private static final int orange = 2;
	private static final int num = 225;
	private static final int blpiece = 113;//黑子113枚 
	private static final int whpiece = 112;//白子112枚
	private static int pgroup[][]; //棋子

	
	
	
	public static void init(User u){
		System.out.println();
		checkerboard = new checkerboard();
		checkerboard.init();
		checkerboard.getCheckboard();
	}
	
	public boolean judge(User u) {
		return false;
	}
	
}
