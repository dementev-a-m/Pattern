package creational.singleton;

public class Logger {
    private static Logger logger;
    private static String log = "Новый лог \n\n";
    private Logger(){

    }
    public static synchronized Logger getLogger(){
        if(logger==null)
            logger=new Logger();
        return logger;
    }
    public void addLog(String log) {
        this.log+=log+"\n";
    }
    public void writeLog(){
        System.out.println(log);
    }

}
