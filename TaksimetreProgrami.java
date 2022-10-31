import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		double km, kmPrice = 2.20, minimumPrice = 20.0, startPrice=10.0, totalPrice;
		Scanner input = new Scanner(System.in);
		System.out.print("Mesafesi KM cinsinden giriniz : ");
		km = input.nextDouble();
		totalPrice = startPrice + (km*kmPrice);
		totalPrice = totalPrice < minimumPrice ? minimumPrice : totalPrice;
		System.out.println("Ödenecek tutar : " + df.format(totalPrice));
		
	}
}
