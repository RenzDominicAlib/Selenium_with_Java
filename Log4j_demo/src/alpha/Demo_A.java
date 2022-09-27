package alpha;

import org.apache.logging.log4j.*;

public class Demo_A {

    private static final Logger logger = LogManager.getLogger(Demo_A.class.getName());

    public static void main(String args[]) throws Exception{

        while(true){
//    in log4j2.xml : <Root level="error"> <Root level="trace">
            logger.trace("A trace");
            logger.debug("debug");
            logger.info("info");
            logger.warn("warn");
            logger.error("error");
            logger.fatal("fatal");
            System.out.println("***Execution Completed***");
            break;
        }
    }
}
