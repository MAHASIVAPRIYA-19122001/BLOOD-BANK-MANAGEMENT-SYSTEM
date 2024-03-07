import java.sql.*;

public class Update
{
	String updid;
	String emailid;
	
	public Update()
	{
		updid=" ";
		emailid=" ";
	}

	public Update(String a,String b)
	{
		updid=a;
		emailid=b;
	}
	
	public String toString()
	{
		return updid +emailid;
	}
}

