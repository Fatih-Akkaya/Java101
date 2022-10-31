import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double tutar, kdvOrani;
		Scanner input = new Scanner(System.in);
		System.out.print("Ücret tutarını giriniz : ");
		tutar = input.nextDouble();
		
		kdvOrani = tutar > 1000.0 ? 0.08 : 0.18;
		double kdvTutar = tutar * kdvOrani;
		double kdvliTutar = tutar + kdvTutar;
		System.out.println("KDV'siz tutar : " + tutar);
		System.out.println("KDV oranı : %" + kdvOrani * 100);
		System.out.println("KDV tutarı : " + kdvTutar);
		System.out.println("KDV'li toplam tutar : " + kdvliTutar);
	}
}
