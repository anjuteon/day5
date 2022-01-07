package testthis1;

public class RunPowerTest {

	public static void main(String[] args) {
		PowerTest p=new PowerTest();
		p.power(3);
		
		int x=5, y=3;
		System.out.printf("%d의 %d제곱은 %d", x, y, p.power(x, y));

	}

}
