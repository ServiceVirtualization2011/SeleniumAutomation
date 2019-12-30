package Day1Test;

import org.testng.annotations.Test;

public class Day9NGPriorityDemo {
// in case of same priority alphabatic order
// in case of no priority set it will run in alphabatic order
// It runs non prioritized methods first and then priority methods
@Test (priority = 1)	
public void test1() {	
	System.out.println("Test 1 completed");
}

@Test (priority = 1)
public void test2() {	
	System.out.println("Test 2 completed");
}	
@Test (priority = -2)	
public void test3() {	
	System.out.println("Test 3 completed");
}


}
