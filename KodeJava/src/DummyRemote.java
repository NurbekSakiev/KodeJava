
public class DummyRemote implements RemoteController{

	private int x;
	private int y;
	
	public DummyRemote(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveRight(int n) {
		x = x + n;
	}
	
	public void moveLeft(int n) {
		x = x - n;
	}
	
	public void moveUp(int n) {
		y = y + n;
	}
	
	public void moveDown(int n) {
		y = y - x;
	}
	
	public int[] getPosition() {
		return new int[] {x,y};
	}
	
	
	public static void main(String[] args) {
		RemoteController controller = new DummyRemote(0,0);
		controller.moveDown(10);
		controller.moveLeft(5);
		
		System.out.println("X = "+controller.getPosition()[0]);
		System.out.println("Y = "+controller.getPosition()[1]);
		// TODO Auto-generated method stub

	}

}
