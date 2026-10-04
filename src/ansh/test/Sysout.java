package ansh.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Sysout {
	
	private static String category = "electronic trading system";
    public static void main(String[] args) {
    	//new BB();
    	AA aa = new AA();
    	aa.setI(25);
    	new BB().newint(aa);
    	System.out.println(aa.getI());
    	Sysout system = null;
        System.out.println(system.category);
        Set<Integer> s = new HashSet<Integer>();
        s.add(null);
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", null);
        map.put("b", null);
        System.out.println(map);
        ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone6");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S6");
       premiumPhone.put("a", null);
        
        Iterator iterator = premiumPhone.keySet().iterator();
        premiumPhone.put("Sony", "Xperia Z");
        while (iterator.hasNext()){
            System.out.println(premiumPhone.get(iterator.next()));
        }
    }
	
	public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");{;;;;;;}
    }

}

class BB{
	
	public void newint(AA a){
		a.setI(38);
		
	}
	
	static{
		System.out.println("static");
		//int a = 10/0;
	}
	
}

 class AA{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
