package sec06.exam04.package1;

public class B {
	//필드
	A a1 = new A(true);	//(o)
	A a2 =new A(1);		//(o)
	A a3 = new A("문자열");	//(o) << private 생성자 접근 불가(컴파일 에러)

}