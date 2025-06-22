package DesignPatterns;

public class Logger {
	private static Logger instance;
	private Logger() {
		System.out.println("Logger initialized...");
	}
	public static Logger getInstance() {
		if(instance==null) {
			instance=new Logger();
		}
		return instance;
	}
	public void log(String msg) {
		System.out.println("LOG:"+msg);
	}
}
class testSingleton{
	public static void main(String[] args) {
		Logger logger1=Logger.getInstance();
		Logger logger2=Logger.getInstance();
		
		logger1.log("This is the first Log");
		logger2.log("This is the second Log");
		
		if(logger1==logger2) {
			System.out.println("It's Singleton class");
		}
		else {
			System.out.print("It's not a Singleton class");
		}
		
	}
}
