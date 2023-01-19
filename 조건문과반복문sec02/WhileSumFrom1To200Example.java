package 조건문과반복문sec02;

public class WhileSumFrom1To200Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);

	}

}
