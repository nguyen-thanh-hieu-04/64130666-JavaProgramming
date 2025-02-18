package ntu.nguyenthanhhieu;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		//in ra mot dong tieu de app
		System.out.print("CT Tinh Tong \n");
		//chuan bi cho viec nhap 
		Scanner banPhim = new Scanner (System.in);
		//In dong huong nhan Moi nhap A
		System.out.println("Moi nhap a:");
		double a= banPhim.nextDouble();
		System.out.println("Moi nhap b:");
		double b= banPhim.nextDouble();
		//Tinh toan
		double  tong = a+b;
		
		System.out.print("Tong la:");
		System.out.print(tong);
		

	}

}
