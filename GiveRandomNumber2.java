package Homework_2;

import java.security.SecureRandom;

public class GiveRandomNumber2 {

		private int sayi1;
		private int sayi2;
		private int dogru;
		private int yanlis;
		
		static SecureRandom randomNumber=new SecureRandom();
		
		public GiveRandomNumber2(int sayi1,int sayi2,int dogru,int yanlis) 			//Constructor
		
		{	this.sayi2=sayi1;
			this.sayi2=sayi2;		
		}
		
		public void setSayi1(int sayi1) 						//sayi1 i set ettim.
		{
			this.sayi1=sayi1;
		}
		
		public int getSayi1() 									//sayi1 i random aldım.
		{
			return sayi1=1+randomNumber.nextInt(9);
		}
		
		public void setSayi2(int sayi2) 						//sayi2 set ettim.
		{
			this.sayi2=sayi2;
		}
		
		public int getSayi2() 									//sayi2 get ettim random aldım.
		{
			return sayi2=1+randomNumber.nextInt(9);	
		}
		
		public void setdogru(int dogru) 						//dogru set ettim.
		{
			this.dogru=dogru;
		}
		
		public int getdogru() 									//dogru get ettim random aldım.
		{
			return dogru=randomNumber.nextInt(4);	
		}
		
		public void setyanlis(int yanlis) 						//yanlis set ettim.
		{
			this.yanlis=yanlis;
		}
		
		public int getyanlis() 									//yanlis get ettim random aldım.
		{
			return yanlis=randomNumber.nextInt(4);	
		}
		
	}


