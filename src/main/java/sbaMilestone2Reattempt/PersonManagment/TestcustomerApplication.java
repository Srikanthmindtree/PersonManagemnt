package sbaMilestone2Reattempt.PersonManagment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class TestcustomerApplication {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<customer> list = new ArrayList<customer>();
		list.add(new customer(1,"sachin",21,3200));
		list.add(new customer(2,"shewag",18,3040));
		list.add(new customer(3,"virat",20,2800));
		list.add(new customer(4,"raina",26,2780));
		list.add(new customer(5,"rahul",22,2460));
		list.add(new customer(6,"dhoni",27,3345));
		list.add(new customer(7,"shardul",30,2280));
		list.add(new customer(8,"bumhra",28,2570));
		list.add(new customer(9,"bhuvi",33,2820));
		list.add(new customer(10,"mishra",32,2989));
		int l=list.size();
		Scanner sc=new Scanner(System.in);
		String ifok = "ok";
		while(ifok == "ok") {
		
			String a="False";
			System.out.println("enter your option");
			System.out.println("1.Customer Data with  ascending order 2. update Customer Purchase Amount 3.exit");
			
			int a1=sc.nextInt();
			switch(a1) {
			
			case 1:
				System.out.println("DISPLAYING CUSTOMER DATA");
				
				System.out.println("id"+" "+  "name"+" age"+ " "+"purchase amount" );
			System.out.println();
		
				System.out.println("Customer data in ascending order by thier names");
				Collections.sort(list);
				System.out.println();
				for(customer l1:list) {
					System.out.println(l1.id+"- "+l1.name+"- "+l1.age+" -"+l1.puramount);
					
				}
				break;
			case 2:
				System.out.println("Please Enter Customer Id to Update Purchase Amount");
				int b = sc.nextInt();
				int z=0;
				for(int i=0;i<l;i++) {
				
					if(list.get(i).id==b) {
					
						z=i;
					a="True";
					}
				}
				try {
				
					if("False".equals(a))
					{
						throw new Exception("Invalid customer id please check once...");}
					
					}
					
					
				catch(Exception e) {
				
					System.out.println(e.getMessage());
				
				break;
			}
				System.out.println("Please Enter New Purchase Amount");
				int c=sc.nextInt();
				list.get(z).setpuramount(c);
				System.out.println("updation succesfull");
				break;
			  case 3:
				  
					ifok="stop";
					System.out.println("exit");
					break;
		}
		
		
		
		
		
		}
		}

}
