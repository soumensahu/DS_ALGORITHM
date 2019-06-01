package hash;

public class HashTable<T> {

	Entry[] hashArray;
	int size;
	public HashTable(int size) {
		this.size=size;
		hashArray=new Entry[size];
		for(int i=0;i<size;i++) {
			hashArray[i]=new Entry();
		}
	}
	int getHash(int key) {
		return key%size;
	}
	public void put(int key,Object value) {
		int hashIndex=getHash(key);
		Entry arrValue=hashArray[hashIndex];
		Entry newValue=new Entry(key, value);
		newValue.next=arrValue.next;
		arrValue.next=newValue;
	}
	public T get(int key) {
		T value=null;
		int hashIndex=getHash(key);
		Entry arrValue=hashArray[hashIndex];
		while(arrValue!=null) {
			if(arrValue.getKey()==key) {
				value=(T)arrValue.getValue();
				break;
			}
			arrValue=arrValue.next;
		}
		return value;
	}
	
}
