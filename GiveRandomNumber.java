package Homework_2;

import java.security.SecureRandom;

public class GiveRandomNumber {

	private int sayi1;
	private int sayi2;
	
	static SecureRandom randomNumber=new SecureRandom();
	
	public GiveRandomNumber(int sayi1,int sayi2) 			//Constructor
	
	{	this.sayi2=sayi1;
		this.sayi2=sayi2;		
	}
	
	public void setSayi1(int sayi1) 						//sayi1 i set ettim.
	{
		this.sayi1=sayi1;
	}
	
	public int getSayi1() 									//sayi1 i random aldım.
	{
		return sayi1=randomNumber.nextInt(9);
	}
	
	public void setSayi2(int sayi2) 						//sayi2 set ettim.
	{
		this.sayi2=sayi2;
	}
	
	public int getSayi2() 									//sayi2 get ettim random aldım.
	{
		return sayi2=randomNumber.nextInt(9);	
	}
	
}