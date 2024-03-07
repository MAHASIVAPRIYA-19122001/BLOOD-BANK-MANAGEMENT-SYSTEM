import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class BloodbankDB implements ActionListener {
	          JFrame f;
		JPanel pMenu,psear,pdel,pin,pup,po;
		JButton bDisp,bser,bin,bdel,bup,ok,del,in,up,home;
		JFrame fsear,fdel,fin,fup;
		JTextArea tx;
		JLabel bid1,bid2,ij1,ij2,ij3,ij4,ij5,ij6,uj1,uj2,uj3,uj4,uj5,uj6,uj7;
		JTextField te,dt,i0,i1,i2,i3,i4,i5,i6,in1,in2,in3,in4,in5,in6;
	public static void main(String[] args) {
		BloodbankDB bd=new BloodbankDB();
	}
	public BloodbankDB() {
		
		f=new JFrame("BLOODBANK MANAGEMENT SYSTEM             :)");
		f.setVisible(true);
		f.setSize(500,500);
                home=new JButton("HOME");
		pMenu=new JPanel();
		pMenu.setBackground(Color.pink);
		bDisp=new JButton("BLOODBANK");
		bDisp.addActionListener(this);
		pMenu.add(bDisp);
		f.add(pMenu);
                uj7=new JLabel("Bloodbank Management System");
                uj7.setFont(new Font("serif",Font.BOLD,50));
                pMenu.add(uj7);
                f.add(pMenu);

		bser= new JButton("DONAR");
		bser.addActionListener(this);
		pMenu.add(bser);
		f.add(pMenu);		
		bin=new JButton("LABASSISTANT");
		bin.addActionListener(this);
		pMenu.add(bin);
		f.add(pMenu);
		bdel=new JButton("PATIENT");
		bdel.addActionListener(this);
		pMenu.add(bdel);
		f.add(pMenu);
		bup=new JButton("HOSPITAL");
		bup.addActionListener(this);
		pMenu.add(bup);
		pMenu.setLayout(null);
		bDisp.setBounds(150,30,150,25);
		bser.setBounds(150,80,150,25);
		bin.setBounds(150,130,150,25);
		bdel.setBounds(150,180,150,25);
		bup.setBounds(150,230,150,25);
		f.add(pMenu);
		
		tx=new JTextArea();
		te=new JTextField(50);
		fsear=new JFrame("search");
		psear=new JPanel();
		ok=new JButton("OK");
		bid1=new JLabel("Donar ID");
		psear.setLayout(null);
		bid1.setBounds(200,25,50,25);
		psear.add(bid1);
		te.setBounds(251,25,100,25);
		psear.add(te);
		tx.setBounds(10,75,500,75);
		psear.add(tx);
		ok.setBounds(200,150,100,25);
		psear.add(ok);
		home.setBounds(325,150,100,25);
		psear.add(home);
		psear.setBackground(Color.orange);
		fsear.add(psear);
		fsear.setSize(500,500);
		ok.addActionListener(this);
		
		dt=new JTextField(50);
		fdel=new JFrame("Delete");
		pdel=new JPanel();
		pdel.setBackground(Color.orange);
		pup=new JPanel();
		del=new JButton("del");
		pdel.add(dt);
		pdel.add(del);
		fdel.add(pdel);
		fdel.setSize(500,500);
		del.addActionListener(this);
		pin=new JPanel();
		pin.setLayout(null);
		pup.setLayout(null);
		ij1=new JLabel("Donar name:");
		ij2=new JLabel("Donar id:");
		ij3=new JLabel("Age:");
		ij4=new JLabel("Emailid:");
		ij5=new JLabel("Address:");
		
		uj1=new JLabel("Donar name:");
		uj2=new JLabel("Donar id :");
		uj3=new JLabel("Age:");
		uj4=new JLabel("Emailid:");
		uj5=new JLabel("Address:");
		
		
		ij1.setBounds(150,25,75,25);
		pin.add(ij1);
		ij2.setBounds(150,75,75,25);
		pin.add(ij2);
		ij3.setBounds(150,125,75,25);
		pin.add(ij3);
		ij4.setBounds(150,175,75,25);
		pin.add(ij4);
		ij5.setBounds(150,225,75,25);
		pin.add(ij5);
		ij6.setBounds(150,275,75,25);
		pin.add(ij6);
		
		in1=new JTextField(50);
		in2=new JTextField(50);
		in3=new JTextField(50);
		in4=new JTextField(50);
		in5=new JTextField(50);
		in6=new JTextField(50);
		
		i0=new JTextField(50);
		i1=new JTextField(50);
		//i2=new JTextField(10);
		i3=new JTextField(50);
		i4=new JTextField(50);
		i5=new JTextField(50);
		i6=new JTextField(50);
		uj1.setBounds(150,25,75,25);
		pup.add(uj1);
		uj2.setBounds(150,75,75,25);
		pup.add(uj2);
		uj3.setBounds(150,125,75,25);
		pup.add(uj3);
		uj4.setBounds(150,175,75,25);
		pup.add(uj4);
		uj5.setBounds(150,225,75,25);
		pup.add(uj5);
		uj6.setBounds(150,275,75,25);
		pup.add(uj6);
		
		pup.add(i0);
		i0.setBounds(230,25,100,25);
		pup.add(i1);
		i1.setBounds(230,75,100,25);
		pup.add(i3);
		i3.setBounds(230,125,100,25);
		pup.add(i4);
		i4.setBounds(230,175,100,25);
		pup.add(i5);
		i5.setBounds(230,225,100,25);
		pup.add(i6);
		i6.setBounds(230,275,100,25);
		up=new JButton("UP");
		up.setBounds(210,320,60,30);
		pup.add(up);
		pup.setBackground(Color.orange);
		pin.setBackground(Color.orange);
		fin=new JFrame("Insert");
		
		in=new JButton("INS");
		//pin.add(i0);
		pin.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		pin.add(in);
		fin.add(pin);
		fin.setSize(500,500);
		in.addActionListener(this);
		
		fup=new JFrame("Update")
		fup.add(pup);
		fup.setSize(500,500);
		up.addActionListener(this);

	}
	public Donar extends JFrame
	{
		
		f=new JFrame("Menu");
		f.setVisible(true);
		f.setSize(500,500);
                home=new JButton("HOME");
		pMenu=new JPanel();
		pMenu.setBackground(Color.pink);
		bDisp=new JButton("Display");
		bDisp.addActionListener(this);
		pMenu.add(bDisp);
		f.add(pMenu);
                uj7=new JLabel("Bloodbank Management System");
                uj7.setFont(new Font("serif",Font.BOLD,18));
                pMenu.add(uj7);
                f.add(pMenu);

		bser= new JButton("Search");
		bser.addActionListener(this);
		pMenu.add(bser);
		f.add(pMenu); 
		bin=new JButton("Insert");
		bin.addActionListener(this);
		pMenu.add(bin);
		f.add(pMenu);
		bdel=new JButton("Delete");
		bdel.addActionListener(this);
		pMenu.add(bdel);
		f.add(pMenu);
		bup=new JButton("Update");
		bup.addActionListener(this);
		pMenu.add(bup);
		pMenu.setLayout(null);
		bDisp.setBounds(150,30,75,25);
		bser.setBounds(150,80,75,25);
		bin.setBounds(150,130,75,25);
		bdel.setBounds(150,180,75,25);
		bup.setBounds(150,230,75,25);
		f.add(pMenu);
		
		tx=new JTextArea();
		te=new JTextField(10);
		fsear=new JFrame("search");
		psear=new JPanel();
		ok=new JButton("OK");
		bid1=new JLabel("Bloodbank ID");
		psear.setLayout(null);
		bid1.setBounds(200,25,50,25);
		psear.add(bid1);
		te.setBounds(251,25,100,25);
		psear.add(te);
		tx.setBounds(10,75,500,75);
		psear.add(tx);
		ok.setBounds(200,150,100,25);
		psear.add(ok);
		home.setBounds(325,150,100,25);
		psear.add(home);
		psear.setBackground(Color.orange);
		fsear.add(psear);
		fsear.setSize(500,500);
		ok.addActionListener(this);
		
		dt=new JTextField(10);
		fdel=new JFrame("Delete");
		pdel=new JPanel();
		pdel.setBackground(Color.orange);
		pup=new JPanel();
		del=new JButton("del");
		pdel.add(dt);
		pdel.add(del);
		fdel.add(pdel);
		fdel.setSize(500,500);
		del.addActionListener(this);
		pin=new JPanel();
		pin.setLayout(null);
		pup.setLayout(null);
		ij1=new JLabel("Bloodbank name:");
		ij2=new JLabel("Bloodbank id:");
		ij3=new JLabel("Branchname:");
		ij4=new JLabel("Emailid:");
		ij5=new JLabel("Address:");
		
		uj1=new JLabel("Bloodbank name:");
		uj2=new JLabel("Bloodbank id :");
		uj3=new JLabel("Branchname:");
		uj4=new JLabel("Emailid:");
		uj5=new JLabel("Address:");
		
		
		ij1.setBounds(150,25,75,25);
		pin.add(ij1);
		ij2.setBounds(150,75,75,25);
		pin.add(ij2);
		ij3.setBounds(150,125,75,25);
		pin.add(ij3);
		ij4.setBounds(150,175,75,25);
		pin.add(ij4);
		ij5.setBounds(150,225,75,25);
		pin.add(ij5);
		ij6.setBounds(150,275,75,25);
		pin.add(ij6);
		
		in1=new JTextField(10);
		in2=new JTextField(10);
		in3=new JTextField(10);
		in4=new JTextField(10);
		in5=new JTextField(10);
		in6=new JTextField(10);
		
		i0=new JTextField(10);
		i1=new JTextField(10);
		//i2=new JTextField(10);
		i3=new JTextField(10);
		i4=new JTextField(10);
		i5=new JTextField(10);
		i6=new JTextField(10);
		uj1.setBounds(150,25,75,25);
		pup.add(uj1);
		uj2.setBounds(150,75,75,25);
		pup.add(uj2);
		uj3.setBounds(150,125,75,25);
		pup.add(uj3);
		uj4.setBounds(150,175,75,25);
		pup.add(uj4);
		uj5.setBounds(150,225,75,25);
		pup.add(uj5);
		uj6.setBounds(150,275,75,25);
		pup.add(uj6);
		
		pup.add(i0);
		i0.setBounds(230,25,100,25);
		pup.add(i1);
		i1.setBounds(230,75,100,25);
		pup.add(i3);
		i3.setBounds(230,125,100,25);
		pup.add(i4);
		i4.setBounds(230,175,100,25);
		pup.add(i5);
		i5.setBounds(230,225,100,25);
		pup.add(i6);
		i6.setBounds(230,275,100,25);
		up=new JButton("UP");
		up.setBounds(210,320,60,30);
		pup.add(up);
		pup.setBackground(Color.orange);
		pin.setBackground(Color.orange);
		fin=new JFrame("Insert");
		
		in=new JButton("INS");
		//pin.add(i0);
		pin.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		pin.add(in);
		fin.add(pin);
		fin.setSize(500,500);
		in.addActionListener(this);
		
		fup=new JFrame("Update");
		fup.add(pup);
		fup.setSize(500,500);
		up.addActionListener(this);

	}
	public BloodbankDB extends JFrame
	{
		
		f=new JFrame("Menu");
		f.setVisible(true);
		f.setSize(500,500);
                home=new JButton("HOME");
		pMenu=new JPanel();
		pMenu.setBackground(Color.GREEN);
		bDisp=new JButton("Display");
		bDisp.addActionListener(this);
		pMenu.add(bDisp);
		f.add(pMenu);
                uj7=new JLabel("Bloodbank Management System");
                uj7.setFont(new Font("serif",Font.BOLD,18));
                pMenu.add(uj7);
                f.add(pMenu);

		bser= new JButton("Search");
		bser.addActionListener(this);
		pMenu.add(bser);
		f.add(pMenu); 
		bin=new JButton("Insert");
		bin.addActionListener(this);
		pMenu.add(bin);
		f.add(pMenu);
		bdel=new JButton("Delete");
		bdel.addActionListener(this);
		pMenu.add(bdel);
		f.add(pMenu);
		bup=new JButton("Update");
		bup.addActionListener(this);
		pMenu.add(bup);
		pMenu.setLayout(null);
		bDisp.setBounds(150,30,75,25);
		bser.setBounds(150,80,75,25);
		bin.setBounds(150,130,75,25);
		bdel.setBounds(150,180,75,25);
		bup.setBounds(150,230,75,25);
		f.add(pMenu);
		
		tx=new JTextArea();
		te=new JTextField(10);
		fsear=new JFrame("search");
		psear=new JPanel();
		ok=new JButton("OK");
		bid1=new JLabel("Donar ID");
		psear.setLayout(null);
		bid1.setBounds(200,25,50,25);
		psear.add(bid1);
		te.setBounds(251,25,100,25);
		psear.add(te);
		tx.setBounds(10,75,500,75);
		psear.add(tx);
		ok.setBounds(200,150,100,25);
		psear.add(ok);
		home.setBounds(325,150,100,25);
		psear.add(home);
		psear.setBackground(Color.blue);
		fsear.add(psear);
		fsear.setSize(500,500);
		ok.addActionListener(this);
		
		dt=new JTextField(10);
		fdel=new JFrame("Delete");
		pdel=new JPanel();
		pdel.setBackground(Color.blue);
		pup=new JPanel();
		del=new JButton("del");
		pdel.add(dt);
		pdel.add(del);
		fdel.add(pdel);
		fdel.setSize(500,500);
		del.addActionListener(this);
		pin=new JPanel();
		pin.setLayout(null);
		pup.setLayout(null);
		ij1=new JLabel("Donar name:");
		ij2=new JLabel("Donar id:");
		ij3=new JLabel("Age:");
		ij4=new JLabel("Emailid:");
		ij5=new JLabel("Address:");
		
		uj1=new JLabel("Donar name:");
		uj2=new JLabel("Donar id :");
		uj3=new JLabel("Age:");
		uj4=new JLabel("Emailid:");
		uj5=new JLabel("Address:");
		
		
		ij1.setBounds(150,25,75,25);
		pin.add(ij1);
		ij2.setBounds(150,75,75,25);
		pin.add(ij2);
		ij3.setBounds(150,125,75,25);
		pin.add(ij3);
		ij4.setBounds(150,175,75,25);
		pin.add(ij4);
		ij5.setBounds(150,225,75,25);
		pin.add(ij5);
		ij6.setBounds(150,275,75,25);
		pin.add(ij6);
		
		in1=new JTextField(10);
		in2=new JTextField(10);
		in3=new JTextField(10);
		in4=new JTextField(10);
		in5=new JTextField(10);
		in6=new JTextField(10);
		
		i0=new JTextField(10);
		i1=new JTextField(10);
		//i2=new JTextField(10);
		i3=new JTextField(10);
		i4=new JTextField(10);
		i5=new JTextField(10);
		i6=new JTextField(10);
		uj1.setBounds(150,25,75,25);
		pup.add(uj1);
		uj2.setBounds(150,75,75,25);
		pup.add(uj2);
		uj3.setBounds(150,125,75,25);
		pup.add(uj3);
		uj4.setBounds(150,175,75,25);
		pup.add(uj4);
		uj5.setBounds(150,225,75,25);
		pup.add(uj5);
		uj6.setBounds(150,275,75,25);
		pup.add(uj6);
		
		pup.add(i0);
		i0.setBounds(230,25,100,25);
		pup.add(i1);
		i1.setBounds(230,75,100,25);
		pup.add(i3);
		i3.setBounds(230,125,100,25);
		pup.add(i4);
		i4.setBounds(230,175,100,25);
		pup.add(i5);
		i5.setBounds(230,225,100,25);
		pup.add(i6);
		i6.setBounds(230,275,100,25);
		up=new JButton("UP");
		up.setBounds(210,320,60,30);
		pup.add(up);
		pup.setBackground(Color.blue);
		pin.setBackground(Color.blue);
		fin=new JFrame("Insert");
		
		in=new JButton("INS");
		//pin.add(i0);
		pin.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		pin.add(in);
		fin.add(pin);
		fin.setSize(500,500);
		in.addActionListener(this);
		
		fup=new JFrame("Update");
		fup.add(pup);
		fup.setSize(500,500);
		up.addActionListener(this);

	}
	public labassistant extends Jframe
	{
		
		f=new JFrame("Menu");
		f.setVisible(true);
		f.setSize(500,500);
                home=new JButton("HOME");
		pMenu=new JPanel();
		pMenu.setBackground(Color.BLUE
		bDisp=new JButton("Display");
		bDisp.addActionListener(this);
		pMenu.add(bDisp);
		f.add(pMenu);
                uj7=new JLabel("labassistant")
                uj7.setFont(new Font("serif",Font.BOLD,18));
                pMenu.add(uj7);
                f.add(pMenu);

		bser= new JButton("Search");
		bser.addActionListener(this);
		pMenu.add(bser);
		f.add(pMenu); 
		bin=new JButton("Insert");
		bin.addActionListener(this);
		pMenu.add(bin);
		f.add(pMenu);
		bdel=new JButton("Delete");
		bdel.addActionListener(this);
		pMenu.add(bdel);
		f.add(pMenu);
		bup=new JButton("Update");
		bup.addActionListener(this);
		pMenu.add(bup);
		pMenu.setLayout(null);
		bDisp.setBounds(150,30,75,25);
		bser.setBounds(150,80,75,25);
		bin.setBounds(150,130,75,25);
		bdel.setBounds(150,180,75,25);
		bup.setBounds(150,230,75,25);
		f.add(pMenu);
		
		tx=new JTextArea();
		te=new JTextField(10);
		fsear=new JFrame("search");
		psear=new JPanel();
		ok=new JButton("OK");
		bid1=new JLabel("Labassistant Id")
		psear.setLayout(null);
		bid1.setBounds(200,25,50,25);
		psear.add(bid1);
		te.setBounds(251,25,100,25);
		psear.add(te);
		tx.setBounds(10,75,500,75);
		psear.add(tx);
		ok.setBounds(200,150,100,25);
		psear.add(ok);
		home.setBounds(325,150,100,25);
		psear.add(home);
		psear.setBackground(Color.blue);
		fsear.add(psear);
		fsear.setSize(500,500);
		ok.addActionListener(this);
		
		dt=new JTextField(10);
		fdel=new JFrame("Delete");
		pdel=new JPanel();
		pdel.setBackground(Color.blue);
		pup=new JPanel();
		del=new JButton("del");
		pdel.add(dt);
		pdel.add(del);
		fdel.add(pdel);
		fdel.setSize(500,500);
		del.addActionListener(this);
		pin=new JPanel();
		pin.setLayout(null);
		pup.setLayout(null);
		ij1=new JLabel("labassistant name");
		ij2=new JLabel("Labassistant Id:");
		ij3=new JLabel("qualification");
		ij4=new JLabel("Emailid:");
		ij5=new JLabel("Location");
		
		uj1=new JLabel(" labassistant name:");
		uj2=new JLabel ("Labassistant Id:");
		uj3=new JLabel("qualification");
		uj4=new JLabel("Emailid:");
		uj5=new JLabel ("Emailid:");
		
		
		ij1.setBounds(150,25,75,25);
		pin.add(ij1);
		ij2.setBounds(150,75,75,25);
		pin.add(ij2);
		ij3.setBounds(150,125,75,25);
		pin.add(ij3);
		ij4.setBounds(150,175,75,25);
		pin.add(ij4);
		ij5.setBounds(150,225,75,25);
		pin.add(ij5);
		ij6.setBounds(150,275,75,25);
		pin.add(ij6);
		
		in1=new JTextField(10);
		in2=new JTextField(10);
		in3=new JTextField(10);
		in4=new JTextField(10);
		in5=new JTextField(10);
		in6=new JTextField(10);
		
		i0=new JTextField(10);
		i1=new JTextField(10);
		//i2=new JTextField(10);
		i3=new JTextField(10);
		i4=new JTextField(10);
		i5=new JTextField(10);
		i6=new JTextField(10);
		uj1.setBounds(150,25,75,25);
		pup.add(uj1);
		uj2.setBounds(150,75,75,25);
		pup.add(uj2);
		uj3.setBounds(150,125,75,25);
		pup.add(uj3);
		uj4.setBounds(150,175,75,25);
		pup.add(uj4);
		uj5.setBounds(150,225,75,25);
		pup.add(uj5);
		uj6.setBounds(150,275,75,25);
		pup.add(uj6);
		
		pup.add(i0);
		i0.setBounds(230,25,100,25);
		pup.add(i1);
		i1.setBounds(230,75,100,25);
		pup.add(i3);
		i3.setBounds(230,125,100,25);
		pup.add(i4);
		i4.setBounds(230,175,100,25);
		pup.add(i5);
		i5.setBounds(230,225,100,25);
		pup.add(i6);
		i6.setBounds(230,275,100,25);
		up=new JButton("UP");
		up.setBounds(210,320,60,30);
		pup.add(up);
		pup.setBackground(Color.blue);
		pin.setBackground(Color.blue);
		fin=new JFrame("Insert");
		
		in=new JButton("INS");
		//pin.add(i0);
		pin.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		pin.add(in);
		fin.add(pin);
		
		/*pup.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		*/
		fin.setSize(500,500);
		in.addActionListener(this);
		
		fup=new JFrame("Update");

		
		/*pup.add(i0);
		pup.add(i1);
		//pup.add(i2);
		pup.add(i3);
		pup.add(i4);
		pup.add(i5);
		pup.add(i6);
		*/
		fup.add(pup);
		fup.setSize(500,500);
		up.addActionListener(this);

	}
	public patient extends Jframe
	{
		
		f=new JFrame("Menu");
		f.setVisible(true);
		f.setSize(500,500);
                home=new JButton("HOME");
		pMenu=new JPanel();
		pMenu.setBackground(Color.GREEN);
		bDisp=new JButton("Display");
		bDisp.addActionListener(this);
		pMenu.add(bDisp);
		f.add(pMenu);
                uj7=new JLabel("Bloodbank Management System");
                uj7.setFont(new Font("serif",Font.BOLD,18));
                pMenu.add(uj7);
                f.add(pMenu);

		bser= new JButton("Search");
		bser.addActionListener(this);
		pMenu.add(bser);
		f.add(pMenu); 
		bin=new JButton("Insert");
		bin.addActionListener(this);
		pMenu.add(bin);
		f.add(pMenu);
		bdel=new JButton("Delete");
		bdel.addActionListener(this);
		pMenu.add(bdel);
		f.add(pMenu);
		bup=new JButton("Update");
		bup.addActionListener(this);
		pMenu.add(bup);
		pMenu.setLayout(null);
		bDisp.setBounds(150,30,75,25);
		bser.setBounds(150,80,75,25);
		bin.setBounds(150,130,75,25);
		bdel.setBounds(150,180,75,25);
		bup.setBounds(150,230,75,25);
		f.add(pMenu);
		
		tx=new JTextArea();
		te=new JTextField(10);
		fsear=new JFrame("search");
		psear=new JPanel();
		ok=new JButton("OK");
		bid1=new JLabel("patient Id");
		psear.setLayout(null);
		bid1.setBounds(200,25,50,25);
		psear.add(bid1);
		te.setBounds(251,25,100,25);
		psear.add(te);
		tx.setBounds(10,75,500,75);
		psear.add(tx);
		ok.setBounds(200,150,100,25);
		psear.add(ok);
		home.setBounds(325,150,100,25);
		psear.add(home);
		psear.setBackground(Color.blue);
		fsear.add(psear);
		fsear.setSize(500,500);
		ok.addActionListener(this);
		
		dt=new JTextField(10);
		fdel=new JFrame("Delete");
		pdel=new JPanel();
		pdel.setBackground(Color.blue);
		pup=new JPanel();
		del=new JButton("del");
		pdel.add(dt);
		pdel.add(del);
		fdel.add(pdel);
		fdel.setSize(500,500);
		del.addActionListener(this);
		pin=new JPanel();
		pin.setLayout(null);
		pup.setLayout(null);
		ij1=new JLabel("Patient name:");
		ij2=new JLabel("Patient Id:);
		ij3=new JLabel("Age:");
		ij4=new JLabel("Emailid:");
		ij5=new JLabel("Address:");
		
		uj1=new JLabel("Patient name:");
		uj2=new JLabel("Patient Id:);
		uj3=new JLabel("Age:");
		uj4=new JLabel("Emailid:");
		uj5=new JLabel("Address:");
		
		
		ij1.setBounds(150,25,75,25);
		pin.add(ij1);
		ij2.setBounds(150,75,75,25);
		pin.add(ij2);
		ij3.setBounds(150,125,75,25);
		pin.add(ij3);
		ij4.setBounds(150,175,75,25);
		pin.add(ij4);
		ij5.setBounds(150,225,75,25);
		pin.add(ij5);
		ij6.setBounds(150,275,75,25);
		pin.add(ij6);
		
		in1=new JTextField(10);
		in2=new JTextField(10);
		in3=new JTextField(10);
		in4=new JTextField(10);
		in5=new JTextField(10);
		in6=new JTextField(10);
		
		i0=new JTextField(10);
		i1=new JTextField(10);
		//i2=new JTextField(10);
		i3=new JTextField(10);
		i4=new JTextField(10);
		i5=new JTextField(10);
		i6=new JTextField(10);
		uj1.setBounds(150,25,75,25);
		pup.add(uj1);
		uj2.setBounds(150,75,75,25);
		pup.add(uj2);
		uj3.setBounds(150,125,75,25);
		pup.add(uj3);
		uj4.setBounds(150,175,75,25);
		pup.add(uj4);
		uj5.setBounds(150,225,75,25);
		pup.add(uj5);
		uj6.setBounds(150,275,75,25);
		pup.add(uj6);
		
		pup.add(i0);
		i0.setBounds(230,25,100,25);
		pup.add(i1);
		i1.setBounds(230,75,100,25);
		pup.add(i3);
		i3.setBounds(230,125,100,25);
		pup.add(i4);
		i4.setBounds(230,175,100,25);
		pup.add(i5);
		i5.setBounds(230,225,100,25);
		pup.add(i6);
		i6.setBounds(230,275,100,25);
		up=new JButton("UP");
		up.setBounds(210,320,60,30);
		pup.add(up);
		pup.setBackground(Color.blue);
		pin.setBackground(Color.blue);
		fin=new JFrame("Insert");
		
		in=new JButton("INS");
		//pin.add(i0);
		pin.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		pin.add(in);
		fin.add(pin);
		fin.setSize(500,500);
		in.addActionListener(this);
		
		fup=new JFrame("Update");
		fup.add(pup);
		fup.setSize(500,500);
		up.addActionListener(this);

	}
	public Hospital extends Jframe
	{
		
		f=new JFrame("Menu");
		f.setVisible(true);
		f.setSize(500,500);
                home=new JButton("HOME");
		pMenu=new JPanel();
		pMenu.setBackground(Color.GREEN);
		bDisp=new JButton("Display");
		bDisp.addActionListener(this);
		pMenu.add(bDisp);
		f.add(pMenu);
                uj7=new JLabel("Bloodbank Management System");
                uj7.setFont(new Font("serif",Font.BOLD,18));
                pMenu.add(uj7);
                f.add(pMenu);

		bser= new JButton("Search");
		bser.addActionListener(this);
		pMenu.add(bser);
		f.add(pMenu); 
		bin=new JButton("Insert");
		bin.addActionListener(this);
		pMenu.add(bin);
		f.add(pMenu);
		bdel=new JButton("Delete");
		bdel.addActionListener(this);
		pMenu.add(bdel);
		f.add(pMenu);
		bup=new JButton("Update");
		bup.addActionListener(this);
		pMenu.add(bup);
		pMenu.setLayout(null);
		bDisp.setBounds(150,30,75,25);
		bser.setBounds(150,80,75,25);
		bin.setBounds(150,130,75,25);
		bdel.setBounds(150,180,75,25);
		bup.setBounds(150,230,75,25);
		f.add(pMenu);
		
		tx=new JTextArea();
		te=new JTextField(10);
		fsear=new JFrame("search");
		psear=new JPanel();
		ok=new JButton("OK");
		bid1=new JLabel("Donar ID");
		psear.setLayout(null);
		bid1.setBounds(200,25,50,25);
		psear.add(bid1);
		te.setBounds(251,25,100,25);
		psear.add(te);
		tx.setBounds(10,75,500,75);
		psear.add(tx);
		ok.setBounds(200,150,100,25);
		psear.add(ok);
		home.setBounds(325,150,100,25);
		psear.add(home);
		psear.setBackground(Color.blue);
		fsear.add(psear);
		fsear.setSize(500,500);
		ok.addActionListener(this);
		
		dt=new JTextField(10);
		fdel=new JFrame("Delete");
		pdel=new JPanel();
		pdel.setBackground(Color.blue);
		pup=new JPanel();
		del=new JButton("del");
		pdel.add(dt);
		pdel.add(del);
		fdel.add(pdel);
		fdel.setSize(500,500);
		del.addActionListener(this);
		pin=new JPanel();
		pin.setLayout(null);
		pup.setLayout(null);
		ij1=new JLabel("Donar name:");
		ij2=new JLabel("Donar id:");
		ij3=new JLabel("Age:");
		ij4=new JLabel("Emailid:");
		ij5=new JLabel("Address:");
		
		uj1=new JLabel("Donar name:");
		uj2=new JLabel("Donar id :");
		uj3=new JLabel("Age:");
		uj4=new JLabel("Emailid:");
		uj5=new JLabel("Address:");
		
		
		ij1.setBounds(150,25,75,25);
		pin.add(ij1);
		ij2.setBounds(150,75,75,25);
		pin.add(ij2);
		ij3.setBounds(150,125,75,25);
		pin.add(ij3);
		ij4.setBounds(150,175,75,25);
		pin.add(ij4);
		ij5.setBounds(150,225,75,25);
		pin.add(ij5);
		ij6.setBounds(150,275,75,25);
		pin.add(ij6);
		
		in1=new JTextField(10);
		in2=new JTextField(10);
		in3=new JTextField(10);
		in4=new JTextField(10);
		in5=new JTextField(10);
		in6=new JTextField(10);
		
		i0=new JTextField(10);
		i1=new JTextField(10);
		//i2=new JTextField(10);
		i3=new JTextField(10);
		i4=new JTextField(10);
		i5=new JTextField(10);
		i6=new JTextField(10);
		uj1.setBounds(150,25,75,25);
		pup.add(uj1);
		uj2.setBounds(150,75,75,25);
		pup.add(uj2);
		uj3.setBounds(150,125,75,25);
		pup.add(uj3);
		uj4.setBounds(150,175,75,25);
		pup.add(uj4);
		uj5.setBounds(150,225,75,25);
		pup.add(uj5);
		uj6.setBounds(150,275,75,25);
		pup.add(uj6);
		
		pup.add(i0);
		i0.setBounds(230,25,100,25);
		pup.add(i1);
		i1.setBounds(230,75,100,25);
		pup.add(i3);
		i3.setBounds(230,125,100,25);
		pup.add(i4);
		i4.setBounds(230,175,100,25);
		pup.add(i5);
		i5.setBounds(230,225,100,25);
		pup.add(i6);
		i6.setBounds(230,275,100,25);
		up=new JButton("UP");
		up.setBounds(210,320,60,30);
		pup.add(up);
		pup.setBackground(Color.blue);
		pin.setBackground(Color.blue);
		fin=new JFrame("Insert");
		
		in=new JButton("INS");
		//pin.add(i0);
		pin.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		pin.add(in);
		fin.add(pin);
		
		/*pup.add(in1);
		in1.setBounds(230,25,100,25);
		pin.add(in2);
		in2.setBounds(230,75,100,25);
		pin.add(in3);
		in3.setBounds(230,125,100,25);
		pin.add(in4);
		in4.setBounds(230,175,100,25);
		pin.add(in5);
		in5.setBounds(230,225,100,25);
		pin.add(in6);
		in6.setBounds(230,275,100,25);
		in.setBounds(210,320,60,30);
		*/
		fin.setSize(500,500);
		in.addActionListener(this);
		
		fup=new JFrame("Update");

		
		/*pup.add(i0);
		pup.add(i1);
		//pup.add(i2);
		pup.add(i3);
		pup.add(i4);
		pup.add(i5);
		pup.add(i6);
		*/
		fup.add(pup);
		fup.setSize(500,500);
		up.addActionListener(this);

	}
	
}
