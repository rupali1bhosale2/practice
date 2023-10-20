
public class Examstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is the object that has sequence of character
		// Literal string as it will create same values for oneo bjects
		String s ="Rupali Gaikwad";
		String s1 = "RupaliGaikwad";
		
		//object string will create object and variable to refer to it =new operater
		String s2 = new String ("Welcome");
		String s3 = new String ("Welcome");

		String s4 = "Rahul Shetty Academy";
		String[] splitcharc = s4.split("Shetty");
		System.out.println(splitcharc[0]);
		System.out.println(splitcharc[1]);
		System.out.println(splitcharc[1].trim());
		for(int i=0;i<s4.length();i++)
		{
			System.out.println(s4.charAt(i));
			
		}
System.out.println("$$$$$$$$");
		for(int i=s4.length()-1;i>=0;i--)
		{
			System.out.println(s4.charAt(i));
			
		}

		
	}

}
