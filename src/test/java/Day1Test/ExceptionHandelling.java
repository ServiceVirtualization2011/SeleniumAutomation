package Day1Test;

import org.junit.rules.ErrorCollector;

public class ExceptionHandelling {

	public static void main(String[] args) {
		
		try {
			System.out.println("Inside try block");
			demo();
			System.out.println("Function exectued");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("inside catch block");
			System.out.println("Printing Execption message :"+e.getMessage());
			//e.getMessage();
			System.out.println("Printing cause :" +e.getCause());
			System.out.println("Printing Stacktrace below:");
			e.printStackTrace();
			System.out.println("Catch block completed");
		}
		//catch (ErrorCollector e) 
		finally {
			System.out.println("Inside finally block: There can be one try multiple catch and one finally block and there should not be any stmt/code between try catch blocks");
		}
		
	}

		public static void  demo() throws Exception

		{
			System.out.println("Try to create an exception test");
			int i= 1/0;
			System.out.println("We can through exception as well and handle it later");
			System.out.println("Deliberatly try to through an exception");
			throw new ArithmeticException();
			
		}
	

}
