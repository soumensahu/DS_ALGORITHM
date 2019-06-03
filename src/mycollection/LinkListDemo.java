package mycollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> lks=new LinkedList<String>();
		lks.add("soumen");
		lks.add("Sahu");
		Iterator<String> itr=lks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
