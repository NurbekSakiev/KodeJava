
public class RemoteControl {
	private String channelName;
	private int channelNum;
	private int minVolume;
	private int maxVolume;
	
	public RemoteControl() {
		
	}
	

	public RemoteControl(String channelName, int channelNum) {
		//use this keyword to call another constructor
		this(channelName, channelNum, 0,0);
	}
	
	public RemoteControl (String channelName, int channelNum, int minVolume, int maxVolume){
		this.channelName = channelName;
		this.channelNum = channelNum;
		this.minVolume = minVolume;
		this.maxVolume = maxVolume;
	}
	
	public void changeVol (int x, int y) {
		this.minVolume = x;
		this.maxVolume = y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remote = new RemoteControl ("kyrgyzstan",10);
		
		// when the following Line is executed, this variable in changeVoume()
		// is refer to remote object
		remote.changeVol(0, 25);

	}

}
