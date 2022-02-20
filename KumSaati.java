import java.util.Scanner;
public class KumSaati {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Kum Saati Oluşturmak için Pozitif Bir Sayı Girinizi: ");
		int sayi = input.nextInt();
		int yildiz=sayi;
		for (int i=sayi; 0<i; i--)
		{
			for (int x=0; x<sayi-i;x++)
			{
				System.out.print(" ");
			}
			for (int j=0; j<yildiz; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			yildiz--;
		}
		for (int y=1; y<sayi; y++)
		{
			yildiz++;
			for (int a=sayi-y; 0<a; a--)
			{
				System.out.print(" ");
			}
			for (int b=yildiz+1; 0<b; b--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
