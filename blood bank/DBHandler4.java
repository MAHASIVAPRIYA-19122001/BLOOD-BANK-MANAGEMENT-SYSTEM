import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class DBHandler1()
 {
		String query,str;
		str=e.getActionCommand();
			Connection con;
		Statement st;
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex);
			System.exit(1);
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BloodbankDBs","root","");
			if(str.equals("Display")){
				JFrame f1=new JFrame("Display");
				JPanel p=new JPanel();
				p.setBackground(Color.yellow);
				JTextArea ta=new JTextArea();
				f1.setSize(500,500);
				f1.setVisible(true);
					query="SELECT * FROM patient";
					st=con.createStatement();
					rs=st.executeQuery(query);
					ta.append("pname  pid	  bloodgroup	  Emailid	   Address	\n");
					while(rs.next())
					{
						ta.append(rs.getString("pname")+"	"+rs.getString("pid")+"	  "+rs.getString("bloodgroup")+"	"+rs.getString("emailid")+"	   "+rs.getString("address")+"	 "+"\n");
					}
					p.add(ta);	
					f1.add(p);
					st.close();
					rs.close();
					
			}
			else if(str.equals("Search")){
				
				
				fsear.setVisible(true);
				
			}
				if(str.equals("OK")){
					String s=te.getText();
					//System.out.println("String:"+s);"+te.getText()+"
				
				query="SELECT * FROM patient  where pid='"+s+"'";
				st=con.createStatement();
				rs=st.executeQuery(query);
				tx.setText("");
				tx.append("pname   pid	  bloodgroup	  Emailid	   Address	\n");
				if(rs.next())
					System.out.println(rs.getString("pname"));
					tx.append(rs.getString("pname")+"	     "+rs.getString("pid")+"	     "+rs.getString("bloodgroup")+"	     "+rs.getString("emailid")+" 	    "+rs.getString("address")+"	     "+"\n");

				st.close();
				rs.close();
					
				}
			else if(str.equals("Delete")){
				
				fdel.setVisible(true);
				
				
			}
			if(str.equals("del")){
				String se=dt.getText();
				query="delete FROM patient  where pid='"+se+"'";
				st=con.createStatement();
				st.executeUpdate(query);
				st.close();
				//rs.close();
				
			}
			else if(str.equals("Insert")){
				fin.setVisible(true);
				
			}
			if(str.equals("INS")){
				String n=in1.getText();
				String i=in2.getText();
				int ag=Integer.parseInt(in3.getText());
                int r=Integer.parseInt(in4.getText());
				String b=in5.getText();
				query="insert into patient values('"+n+"','"+i+"',"+ag+",'"+r+"','"+b+"')";
				st=con.createStatement();
				st.executeUpdate(query);
				st.close();
				
			}
			else if(str.equals("Update")){
				fup.setVisible(true);
			}
			if(str.equals("UP")){
				String id=i0.getText();
				String un=i1.getText();
				//String ui=i2.getText();
				int uag=Integer.parseInt(i3.getText());
                int ay=Integer.parseInt(in4.getText());
				String ub=i5.getText();
				query="UPDATE patient SET pname='"+un+"',pid="+id+",bloodgroup='"+uag+"',emailid='"+ay+"',address="+ub+" WHERE pid='"+id+"'";
				st=con.createStatement();
				st.executeUpdate(query);
				st.close();
				
			}
			if(str.equals("HOME")){
				f.setVisible(true);
				fsear.dispose();
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
			System.exit(1);
		}
		
	}
}
