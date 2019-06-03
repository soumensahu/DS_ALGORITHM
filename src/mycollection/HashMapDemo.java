package mycollection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
			HashMap<Integer, String> map=new HashMap<Integer, String>();
			map.put(1001, "soumen");
			map.put(1002,"Sahu");
			for(Entry<Integer, String> m :map.entrySet()) {
				System.out.println("Key: "+m.getKey()+"\nvalue: "+m.getValue());
			}
	}

}
