package Day1Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Day8ReadPropFile {

	static Properties prop = new Properties();
	static String projpath = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			getproperties();
			setproperties();
			getproperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException in reading the property from file");
			e.printStackTrace();
		}
	}
	public static void getproperties() throws IOException
	{

		try {

			InputStream input = new FileInputStream(projpath+"\\src\\test\\java\\config\\config.propeties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			Day3Test_POM.browserName=browser;
			Day9Test_POM_Headless.browserName2=browser;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void setproperties() throws IOException {
		try {	

			OutputStream output = new FileOutputStream(projpath+"\\src\\test\\java\\config\\config.propeties");
			prop.setProperty("browser", "chrome");
			prop.store(output, "property name has been stored");
			System.out.println("Brwoser name is set with new name");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
