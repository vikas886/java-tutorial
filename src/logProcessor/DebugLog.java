package logProcessor;

public class DebugLog extends LoggProcessors{
    public DebugLog(LoggProcessors nextLoggProcessor) {
        super(nextLoggProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel==LogLevel.DEBUG){
            System.out.println("DEBUG : "+message);
        }else {
            super.log(logLevel,message);
        }
    }
}
