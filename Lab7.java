
public class Lab7 {

	public static void main(String[] args) {
	printN(8);
	System.out.println();
	System.out.println(fib(4));
	
	
	}
	public static void printN(int a){
		if (a==1){
			System.out.println(a);
		}else{
			
			printN(a-1);
			System.out.println(a);
			
		}
	}
	public static int fib(int n){
		
		if (n <=1){
		   return n;
	} else{
		return fib(n-1)+fib(n-2);
	}

	}
	
}
