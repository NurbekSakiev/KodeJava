
public class LocalVarEx {

	int total;
	
	public static int add() {
		//it will cause compile-time error if we don't initialize locals
		int x=1, y=2;
		
		int z = x+y;
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalVarEx lve = new LocalVarEx();
		
		lve.total = add();
		
		System.out.println("total = "+lve.total);
		
		
	}

}
