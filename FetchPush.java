package assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class FetchPush
{
	public static void main(String args[]) throws IOException
	{

		Properties prop=new Properties();
		InputStream input = new FileInputStream("case1.properties");
		prop.load(input);
		BufferedReader read1= new BufferedReader(new FileReader(prop.getProperty("file2")));	

		Scanner in1= new Scanner(System.in);

		System.out.println("enter your choice:\n1.Retrive\n2.Insert\n");
		String ch=in1.next();

		switch(ch)
		{
		case "1": fetch f=new fetch(read1);break;
		case "2": push p=new push();break;
		}
		in1.close();

	}
}
class fetch
{
	fetch(BufferedReader read1) throws IOException
	{
		Scanner input1= new Scanner(System.in);
		System.out.println("give id:");
		String id=input1.next();
		String line=null;
		while ((line = read1.readLine()) != null)
		{ 
			String strar[]=line.split(",");
			if(id.equalsIgnoreCase(strar[0]))
			{
				System.out.println("\n"+line);
			}
		}input1.close();
	}


}

class push
{
/*	public static void main (String args[]) throws IOException
	{
		push a= new push();
	}*/
	push() throws IOException 
	{
		Properties prop=new Properties();
		InputStream input = new FileInputStream("case1.properties");
		prop.load(input);
		BufferedWriter paw= new BufferedWriter(new FileWriter(prop.getProperty("file2"),true));


		Scanner input11= new Scanner(System.in);

		System.out.println("Enter id");
		String id1= input11.next();
		System.out.println("Enter first_name");
		String fn= input11.next();
		System.out.println("Enter last_name");
		String ln= input11.next();
		System.out.println("Enter Age");
		String age= input11.next();
		System.out.println("Enter email");
		String email= input11.next();
		System.out.println("Enter country");
		String con= input11.next();
		System.out.println("Enter ip_address");
		String ia= input11.next();
		System.out.println("Enter Order");
		String or= input11.next();
		System.out.println("Enter Color");
		String col= input11.next();
		System.out.println("thankyou done adding record ");

		paw.write("\n");
		paw.write(id1);
		paw.write(",");
		paw.write(fn);
		paw.write(",");
		paw.write(ln);
		paw.write(",");
		paw.write(age);
		paw.write(",");
		paw.write(email);
		paw.write(",");
		paw.write(ia);
		paw.write(",");
		paw.write(con);
		paw.write(",");
		paw.write(or);
		paw.write(",");
		paw.write(col);
		paw.close();

		input11.close();
		System.out.println("running");
	}

}
