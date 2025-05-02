/*Q 2. Write a java program to create Vector and perform following operations using switch case and do while.

1. Add 10 Values In Vector.
2. Display All Values In Vector.
3. Add New Value In Vector.
4. Search Value In Vector.
5. Sort All Values In Ascending Order In Vector.
6. Sort All Values In Descending Order In Vector.
7. Find Max Value In Vector.
8. Find Min Value In Vector.
9. Update Value In Vector.
10. Delete Value In Vector.*/

package vectorProgram.org;
import java.util.*;

public class date10_03_2025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector <Integer>a=new <Integer>Vector();
		
		boolean flag=true;
		
		do{
			
			System.out.println("case 1. Add 10 Values In Vector.");
			System.out.println("case 2. Display All Values In Vector.");
			System.out.println("case 3. Add New Value In Vector.");
			System.out.println("case 4. Search Value In Vector.");
			System.out.println("case 5. Sort All Values In Ascending Order In Vector.");
			System.out.println("case 6. Sort All Values In Descending Order In Vector.");
			System.out.println("case 7. Find Max Value In Vector.");
			System.out.println("case 8. Find Min Value In Vector.");
			System.out.println("case 9. Update Value In Vector.");
			System.out.println("case 10. Delete Value In Vector.");
			System.out.println("case 11. For Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:

					for(int i=0;i<5;i++)
					{
						a.add(sc.nextInt());
					}
				
				break;
			case 2:
				for(int i=0;i<a.size();i++)
				{
					System.out.println(a.get(i));
				}
				break;
			case 3:
				a.add(sc.nextInt());
				break;
			case 4:
				int search=sc.nextInt();
				int sea=0;
				for(int i=0;i<a.size();i++) {
					if(a.get(i)==search)
					{
						System.out.println("Value found");
						sea=1;
						break;
					}
				}
				if(sea==0) {
					System.out.println("Value not found");
				}
				break;
			case 5:
				for(int i=0;i<a.size();i++) {
					for(int j=0;j<a.size();j++) {
						if(a.get(i)<a.get(j)) {
							int temp=a.get(i);
							a.set(i, a.get(j));
							a.set(j, temp);
						}
					}
				}
				break;
			case 6:
				for(int i=0;i<a.size();i++) {
					for(int j=0;j<a.size();j++) {
						if(a.get(i)>a.get(j)) {
							int temp2=a.get(i);
							a.set(i, a.get(j));
							a.set(j, temp2);
						}
					}
				}
				break;
			case 7:
				int max=a.get(0);
				for(int i=0;i<a.size();i++) {
					if(a.get(i)>max)
					{
						max=a.get(i);
					}
				}
				System.out.println("Max value in arraylist is  "+max);
				break;
			case 8:
				int min=a.get(0);
				
				for(int i=0;i<a.size();i++) {
					if(a.get(i)<min)
					{
						max=a.get(i);
					}
				}
				System.out.println("Min value in arraylist is  "+min);
				break;
			case 9:
				System.out.println("Enter the value from arraylist");
				int n=sc.nextInt();
				System.out.println("Enter the number");
				int no=sc.nextInt();
				for(int i=0;i<a.size();i++)
				{
					if(a.get(i)==n) {
						a.set(i, no);
					}
				}
				break;
			case 10:
				System.out.println("Enter the value to be delete");
				int delete=sc.nextInt();
				
				for(int i=0;i<a.size();i++)
				{
					if(a.get(i)==delete) {
						a.remove(i);

					}
				}
				break;
			case 11:
				flag=false;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}while(flag);
		
		
		
	}

}
