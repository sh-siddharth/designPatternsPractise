package src.designPattern.chainOfResponsibility;

import static src.designPattern.chainOfResponsibility.LoggerProcessor.*;

public class LoggerTestMain {
    public static void main(String[] args) {
        LoggerProcessor loggerProcessor = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        loggerProcessor.log(INFO, "Info log printed");
        loggerProcessor.log(DEBUG, "Debug log printed");
        loggerProcessor.log(ERROR, "Error log printed");
    }
}
