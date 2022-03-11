package day23;

class A {
	
	
	private int war, ty, pat;
	
	public void setw(int i) {
		war = i;
		ty =i;
		pat = i;
	}
	
	public int getw() {
		return war;
	}
	
	public int gett() {
		return ty;
	}
	
	public int getp() {
		return pat;
	}
	
}



public class def {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		a.setw(444456666);
		
		System.out.println(a.getw());
		System.out.println(a.getp());
		System.out.println(a.gett());
	}

}
