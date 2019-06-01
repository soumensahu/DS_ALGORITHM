package array;

import java.util.Arrays;

public class DynamicArray<T> {
	
	Object[] data;
	int size;
	public DynamicArray() {
		size=0;
		data=new Object[1];
	}
	private int getSize() {
		return data.length;
	}
	public T get(int index) {
		return (T)data[index];
	}
	
	public void add(T element) {
		ensureCapacity(size+1);
		data[size++]=element;
	}
	private void ensureCapacity(int minCapacity) {
		int oldCapacity=getSize();
		if(minCapacity>oldCapacity) {
			int newCapacity=oldCapacity*2;
			if(newCapacity<minCapacity)
				newCapacity=minCapacity;
			data=Arrays.copyOf(data, newCapacity);
		}
		
	}
	public int size() {
		int dataSize=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null)
				dataSize+=1;
		}
		return dataSize;
	}
}
