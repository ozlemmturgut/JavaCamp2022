package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacakSayi = 7;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayi mevcuttur: " + aranacakSayi);
		}
		else {
			mesajVer("Sayi mevcut degildir: " + aranacakSayi);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
