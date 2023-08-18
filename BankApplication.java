package oops;
import java.util.Scanner;
import java.util.Random;
public class MainBank 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the role : ");
		while(true)
		{
		System.out.println("1.Manager\n2.Accountant\n3.User\n4.Clerk");
		int s=sc.nextInt();
		switch(s)
		{
		case 1:
				Manager m1=new Manager();
				m1.deposit();
				m1.withdrawl();
				m1.changes();
				break;
		case 2:
				Accountant m2=new Accountant();
				m2.deposit();
				m2.withdrawl();
				break;
		case 3:
				User m3=new User();
				while(true)
				{
				System.out.println("If Deposit press 1 :\nIf Withdrawl press 2 :\nNothing press 3 :");
				int s2=sc.nextInt();
				if(s2==1 ||s2==2)
				{
				switch(s2)
				{
				case 1:	m3.deposit();break;
				case 2: m3.withdrawl();break;
				}
				}
				else if(s2==3)
				{
					break;
				}
				else
					System.out.println("Choose the correct Option :");
				}
				break;		
		case 4:
				Clerk m4=new Clerk();
				m4.changes();
				break;							
		}	
	}
}
}
abstract class Bank
{
	public abstract void deposit();
	public abstract void withdrawl();
	public abstract void changes();
}
class Manager extends Bank 
{
	String s1="";
	String s2="";
	String s3="";
	public void deposit()
	{	
	if(User.d_amount[0]==0) 
		{
			System.out.println("Waiting For Deposits.......");
		}
		else
		{
		System.out.println("Deposit List : ");
		System.out.println("-------------\n");
		if(User.d_amount[User.i]!=0)
		{
		for(int x=0;x<User.i+1;x++)
		{s1="";
		s1=s1+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.d_amount[x];
		System.out.println(s1);
		}
		}
		else
		{
		for(int x=0;x<User.i;x++)
		{s1="";
		s1=s1+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.d_amount[x];
		System.out.println(s1);
		}
		}
		System.out.println("========================================================================");
		}
		
	}
	public void withdrawl()
	{
		if(User.w_amount[0]==0) 
		{
			System.out.println("Waiting For Withdrawls.......");
		}
		else
		{
		System.out.println("Withdrawl List : ");
		System.out.println("-------------\n");
		if(User.w_amount[User.j]!=0)
		{
		for(int x=0;x<User.j+1;x++)
		{
			s2="";
		s2=s2+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.w_amount[x];
		System.out.println(s2);
		}
		}
		else
		{
		for(int x=0;x<User.j;x++)
		{s2="";
		s2=s2+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.w_amount[x];
		System.out.println(s2);
		}
		}
		System.out.println("========================================================================");
		}
	}
	public void changes()
{
	if( Clerk.a_account[0]==0 ) 
		{
			System.out.println("Waiting for Changed Applications.......");
		}
		else 
			{
			System.out.println("Changed Account Details List : ");
			System.out.println("------------------------------\n");

			if(Clerk.c_number[Clerk.m]!=0)
			
				{
			
					for(int x=0;x<Clerk.m+1;x++)
					{s3="";
						s3=s3+User.name[x]+" "+User.account[x]+" "+User.mobile[x]+" "+Clerk.c_mail[x];
						System.out.println(s3);	
					}
				}
				else
				{
					for(int x=0;x<Clerk.m;x++)
					{s3="";
						s3=s3+User.name[x]+" "+User.account[x]+" "+User.mobile[x]+" "+" "+Clerk.c_mail[x];
						System.out.println(s3);	
					}
				}
					System.out.println("========================================================================");
	}
}
}
class Accountant
{
	String s1="";
	String s2="";
	public void deposit()
	{
		if(User.d_amount[0]==0)
		{
			System.out.println("Waiting For Deposits.......");
		}
		else
		{
		System.out.println("Deposit List : ");
		System.out.println("-------------\n");
		if(User.d_amount[User.i]!=0)
		{
		for(int x=0;x<User.i+1;x++)
		{s1="";
		s1=s1+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.d_amount[x];
		System.out.println(s1);
		}}
		else
		{
		for(int x=0;x<User.i;x++)
		{s1="";
		s1=s1+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.d_amount[x];
		System.out.println(s1);
		}
		}
		System.out.println("========================================================================");

	}
	}
	
