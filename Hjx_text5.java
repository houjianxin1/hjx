package hjx;

public class Hjx_text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n = 90;
	        Decompose(n);
	    }
	    //用于分解
	    private static void Decompose(int n){
	        System.out.print(n+"=");
	        for(int i=2;i<=n;i++){
	            while(n%i==0 && n!=i){
	                n=n/i;
	                System.out.print(i+"*");
	            }
	            if(n==i){
	                System.out.println(i);
	                break;
	            }

	        }
	    }
	}
