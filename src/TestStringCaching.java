import java.util.HashMap;
import java.util.Map;


public class TestStringCaching {
    static Map < String, String > cache = new HashMap < String, String > ();
    public static void main(String[] args) {
        int iter = 8000000;
        String[] temp = new String[iter];
        long st1 = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            temp[i] = generateString();
        }
        System.out.println(System.currentTimeMillis() - st1);
        st1 = System.currentTimeMillis();
        for (int i = 0; i < iter; i++) {
            temp[i] = generateString1();
        }
        System.out.println(System.currentTimeMillis() - st1);
        System.gc();
    }

    private static String generateString() {
        return new String("abc");
    }

    private static String generateString1() {
    	String str = new String("abc");
        if (!cache.containsKey(str)) {
            cache.put(str, str);
        }
        return cache.get(str);

    }
}