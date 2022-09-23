package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -1;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Asal deðil");
			return;
		}
		
		if (number < 2) {
			System.out.println("Geçersiz sayi");
			return;
		}
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("Asal");
		}
		else {
			System.out.println("Asal deðil");
		}
		
	}

}
