package a20_8_04;

class A{
	public A() {}
	public A(Object obj) {
		if(obj instanceof Test) {
			Test kim=(Test)	obj;
		}
	}
}

class B{
	public B() {  }
	public B(Object obj) {
		if(obj instanceof Test) {
			Test kim=(Test) obj;
		}
	}
}


public class Test {
	public static Test getTest() {
		return new Test();
	}
	
	public static void main(String[] args) {
		B bkim=new B(getTest());
		A akim=new A(getTest());
		
	}

}
