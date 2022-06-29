package test.com;
import java.util.ArrayList;
import java.util.Arrays;

public class bubbleSortCollection {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);
		array.add(1);
		array.add(5);
		array.add(7);
		array.add(-1);

		for(int i=0;i<array.size();i++) {
			for(int j=i+1;j<array.size();j++) {
				if(array.get(i)>array.get(j)) {
					int temp=array.get(i);
					array.set(i,array.get(j));
					array.set(j, temp);
				}
			}
		}
		
		for(Integer data:array) {
			System.out.println(data);
		}
	}

}
