import java.util.*;
public class countTheWords
{
	public static void main(String [] args)
	{
		String w ="Java is a object oriented programming language :)";
		String[] out= w.trim().split("\\s+");
		System.out.println("Number of words are ->"+ out.length);

}



}
