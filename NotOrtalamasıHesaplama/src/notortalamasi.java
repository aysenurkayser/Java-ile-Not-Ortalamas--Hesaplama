import java.util.Scanner;

public class notortalamasi {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		String sonuc;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz: ");
		matematik = scan.nextInt();
		
		System.out.println("Fizik notunuzu giriniz: ");
		fizik = scan.nextInt();
		
		System.out.println("Kimya notunuzu giriniz: ");
		kimya = scan.nextInt();
		
		System.out.println("T�rk�e notunuzu giriniz: ");
		turkce = scan.nextInt();
		
		System.out.println("Tarih notunuzu giriniz: ");
		tarih = scan.nextInt();
		
		System.out.println("M�zik notunuzu giriniz: ");
		muzik = scan.nextInt();
		
		int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);

		
		sonuc = (toplam / 6) >= 60 ? "S�n�f� ba�ar�yla ge�tiniz." : "S�n�fta kald�n�z.";

        System.out.println(sonuc);
		
				
	}

}
