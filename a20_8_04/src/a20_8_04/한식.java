package a20_8_04;

class �߽�{
	int ¥��;
	int ���;
	int ����;
	int �����⸧;
	int �׸�;
	public �߽�(){}
	public �߽�(int ¥��,int �����⸧){
		this.¥��=¥��;
		this.�����⸧=�����⸧;
	}
	
	void ¥���() {
		�׸�=¥��+����+�����⸧;
	}
	void ��ä() {
		�׸�=���+����+�����⸧;
	}
	void show() {
		System.out.println(�׸�);
	}
}
class �Ͻ�{
	int ��ġ,����,�췰,����,�׸�;
	public �Ͻ�() {}
	public �Ͻ�(int �췰,int ����) {
		this.�췰=�췰;
		this.����=����;
	}
	
	public �Ͻ�(Object obj) {
		if(obj instanceof �߽�) {
			�߽� ch=(�߽�) obj;
			ch.��ä();
			ch.show();
		}
		else if(obj instanceof �ѽ�) {
			�ѽ� han=(�ѽ�)obj;
			han.�����(100);
			han.show();
		}
	}
	void ȸ����() {
		�׸�=�췰+����+����;
	}
	
	
	void �ʹ�(int ��) {
		�׸�=��+�췰+��ġ+����;
	}
	void show() {
		System.out.println(�׸�);
	}
}
public class �ѽ� {
	private int ����;
	private int ��ġ;
	private int ���;
	private int �׸�;
	public void �����(int ��) {
		�׸�=����+��ġ+���+��;
	}
	public void show() {
		System.out.println(�׸�);
	}
	public static �ѽ� getInstance() {
		return new �ѽ�();
	}
	
	public static void main(String[] args) {
		�Ͻ� ilsik=new �Ͻ�(100,2);  //�췰,����
		�߽� jungsik=new �߽�(50,30);  //¥��,�����⸧
		ilsik.ȸ����();
		ilsik.show();
		
		jungsik.��ä();
		jungsik.show();
		
		�ѽ� han=new �ѽ�();
		han.�����(100);
		
		�ѽ� hansik=�ѽ�.getInstance();
		hansik.�����(100);
		hansik.show();
		
		�Ͻ� kim=new �Ͻ�(new �ѽ�());  //�Ͻ� class ���� �����Ͻÿ�
		
		�Ͻ� lee=new �Ͻ�(new �߽�());
	}

}










