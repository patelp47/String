import java.util.ArrayList;

public class Chal 
{
	private ArrayList<String>  arS = new ArrayList<String>(); //Created an arrayList to store the array parameter
	
	public Chal(String parm[]) //Constructor with list/array of strings as a parameter
	{
		for(String e: parm) // For each through each string to add it to the arrayList
		{
			arS.add(e);
		}
	}
	
	public void rep() // Method  to replace '&' with "and" and print the Strings
	{
		for(String e : arS) //For each through each string
		{
			e = e.replace("&", "and"); //Replace "&" with "and"
			System.out.println(e); //Print out each string that passes through
		}
	}
}
