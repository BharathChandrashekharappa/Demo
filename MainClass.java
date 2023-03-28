package innerclass;

interface Caluclator{
	void add(int a,int b);
	void mul(int a,int b);
}

public class MainClass {
	public static void main(String[] args) {
		 
		 Caluclator cr=new Caluclator() {
			
			@Override
			public void mul(int a, int b) {
				System.out.println("pro :"+(a*b));
				
			}
			
			@Override
			public void add(int a, int b) {
				System.out.println("add :"+(a+b));
				
			}
		};
		cr.add(10, 20);
		cr.mul(5, 4);
	}

}
