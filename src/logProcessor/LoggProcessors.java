package logProcessor;

public abstract class LoggProcessors {
    private LoggProcessors nextLoggProcessor;
    LoggProcessors(LoggProcessors nextLoggProcessor){
        this.nextLoggProcessor=nextLoggProcessor;
    }
    public void log(LogLevel logLevel,String message){
        if(nextLoggProcessor!=null){
            nextLoggProcessor.log(logLevel,message);
        }
    }
}
