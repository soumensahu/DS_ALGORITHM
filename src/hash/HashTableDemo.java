package hash;

public class HashTableDemo {
	public static void main(String[] args) {
		HashTable<String> map=new HashTable<String>(10);
		map.put(10, "Soumen");
		map.put(11, "Sourav");
		map.put(12, "Suman");
		map.put(13, "Milan");
		System.out.println(map.get(1100));
	}
}
