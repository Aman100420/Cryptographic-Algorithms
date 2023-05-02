import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class JavaMD5Hash 
{
	public static void main(String[] args) 
	{
		System.out.println("Null value applying md5 " + md5("") +"\n");
		System.out.println("Simple text "+ "WELCOME TO VIT UNIVERSITY"+"\n");
		System.out.println("Simple text applying md5 "+ md5("WELCOME TO VIT UNIVERSITY")+"\n");
		System.out.println("Simple numbers " + md5("123456789"));
		System.out.println("Simple numbers applying md5 " + md5("123456789"));
	}
	public static String md5(String input) 
	{
		String md5 = null;
		if(null == input) 
			return null;
		try 
		{	
			MessageDigest digest = MessageDigest.getInstance("MD5"); //Create MessageDigest object for MD5
			digest.update(input.getBytes(), 0, input.length()); //Update input string in message digest
			md5 = new BigInteger(1, digest.digest()).toString(16); //Converts message digest value in base 16 (hex)
		}
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		return md5;
	}
}