package a20_8_04;

class 중식{
	int 짜장;
	int 당면;
	int 버섯;
	int 돼지기름;
	int 그릇;
	public 중식(){}
	public 중식(int 짜장,int 돼지기름){
		this.짜장=짜장;
		this.돼지기름=돼지기름;
	}
	
	void 짜장면() {
		그릇=짜장+버섯+돼지기름;
	}
	void 잡채() {
		그릇=당면+버섯+돼지기름;
	}
	void show() {
		System.out.println(그릇);
	}
}
class 일식{
	int 참치,간장,우럭,광어,그릇;
	public 일식() {}
	public 일식(int 우럭,int 간장) {
		this.우럭=우럭;
		this.간장=간장;
	}
	
	public 일식(Object obj) {
		if(obj instanceof 중식) {
			중식 ch=(중식) obj;
			ch.잡채();
			ch.show();
		}
		else if(obj instanceof 한식) {
			한식 han=(한식)obj;
			han.비빔밥(100);
			han.show();
		}
	}
	void 회덮밥() {
		그릇=우럭+광어+간장;
	}
	
	
	void 초밥(int 밥) {
		그릇=밥+우럭+참치+간장;
	}
	void show() {
		System.out.println(그릇);
	}
}
public class 한식 {
	private int 마늘;
	private int 김치;
	private int 계란;
	private int 그릇;
	public void 비빔밥(int 밥) {
		그릇=마늘+김치+계란+밥;
	}
	public void show() {
		System.out.println(그릇);
	}
	public static 한식 getInstance() {
		return new 한식();
	}
	
	public static void main(String[] args) {
		일식 ilsik=new 일식(100,2);  //우럭,간장
		중식 jungsik=new 중식(50,30);  //짜장,돼지기름
		ilsik.회덮밥();
		ilsik.show();
		
		jungsik.잡채();
		jungsik.show();
		
		한식 han=new 한식();
		han.비빔밥(100);
		
		한식 hansik=한식.getInstance();
		hansik.비빔밥(100);
		hansik.show();
		
		일식 kim=new 일식(new 한식());  //일식 class 내부 수정하시오
		
		일식 lee=new 일식(new 중식());
	}

}










