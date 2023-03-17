package sec06.exam04.package1;

public class A {
	//필드
	A a1 = new A(true);	//(0)
	A a2 = new A(1);	//(0)
	A a3 = new A("문자열");	//(0)
	
	//생성자
	public A(boolean b) {}  //<< public접근 제한
	A(int b) {}				//<< default접근 제한
	private A(String s) {}  //<< private접근 제한

}
