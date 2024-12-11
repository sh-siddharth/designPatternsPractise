package src.designPattern.chainOfResponsibility;

public class DebugLogger extends LoggerProcessor{
    public DebugLogger(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==DEBUG){
            System.out.println("DEBUG: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
