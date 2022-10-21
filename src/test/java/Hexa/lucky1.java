package Hexa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Hexa.lucky1;

public class lucky1 {

	private static Logger log= LogManager.getLogger(lucky1.class.getName()); // class path
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("debugging");
		log.error("errors"); 
		log.fatal("fat");
		log.info("info");
	}
	
}
