package test.com;

import java.util.HashMap;
import java.util.Map;

public class OccuranceCharsEach {

	public static void main(String[] args) {
		occuranceOfChar("string");
	}

	private static void occuranceOfChar(String string) {
      char[] chars=string.toCharArray();
      Map<Character,Integer> map=new HashMap<>();
      for(char c:chars) {
    	  if(map.containsKey(c)) {
    		  map.put(c, map.get(c)+1);
    	  }else {
    		  map.put(c, 1);
    	  }
      }
    //  map.entrySet().stream().filter(x->x.getValue()>1).sorted((p1,p2)->p1.getKey().compareTo(p2.getKey())).forEach(x->System.out.println(x.getKey()+" "+x.getValue())); 
   //   map.entrySet().stream().sorted((p1,p2)->p1.getKey().compareTo(p2.getKey())).forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
      ;
    System.out.println(map.entrySet().stream().filter(x->x.getValue()>1).count());
	}
}
