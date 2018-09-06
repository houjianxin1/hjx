package hjx;

public class Hjx_text2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 1;
		int b= 1;
		int c=0;
		for(int i=3;i<=7;i++){
			c=a+b;
			b=a;
			a=c;
		}
		System.out.print(c);
	}

}
