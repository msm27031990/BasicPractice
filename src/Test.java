import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test implements Cloneable, Comparable<Test>{
	
	public static final int i;
	public final int t;
	
	static {
		i = 10;
	}
	{
		t = 10;
	}
	
	public Test() {
		//t = 10;
	}
	
	public Test get(Test t) throws CloneNotSupportedException {
		return (Test)t.clone();
	}

	public static void main(String[] args) {
		try {
			int[] abc = {1,2,9,4,5};
			Arrays.sort(abc);
			for (int i : abc) {
				System.out.println(i);
			}
			System.out.println(5.0/0.0);
			Test t = new Test();
			System.out.println(t);
			Test b = t.get(t);
			System.out.println(b);
			System.out.println(b.equals(t));
			List<Test> tests = new ArrayList<Test>();
			Set<Test> setOfTests = new HashSet<Test>(tests);
			Collections.sort(tests);
			int a = 511;
			System.out.println(a>>1);
			final List<String> abList = Arrays.asList("1", "2" ,"3", "9", "7");
			System.out.println(abList);
			for(int i = 0, mid = abList.size()>>1, j = abList.size() -1; i < mid; i++, j--) {
				abList.set(i, abList.set(j, abList.get(i)));
			}
			System.out.println(abList);
			List<Integer> cdList = new ArrayList<Integer>();
			cdList.add(1);
			cdList.add(2);
			cdList.add(3);
			cdList.add(4);
			cdList.add(5);
			cdList.forEach(k -> System.out.println("abc" + k));
			System.out.println(cdList);
			Integer ah = 2;
			cdList.remove(ah);
			System.out.println(cdList.size());
			Collections.sort(tests, Collections.reverseOrder(new Comparator<Test>() {

				@Override
				public int compare(Test o1, Test o2) {
					// TODO Auto-generated method stub
					return 0;
				}
				
			}));
			Map<String, String> map = new Hashtable<String, String>();
			//map.put(null, "");
			Set<Map.Entry<String, String>> ag = map.entrySet();
			//System.out.println(map.containsKey(null));
			Test t1 = new Test();
			System.out.println(t1);
			System.out.println(new Test());
			Tree tree = new Pine();
			System.out.println(tree instanceof Pine);
			List<? super Integer> n = new ArrayList<Integer>();
			
			
		}catch(Exception e) {
			System.out.println("fff" + e);
		}
		
		
	}

	@Override
	public int compareTo(Test o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class ABC extends Test{
	public void display() {
		Test t = new Test();
		//t.clone(); compilation error
	}
}

class Tree{}
class Pine extends Tree{}
