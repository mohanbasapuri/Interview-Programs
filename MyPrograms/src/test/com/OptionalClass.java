package test.com;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
    String s=null;
    Optional<String> check = Optional.ofNullable(s);
    if(check.isPresent()) {
    	System.out.println(new String("ABC"));
    }else {
    	System.out.println("give proper");
    }
	}

}
