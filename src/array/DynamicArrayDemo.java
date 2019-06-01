package array;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		DynamicArray<Integer> dArray=new DynamicArray<Integer>();
		dArray.add(10);
		dArray.add(11);
		dArray.add(12);
		dArray.add(13);
		dArray.add(14);
		dArray.add(15);
		System.out.println("Size of Array : "+dArray.size());
		for(int i=0;i<dArray.size();i++) {
			System.out.println(dArray.get(i));
		}
	}

}
