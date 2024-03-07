import java.sql.*;

public class Admin
{
	String Uname;
	String Pwd;
	
	public Admin()
	{
		Uname=" ";
		Pwd=" ";
	}

	public Admin(String a,String b)
	{
		Uname=a;
		Pwd=b;
	}
	
	public String toString()
	{
		return Uname +Pwd;
	}
}
