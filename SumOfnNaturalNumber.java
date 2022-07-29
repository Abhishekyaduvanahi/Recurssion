package recurssion;

public class SumOfnNaturalNumber {
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+ sum(n-1);
	}

	public static void main(String[] args) {
		
//            int sum1 =0;
            int n=4;
            // here we are calling function but not printing the value
            sum(4);
            // here we are printing the value of function and calling the function 
            System.out.println(sum(5));
            System.out.println(sum(4));
	}

}
