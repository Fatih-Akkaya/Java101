import java.util.Scanner;
public class Main
{
    public static void hipotenusHesapla(){
        double a, b, c;
        Scanner input = new Scanner(System.in);
		System.out.print("1. kenarı giriniz : ");
		a = input.nextDouble();
		System.out.print("2. kenarı giriniz : ");
		b = input.nextDouble();
		c = Math.sqrt(a*a+b*b);
		System.out.println("Hipotenüs : " + c);
    }
    public static void alanHesapla(){
        double a, b, c, u, alan;
        Scanner input = new Scanner(System.in);
		System.out.print("1. kenarı giriniz : ");
		a = input.nextDouble();
		System.out.print("2. kenarı giriniz : ");
		b = input.nextDouble();
		System.out.print("3. kenarı giriniz : ");
		c = input.nextDouble();
		u = (a+b+c)/2;
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Üçgenin alanı : " + alan);
    }
	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println("1. Dik üçgenin hipotenüsünü hesaplama");
		System.out.println("2. Üç kenarı girilen üçgenin alanını hesaplama");
		System.out.println("0. Çıkış");
		System.out.println("====================");
		int secim;
		Scanner input = new Scanner(System.in);
		System.out.print("Yapmak istediğini işlemi giriniz : ");
		secim = input.nextInt();
		while (secim != 0){
		    if (secim==1) hipotenusHesapla();
		    if (secim==2) alanHesapla();
		    System.out.print("Yapmak istediğini işlemi giriniz : ");
		    secim = input.nextInt();
		}
		
	}
}
