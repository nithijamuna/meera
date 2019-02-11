package Wip;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;



public class Duplicate_values  {


	public static void main(String args[])
	{
	
String[] Dupliacte={"Arul","Nithya","Punitha","Arul","Nithya"};

for(int i=0;i<Dupliacte.length;i++)
{
	
	for(int j=i+1;j<Dupliacte.length;j++)
	{
		
		if(Dupliacte[i].equals(Dupliacte[j]))
		{
			System.out.println("Dupliacte:----- "+ Dupliacte[i] );
		}
	}
}
	
	Set<String> Store=new HashSet<String>();
	
	for(String Dup:Dupliacte)
	{
		if(Store.add(Dup)==false)
		{
			System.out.println("Dupliacte:----- "+ Dup);	
		}
	}
	
	int [] Num={5,6,2,4,8,5};
	Set<Integer> stor=new HashSet<Integer>();
	for(int Nu:Num)
	{
		if(stor.add(Nu)==false)
		{
			System.out.println("Dupliacte:----- "+ Nu);	
		}
	}
	
}
	
	}


	
	
