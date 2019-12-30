package Day1Test;
// We can ignore test, ignore class & all methods in class,
//we can also Ignore package-info.java file
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class Day9NGIgnoreTestDemo
{
	
	@Test (dependsOnGroups = "Reg.*" ,priority = 1)
	public void test1()
	{
		System.out.println("this is test1, dependent on group Reg");
	}
	@Test (dependsOnMethods = "test1" ,priority = -1)
	public void test2()
	{
		System.out.println("this is test2, depends on test1");
	}
	//@Test (dependsOnMethods = {"test2" ,"test1"} ,priority = -1)
	@Test (groups = "Reg1" ,priority = -1)
	public void test3()
	{
		System.out.println("this is test3, part of lin Reg");
	}
	@Test (groups = "Reg2" ,priority = 1)
	public void test4()
	{
		System.out.println("this is test4, part of group win Reg");
	}
	//@Ignore
	@Test
	public void test5()
	{
		System.out.println("this is test5, Ignored if adding @Ignore");
	}
}
