package q1excp;
import java.awt.DisplayMode;
import java.util.*;
class account{
	private int accno,pinno;
	private double amt;
	Scanner sc=new Scanner(System.in);
	void setaccno()
	{
		accno=sc.nextInt();
	}
	void setpinno()
	{
		pinno=sc.nextInt();
	}
	/*void setamt()
	{
		amt=sc.nextDouble();
	}*/
	public Boolean validate(String amt)
	{
		try
		{
			this.amt=Double.parseDouble(amt);
		}
		catch(NumberFormatException n)
		{
			return false;
		}
		return true;
	}
	int getaccno()
	{
		return accno;
	}
	int getpinno()
	{
		return pinno;
	}
	
	void display()
	{
		System.out.println(getaccno());
		System.out.println(getpinno());
		System.out.println(amt);
		System.out.println("amount deposited");
	}
	
}
public class main {
static public void main(String a[])
{
	String amt,c;
	Boolean f;
	Scanner sc=new Scanner(System.in);
	account ac=new account();
	c=sc.next();
	while(c!="no")
	{
		System.out.println( "Begin transaction");

		System.out.println( "Enter Account Number");
		ac.setaccno();

	
	System.out.println( "Enter Pin Number");
	ac.setpinno();
	System.out.println( "Enter Amount");
	amt=sc.next();
	
	if(ac.validate(amt)==false)
	{
		System.out.println("enter valid amount");
		amt=sc.next();
		f=ac.validate(amt);
		if(f==true)
		{
			ac.display();
			
		}
	}
	else
	{
		ac.display();
		
	}
	System.out.println( "Do another Transaction");
	c=sc.next();
	}	
}
}









package q2excp;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
class account{
	String accname,acctype;
	String dob;
	Date d;
	account(String accname,String acctype,String dob)
	{
		this.accname=accname;
		this.acctype=acctype;
		this.dob=dob;
				
	}
	Boolean validatedate(String dob)
	{
		try {
			d=new SimpleDateFormat("dd-MM-yyy").parse(dob);
		}
		catch(Exception c)
		{
			return false;
		}
		return true;
	}
	void display()
	{
		System.out.println("name:"+accname);
		System.out.println("account type:"+acctype);
		System.out.println("date of birth:"+dob);
		
	}
}
public class main {
static public void main(String a[])
{
	String accname,acctype;
	String dob;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name:");
	accname=sc.next();
	System.out.println("enter account type:");
	acctype=sc.next();
	System.out.println("enter dob:");
	dob=sc.next();
	account ac=new account(accname,acctype,dob);
	Boolean f;
	f=ac.validatedate(dob);
	while(f==false)
	{
		System.out.println("Enter valid date format");
		dob=sc.next();
		f=ac.validatedate(dob);
	
	}
	ac.display();
	
		
	}
}










