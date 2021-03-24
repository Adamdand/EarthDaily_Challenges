
public class FibonacciApp {
	
	public int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		FibonacciApp myApp = new FibonacciApp();
		int number = 20;
		System.out.println("Fibronacci's " + number +"'th number is: " + myApp.fibonacci(number));
	}
}
