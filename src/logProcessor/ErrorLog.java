package logProcessor;

public class ErrorLog extends LoggProcessors{
    public ErrorLog(LoggProcessors nextLoggProcessor) {
        super(nextLoggProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel==LogLevel.ERROR){
            System.out.println("ERROR : "+message);
        }else {
            super.log(logLevel,message);
        }
    }
}
