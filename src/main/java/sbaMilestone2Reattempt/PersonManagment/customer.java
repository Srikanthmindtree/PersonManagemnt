package sbaMilestone2Reattempt.PersonManagment;


public class customer  implements Comparable<customer>{
		int id;
		String name;
		int age;
		int puramount;
		
		public customer(int id, String name, int age, int puramount) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.puramount= puramount;
			
		}


		public void setpuramount(int id)
		{
			this.puramount=id;
		}
		public int compareTo(customer st)
		{
			if(name ==st.name)
			return 0;
			else if(name.compareTo(st.name)>0)
				return 1;
			else return -1;
		}

}
