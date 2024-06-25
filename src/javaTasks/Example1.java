package javaTasks;

public class Example1 {

	public static void main(String[] args) 
	{

		int vaishnavi = 25, pankaj = 23, Avinash = 26;
		
		String person1 = "Vaishnavi";
		String person2 = "Pankaj";
		String person3 = "Avinash";
		
		String result = (vaishnavi < pankaj) ? ((vaishnavi < Avinash) ? person1 : person3) : ((Avinash < pankaj) ? person3 : person2);
					
		System.out.println(result);

	}

}
