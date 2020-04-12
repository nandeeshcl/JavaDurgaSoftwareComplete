package logfiles;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

	public static Logger log ;

	public static void main(String[] args) {

		log=Logger.getLogger(Logs.class);
		PropertyConfigurator.configure("./src\\test\\java\\logfiles\\log4j.properties");

		log.info("Logs started creating");
		log.error("Something went wrong");

	}

}
