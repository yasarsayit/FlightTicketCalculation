package java101;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Uçak Bileti Hesaplayan Program");

		Scanner input = new Scanner(System.in);

		double mesafe, indtutar, normtutar, yasind, gdind, tutar;
		int yas, yoltip;

		System.out.print("Mesafe Giriniz:");
		mesafe = input.nextDouble();

		System.out.print("Yaşınızı Giriniz:");
		yas = input.nextInt();

		System.out.println("Yolculuk Tipini Seçiniz:");
		System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
		yoltip = input.nextInt();

		if (yas < 12) {
			if (yoltip == 1) {
				normtutar = mesafe * 0.10;
				yasind = normtutar * 0.50;
				System.out.println("Toplam Tutar:" + yasind);

			} else if (yoltip == 2) {
				normtutar = mesafe * 0.10;
				yasind = normtutar * 0.50;
				indtutar = normtutar - yasind;
				gdind = indtutar * 0.20;
				tutar = (indtutar - gdind) * 2;
				System.out.println("Toplam Tutar:" + tutar);

			} else {
				System.out.println("Hatalı Veri Girdiniz !");
			}
		}

		if (yas > 24 && yas < 65) {
			if (yoltip == 1) {
				normtutar = mesafe * 0.10;
				System.out.println("Toplam tutar:" + normtutar);

			} else if (yoltip == 2) {
				normtutar = mesafe * 0.10;
				gdind = normtutar * 0.20;
				tutar = (normtutar - gdind) * 2;
				System.out.println("Toplam tutar:" + tutar);

			} else {
				System.out.println("Hatalı Veri Girdiniz !");
			}

		}

		if (yas >= 12 && yas <= 24) {

			if (yoltip == 1) {
				normtutar = mesafe * 0.10;
				yasind = normtutar * 0.10;
				indtutar = normtutar - yasind;
				System.out.println("Toplam Tutar:" + indtutar);
			} else if (yoltip == 2) {
				normtutar = mesafe * 0.10;
				yasind = normtutar * 0.10;
				indtutar = normtutar - yasind;
				gdind = indtutar * 0.20;
				tutar = (indtutar - gdind) * 2;
				System.out.println("Toplam tutar:" + tutar);

			} else {
				System.out.println("Hatalı Veri Girdiniz !");

			}
		}

		if (yas > 65) {
			if (yoltip == 1) {
				normtutar = mesafe * 0.10;
				yasind = normtutar * 0.30;
				indtutar = normtutar - yasind;

				System.out.println("Toplam tutar:" + indtutar);
			} else if (yoltip == 2) {
				normtutar = mesafe * 0.10;
				yasind = normtutar * 0.30;
				indtutar = normtutar - yasind;
				gdind = indtutar * 0.20;
				tutar = (indtutar - gdind) * 2;
				System.out.println("Toplam tutar:" + tutar);

			} else {
				System.out.println("Hatalı Veri Girdiniz !");
			}
		}

	}

}
