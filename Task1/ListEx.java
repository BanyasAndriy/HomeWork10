package HomeWork10.Task1;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		
		List<Object> ownList = new ArrayList<>();
		
		
		
		for(int i = 0 ;i<8;i++) {
			ownList.add(i+1);
		}
		ownList.add("World");
		ownList.add(new ListEx());
		ownList.remove(0);
		ownList.remove(0);
		ownList.remove(ownList.size()-1);
		System.out.println(ownList);
		
	}

}
