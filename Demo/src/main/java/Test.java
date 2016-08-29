
public class Test {
	public int plusAandB(int a , int b){
		int c = a + b;
		int d = a + c;
		int e = c + d +5;
		int f = e + d;
		int g = e + c;
		return c;
	}
	
	public String plusAandB(String a,String b){
		String c = a + b;
		return c;
	}
	public static void main(String[] args){
		Test test = new Test();
		System.out.println(test.plusAandB(80, 7));
	}
}
