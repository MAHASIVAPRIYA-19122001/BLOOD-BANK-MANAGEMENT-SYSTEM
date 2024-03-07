import java.sql.*;

public class Bloodbank
{
	 public String Bloodbankname;
	 public String Bloodbankid;
	 public String Branchname;
	 public String Emailid;
	 public String Address;
	 //public String Cocurricular;
	 public Bloodbank(){}
	 public Bloodbank(String a,String b,String c,String d,String e)
	{
		Bloodbankname=a;
		Bloodbankid=b;
		Branchname=c;
		Emailid=d;
		Address=e;
		//Cocurricular=f;		
	}		
	
	public String toString()
	{
		return Bloodbankname + Bloodbankid + Branchname + Emailid + Address;
	}
}