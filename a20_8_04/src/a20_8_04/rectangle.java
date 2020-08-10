package a20_8_04;

public class rectangle {
	int w,h;
	double res;
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public void setW(int w) {
		this.w = w;
	}
	public static rectangle getRectangle() {
		return new rectangle();
	}
	public void cal() {
		res=w*h;
	}
}
