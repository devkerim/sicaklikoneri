import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double sicaklik;
	Scanner doublescanner = new Scanner(System.in);
	System.out.println("Sıcaklık değerini giriniz: ");
	sicaklik =doublescanner.nextDouble();

	if(sicaklik<5){System.out.println("Kayak Yapabilirsiniz.");}
	else if(sicaklik>=5&&sicaklik<=15){System.out.println("Snemaya gidebilirsiniz.");}
	else if(15>=sicaklik&&sicaklik<=25){System.out.println("Piknik Yapabilirsiniz.");}
	else if(sicaklik>25){System.out.println("yüzebilirsiniz.");}
	else{System.out.println("Hatalı bir değer girdiniz.");}
    }
}
