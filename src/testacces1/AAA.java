package testacces1;

public class AAA {
	
	public void test() {
		AccessBase ab=new AccessBase();
		//System.out.println("n1(private) = "+ab.n1); //private 같은패키지 접근x
		System.out.println("n2(public) = "+ab.n2); //public 같은패키지 접근 o
		System.out.println("n2(protected) = "+ab.n3);
		System.out.println("n2(default) = "+ab.n4);
	}

}
