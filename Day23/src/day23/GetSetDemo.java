package day23;


class XUV {
	private int TopSpeed, Gear;
	boolean Brake, Lights;
	
	public void start() {
		
	}
	
	public void setGear(int i) 
	{
		Gear = i;
	}
	
	public int getGear()
	{
		return Gear;
	}
	
	public void setSpeed(int i) 
	{
		TopSpeed = i;
	}
	
	public int getSpeed()
	{
		return TopSpeed;
	}
}

public class GetSetDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XUV X = new XUV();
		X.setGear(345);
		//c2.Gear=200;
		System.out.println(X.getGear());
		
		//XUV C = new XUV();
		X.setSpeed(5000);
		System.out.println("getset:\t"+X.getSpeed());

	}

}
