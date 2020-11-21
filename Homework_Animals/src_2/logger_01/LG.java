package logger_01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LG {

    static public Logger LOG1 = LogManager.getLogger();

    public static void main() {


        LOG1.trace("LG-trace");
        LOG1.debug("LG-debug");
        LOG1.info("LG-info");
        LOG1.warn("LG-warn");
        LOG1.error("LG-error");
        LOG1.fatal("LG-fatal");
    }
}