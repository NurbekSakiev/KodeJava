
public interface RemoteController {

	void moveUp(int n);
	void moveDown(int n);
	void moveRight(int n);
	void moveLeft(int n);
	
	int[] getPosition();
}
