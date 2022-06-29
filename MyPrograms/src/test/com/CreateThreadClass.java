package test.com;

public class CreateThreadClass extends  Thread {

	@Override
	public void run() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		CreateThreadClass cl=new CreateThreadClass();
		cl.start();
	}

}
