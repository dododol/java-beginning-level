package 조건문과반복문sec02;

public class WhileCubex2 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int) (Math.random() * 6) + 1;
			System.out.println(num1);
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num2);
			if((num1 + num2) == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
