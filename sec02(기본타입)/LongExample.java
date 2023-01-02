package sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; << int값을 초과하여 뒤에 L을 붙혀야하는데, 안붙히면 오류발생함.
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
