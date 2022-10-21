package gamma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gamma.Lucky;

public class Lucky {

	private static Logger log= LogManager.getLogger(Lucky.class.getName()); // class path
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("debugging");
		log.error("errors"); 
		log.fatal("fat");
		log.info("info");
	}
		
}
