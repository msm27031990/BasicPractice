public class Singleton{
	private static volatile Singleton _instance;

	public static Singleton getInstanceDC() {
	        if (_instance == null) {                // Single Checked
	            synchronized (Singleton.class) {
	                if (_instance == null) {        // Double checked
	                    _instance = new Singleton();
	                }
	            }
	        }
	        return _instance;
	}
}