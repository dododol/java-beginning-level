package 조건문과반복문sec02;

public class For3 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i;
		for(i=3; i<=100; i+=3) {
			
			sum += i;
			
		}
		System.out.println("1~100까지의 정수 중 3의 배수 합 :" + sum);

	}

}
