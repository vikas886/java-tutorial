package logProcessor;

public class InfoLog extends LoggProcessors{
    public InfoLog(LoggProcessors nextLog){
        super(nextLog);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel==LogLevel.INFO){
            System.out.println("INFO : "+message);
        }else {
            super.log(logLevel,message);
        }
    }
}
