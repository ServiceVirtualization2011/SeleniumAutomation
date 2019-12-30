package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Day7Log4demo {

	// create a logger and this will need optional class name/ default calling class
  private static	Logger logger = LogManager.getLogger(Day7Log4demo.class) ;

			public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world...! \n");
		logger.trace("this is trace msg");
		logger.info("This is info msg");
		logger.error("This is err msg");
		logger.warn("this is warn msg");
		logger.fatal("This is fatal msg");
		System.out.println(System.getProperty("log4j2.configuration"));
		System.out.println("Test Completed");
			}

}
