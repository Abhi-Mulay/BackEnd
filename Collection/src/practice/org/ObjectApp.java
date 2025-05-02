package practice.org;
import java.util.*;
public class ObjectApp {

	public static void main(String[] args) {
		
		Object obj[]=new Object[5];
		
		obj[0]=5;
		obj[1]=10.5f;
		obj[2]=false;
		obj[3]="ram";
		obj[4]=new Date();
		
		for(int i=0 ; i<obj.length ; i++)
		{
			System.out.println(obj[i]);
		}
		
	}

}
