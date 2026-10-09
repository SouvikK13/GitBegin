public class reverseString {
	public static void main(String[] args) {
	String r = "Land Rover";
	String b = " ";
	
	for(int i =r.length()-1; i>=0; i--)
	{
		b= b +  r.charAt(i); 
	}
	System.out.println(b);
}
}
