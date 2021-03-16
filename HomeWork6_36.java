package Homework_2;

import java.security.SecureRandom;									//SecureRandom import ettim.
import java.util.Scanner;

public class HomeWork6_36 {
	
	public static void main(String[] args)
	{
		SecureRandom randomNumber=new SecureRandom();			//Rastgele sayı alabilmek için randomNumber adında nesne oluşturdum.
		Scanner input = new Scanner(System.in);					//Klavyeden giriş yapabilmek için input nesnesi oluşturdum.
		int sayi1=0;
		int sayi2=0;											//sayi1 ve sayi2 olarak 2 adet integer sayı tanımladım başlangıç değeri
																//olarak 0 değerini verdim.
		int dogru=0;											//switch case de kullanmak için int sayılar tanımladım.
		int yanlis=0;
		GiveRandomNumber2 obj=new GiveRandomNumber2(sayi1,sayi2,dogru,yanlis);//Random sayıları oluşturmak için metod oluşturdum
																//ve bu metottan değer alabilmek için obj nesnesi oluşturdum.
		while(true) {											//Programı sürekli olarak çalıştırmak için while(true) döngüsüne soktum.
		
		sayi1=obj.getSayi1();									// Sayıları random üreten metodu çağırarak elde ettim.
		sayi2=obj.getSayi2();
		
		
		
		
		System.out.printf("Please Answer the Question...\n\n");//ekrana bastırmalar.
		System.out.printf("%d X %d\n\n",sayi1,sayi2);
		
		int sonuc=sayi1*sayi2;									//Gerçek çarpım değerini sonuc olarak atadım.
		int kullaniciCevabi=input.nextInt();					//Kullanıcının cevabı klavye ile girmesini sağladım.
		
		if(kullaniciCevabi==sonuc)							//Cevap kontrolü
		{
			int t=obj.getdogru();		//switch case yöntemiyle cevap yollamak için random sayı aldım.
			
			switch(t) {
			case 1:
				System.out.println("Very Good!!!");
				break;
			case 2:
				System.out.println("Excellent!!!");
				break;
			case 3:
				System.out.println("Nice Work!!!");
				break;
			case 4:
				System.out.println("Keep up the good work!!!");
				break;
				}
		}
		else
			while(kullaniciCevabi!=sonuc) {
				
				int f=obj.getyanlis();								//switch case yöntemiyle cevap yollamak için random sayı aldım.
				
				switch(f) {
				case 1:
					System.out.println("No. Please try again!!!");
					break;
				case 2:
					System.out.println("Wrong. Try once more!!!");
					break;
				case 3:
					System.out.println("Don't give up!!!");
					break;
				case 4:
					System.out.println("No. Keep trying!!!");
					break;
					}
				kullaniciCevabi=input.nextInt();
				if(kullaniciCevabi==sonuc)
				{System.out.println("Very Good!!!\n\n");}			
			}
		
		}
	}


}
