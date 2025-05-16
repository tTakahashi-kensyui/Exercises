package project;

/**
 * 動物クラス
 */
public class Animal {

	private String name;	//名前
	private int age;		//年齢
	
	Animal(){
		name = "名無し";
		age = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void bark() {
		System.out.println(name +"が鳴き声を発した！");
	}
}
