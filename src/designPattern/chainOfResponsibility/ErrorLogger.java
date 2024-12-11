package src.designPattern.chainOfResponsibility;

public class ErrorLogger extends LoggerProcessor{
    public ErrorLogger(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==ERROR){
            System.out.println("ERROR: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