	public void withdrawl()
	{
		if(User.w_amount[0]==0) 
		{
			System.out.println("Waiting For Withdrawls.......");
		}
		else
		{
		System.out.println("Withdrawl List : ");
		System.out.println("-------------\n");
		if(User.w_amount[User.j]!=0)
		{
		for(int x=0;x<User.j+1;x++)
		{s2="";
		s2=s2+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.w_amount[x];
		System.out.println(s2);
		}}
		else
		{
			for(int x=0;x<User.j;x++)
			{s2="";
			s2=s2+User.name[x]+"   "+User.account[x]+"   "+User.mobile[x]+"   "+User.available_balance[x]+"   "+User.w_amount[x];
			System.out.println(s2);
			}
		}
		System.out.println("========================================================================");

		}
	}
}
class User
{
	static float d_amount[]=new float[10];
	static float w_amount[]=new float[10];
	static String name[]=new String[10];
	static long account[]=new long[10];
	static long mobile[]=new long[10];
	static int i=0,j=0;
	static float available_balance[]=new float[10];
	Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	public void d_Money()
	{
		System.out.println(" Account Number : ");
		account[i]=sc.nextLong();
		System.out.println(" Mobile Number : ");
		mobile[i]=sc.nextLong();
		System.out.println(" Account Holder's Name : ");
		sc.nextLine();
		name[i]=sc.nextLine();	
	}
	public void w_Money()
	{
		System.out.println(" Account Number : ");
		account[j]=sc.nextLong();
		System.out.println(" Mobile Number : ");
		mobile[j]=sc.nextLong();
		System.out.println(" Account Holder's Name : ");
		sc.nextLine();
		name[j]=sc.nextLine();	
	}
	
	public void d_update()
	{
		available_balance[i]=ran.nextFloat(100000);
		while(true)
		{
		for(int x=0;x<i;x++)
		{
			for(int y=x+1;y<i+1;y++)
			{
			if(account[x]==account[y] )
			{
				available_balance[y]=available_balance[x];
			}
	
			}
		}
		break;
		}
	}
	public void w_update()
	{
		while(true)
		{
		for(int x=0;x<i;x++)
		{
			for(int y=x+1;y<i+1;y++)
			{
			if(account[x]==account[y])
			{
				available_balance[y]=available_balance[x];
			}
			}
		}
		break;	
		}
	}

	public float deposit()
	{
		d_Money();
		d_update();
		System.out.println(" Deposit Amount : ");
		d_amount[i]=sc.nextFloat();
		System.out.println("Available Balance : "+available_balance[i]);
		System.out.println("After Depost : ");
		available_balance[i]=available_balance[i]+d_amount[i];
		System.out.println("Available Balance : "+(available_balance[i]));
		Increment incre=new Increment();
		incre.inci();
		return available_balance[i];
	}
	public float withdrawl()
	{
		if(account[0]==0)
		{
			System.out.println("No Account Holders"); 
		}
		else
		{	
		w_Money();
		w_update();
		System.out.println(" Your Account Balance: "+available_balance[j]);
		System.out.println(" How Much Amount Do You Want To Withdraw? : ");
		w_amount[j]=sc.nextFloat();
		while(true)
		{
		if(w_amount[j]<=available_balance[j])
		{
			System.out.println("After Withdrawl :");
			available_balance[j]=available_balance[j]-w_amount[j];
			System.out.println("Available Balance : "+(available_balance[j]));
			break;
		}
		else
		{
			System.out.println("Choose Withdraw Amount below "+(available_balance[j]));
		}
		}
		Increment incre=new Increment();
		incre.incj();
		}
		return available_balance[j];
	}
}
	
class Increment
{
	public void inci()
	{
		User.i++;
	}
	public void incj()
	{
		User.j++;
	}
}
class Clerk
{
	static int m=0;
	static String a_name[]=new String[10];
	static String c_name[]=new String[10];
	static long a_number[]=new long[10];
	static long c_number[]=new long[10]; 
	static String a_mail[]=new String[10];
	static String c_mail[]=new String[10];
	static long a_account[]=new long[10];
	Scanner sc=new Scanner(System.in);
	public void options()
	{
	System.out.println("Which one do you want to change :");
	System.out.println("1.Name\n2.Mobile Number\n3.MailID");
	}
	public void details()
	{
		if(User.i==0)
		{
			System.out.println("No Existing Account Holders :");

		}
		else
		{
		System.out.println("Account Number : ");
		a_account[m]=sc.nextLong();
		System.out.println(" Account Name :" );
		sc.nextLine();
		a_name[m]=sc.nextLine();
		System.out.println(" Account Mobile Number :" );
		a_number[m]=sc.nextLong();
		System.out.println(" Account Mail_ID :");
		a_mail[m]=sc.next();
		}

	}
	public void changes()
	{
		while(true)
		{
		details();
		
		options();
		int a=sc.nextInt();
			for(int x=0;x<User.i;x++)
			{
				for(int y=0;y<m+1;y++)
				{
		if((User.account[x])==(Clerk.a_account[y]) && User.mobile[x]==Clerk.a_number[y])
		{	
		switch(a)
		{
		case 1:
				System.out.println("Write Changed Account Name : ");
				sc.nextLine();
				c_name[m]=sc.nextLine();
				User.name[x]=c_name[m];	
				break;
		case 2:
				System.out.println("Write Changed Account Mobile Number : ");
				c_number[m]=sc.nextLong();
				User.mobile[x]=c_number[m];
				break;
		case 3:
				System.out.println("Write Changed Maild id :");
				sc.nextLine();
				c_mail[m]=sc.nextLine();	
				break;
	}
		break;
		}
		else
		{
			System.out.println("Not an Existing Account Holder\nGive Existing Account Holder Details : ");
			
		}
		
	}
		m++;
}
		}}}














