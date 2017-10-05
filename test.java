import java.util.*;

public class test{
	
	Integer i = 1;
	int j;
	public static void main(String []args){
		test t = new test();
		t.go();
	}
	
	public void go(){
		j = i;
		System.out.println("j = " + j);
		System.out.println("i = " + i);
	}
}
