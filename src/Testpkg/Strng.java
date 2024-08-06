package Testpkg;

public class Strng 
{
public static void main (String[] args)
{
	String string="the bst fo";
	int count=0;
	for(int i=0;i<string.length();i++)
	{
		if(string.charAt(i) !=' ')
			count++;
	}
	System.out.println("total no of charcters in string: " +count);
}
}
