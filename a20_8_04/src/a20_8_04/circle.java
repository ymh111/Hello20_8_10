package a20_8_04;

public class circle {
	int r;
	double res;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public void cal() {
		res=r*r*Math.PI;
	}
	public static circle getCircle(){
		return new circle();
	}
	
	
	
}
