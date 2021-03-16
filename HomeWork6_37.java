package Homework_2;

import java.security.SecureRandom;									//SecureRandom import ettim.
import java.util.Scanner;

public class HomeWork6_37 {
	
	public static void main(String[] args)
	{
		while(true) {
			
			System.out.println("      PROGRAM START     \n");
		SecureRandom randomNumber=new SecureRandom();			//Rastgele sayı alabilmek için randomNumber adında nesne oluşturdum.
		Scanner input = new Scanner(System.in);					//Klavyeden giriş yapabilmek için input nesnesi oluşturdum.
		
		int sayi1=0;
		int sayi2=0;											//sayi1 ve sayi2 olarak 2 adet integer sayı tanımladım başlangıç değeri
																//olarak 0 değerini verdim.
		int dogru=0;											//switch case de kullanmak için int sayılar tanımladım.
		int yanlis=0;
		
		int dogruSoru=0;
		int yanlisSoru=0;
		GiveRandomNumber2 obj=new GiveRandomNumber2(sayi1,sayi2,dogru,yanlis);//Random sayıları oluşturmak için metod oluşturdum
																//ve bu metottan değer alabilmek için obj nesnesi oluşturdum.
																									
		for(int SoruSayisi=1 ; SoruSayisi<11;  SoruSayisi++) 
		{	
		
		sayi1=obj.getSayi1();									// Sayıları random üreten metodu çağırarak elde ettim.
		sayi2=obj.getSayi2();	
		
		System.out.printf("Please Answer the Question...\n\n");//ekrana bastırmalar.
		System.out.printf("%d X %d\n\n",sayi1,sayi2);
		
		int sonuc=sayi1*sayi2;									//Gerçek çarpım değerini sonuc olarak atadım.
		int kullaniciCevabi=input.nextInt();					//Kullanıcının cevabı klavye ile girmesini sağladım.
		
		if(kullaniciCevabi==sonuc)							//Cevap kontrolü
		{
			dogruSoru++;
			
			int t=obj.getdogru();		//switch case yöntemiyle cevap yollamak için random sayı aldım.
			
			switch(t) {
			case 1:
				System.out.println("Very Good!!!\n");
				break;
			case 2:
				System.out.println("Excellent!!!\n");
				break;
			case 3:
				System.out.println("Nice Work!!!\n");
				break;
			case 4:
				System.out.println("Keep up the good work!!!\n");
				break;
				}
			
		}
		else {
			yanlisSoru++;
		
				int f=obj.getyanlis();								//switch case yöntemiyle cevap yollamak için random sayı aldım.
				
				switch(f) {
				case 1:
					System.out.println("No. Please try again!!!\n");
					break;
				case 2:
					System.out.println("Wrong. Try once more!!!\n");
					break;
				case 3:
					System.out.println("Don't give up!!!\n");
					break;
				case 4:
					System.out.println("No. Keep trying!!!\n");
					break;
					}
			}
		
			kullaniciCevabi=0;
			sonuc=0;
		}
		System.out.printf("Doğru Sayısı: %d\n\n",dogruSoru);
		System.out.printf("Yanlış Sayısı: %d\n\n",yanlisSoru);
		
	//	float yuzde=dogruSoru/10;  
		
		if (dogruSoru>=7.5)
		{
			System.out.println("Congratulations, you are ready to go to the next level!!!\n\n");
			dogruSoru=0;
			yanlisSoru=0;
		}
		
		else 
		{
			System.out.println("Please ask your teacher for extra help!!!\n\n");
			dogruSoru=0;
			yanlisSoru=0;
		}
		
		
	}

	}
}
	


