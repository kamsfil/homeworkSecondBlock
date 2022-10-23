package homework29.classUtil;

import java.util.Map;
import java.util.WeakHashMap;

public final class WeakHashMapUtil {

    public static void testWHM() throws InterruptedException {

        Map myHashMap = new WeakHashMap();

        String value = new String("keyWeakHashMap");

        myHashMap.put(value, "helloWeakHash");
        System.out.println("value:"+ myHashMap.get("keyWeakHashMap"));

        value = null;

        System.gc();
        Thread.sleep(5000);


        System.out.println("value:"+ myHashMap.get("keyWeakHashMap"));
    }
}
