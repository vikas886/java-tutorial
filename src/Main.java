import logProcessor.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LoggProcessors logg=new InfoLog(new DebugLog(new ErrorLog(null)));
        logg.log(LogLevel.DEBUG,"Debug message");
        logg.log(LogLevel.INFO,"Info message");
        logg.log(LogLevel.ERROR,"Error message");
    }
}