package src.designPattern.chainOfResponsibility;

public class InfoLogger extends LoggerProcessor{

    public InfoLogger(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==INFO){
            System.out.println("INFO: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
