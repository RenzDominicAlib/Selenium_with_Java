package beta;

import org.apache.logging.log4j.*;

public class Demo_B {

    private static final Logger logger = LogManager.getLogger(Demo_B.class.getName());

    public static void main(String args[]) throws Exception{

        while(true){
//    in log4j2.xml : <Root level="error"> <Root level="trace">
            logger.trace("trace");
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
