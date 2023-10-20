import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javacoredatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2={1,2,3,4,6,7,8,9,122};
		for (int i = 0;i<arr2.length;i++)
		{
			if (arr2[i]%3 == 0)
		{
			System.out.println(arr2[i]);
		}
			else
			{
				System.out.println(arr2[i]+ "is not multiple of 3");
			}
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Rupali");
		a.add("getting");
		a.add("Job");
		System.out.println(a.get(2));
		
		for(int i = 0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("@@@@@@@@@");	
		for(String val:a)
		{
			System.out.println(val);
		}
		System.out.println(a.contains("Job"));
		String[] name = {"array","Selenium","array1ist"};
		List<String> arrayname = Arrays.asList(name);
		System.out.println(arrayname.contains("Selenium"));
		

		
}}
