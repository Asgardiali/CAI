package Homework_2;

import java.security.SecureRandom; 							//SecureRandom import ettim.
import java.util.Scanner;

public class HomeWork6_35 {

	public static void main(String[] args)
	{
		SecureRandom randomNumber=new SecureRandom();		//Rastgele sayı alabilmek için randomNumber adında nesne oluşturdum.
		Scanner input = new Scanner(System.in);				//Klavyeden giriş yapabilmek için input nesnesi oluşturdum.
		
		int sayi1=0;										//sayi1 ve sayi2 olarak 2 adet integer sayı tanımladım başlangıç değeri 
		int sayi2=0;										//olarak 0 değerini verdim.
		
		GiveRandomNumber obj=new GiveRandomNumber(sayi1,sayi2);//Random sayıları oluşturmak için metod oluşturdum
																//ve bu metottan değer alabilmek için obj nesnesi oluşturdum.		
		while(true) {										//Programı sürekli olarak çalıştırmak için while(true) döngüsüne soktum.
		
		sayi1=obj.getSayi1();								// Sayıları random üreten metodu çağırarak elde ettim.
		sayi2=obj.getSayi2();
		
		
		System.out.printf("Please Answer the Question...\n\n");		//ekrana bastırmalar.
		System.out.printf("%d X %d\n\n",sayi1,sayi2);
		
		int sonuc=sayi1*sayi2;								//Gerçek çarpım değerini sonuc olarak atadım.
		int kullaniciCevabi=input.nextInt();				//Kullanıcının cevabı klavye ile girmesini sağladım.
		
		
		if(kullaniciCevabi==sonuc)							//Cevap kontrolü
		{
			System.out.println("Very Good!!!");
		}
		else
			while(kullaniciCevabi!=sonuc) {					//Kullaıcı sürekli yanlış girerse sistem uyarı vererek tekrardan giriş yapmasını sağlıyor.
				System.out.println("No. Please try again!!!");
				kullaniciCevabi=input.nextInt();
				if(kullaniciCevabi==sonuc)
				{
					System.out.println("Very Good!!!\n\n");
									}
			}
		
		}
	}

}