package BT;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class sach {
String masach,tentacgia,namxuatban,tensach;
Double gia;
long soluong;	
Scanner i= new Scanner(System.in);
Vector list = new Vector();
  public String getMasach()	{
	  return masach;
    }
  public void setMasach(String masach) {
	  this.masach = masach;
    }
  public String getTentacgia() {
	  return tentacgia;
    }
  public void setTentacgia(String tentacgia) {
	  this.tentacgia = tentacgia;
    }
  public String getNamxuatban() {
	  return namxuatban;
    }
  public void setNamxuatban(String namxuatban) {
	  this.namxuatban = namxuatban;
    }
  public String getTensach() {
	  return tensach;
    }
  public void setTensach(String tensach) {
	  this.tensach = tensach;
    }
  public Double getGia() {
	  return gia;
    }
  public void setGia(Double gia) {
	  this.gia = gia;
    }
  public long getSoluong() {
	  return soluong; 
    }
  public void setSoluong(long soluong) {
	  this.soluong = soluong;
    }
  public sach() {
		while(true) {
			System.out.println("Quan ly Sach");
			System.out.println("1. Nhap Sach");
			System.out.println("2. Xem Sach");
			int n;
			Scanner k = new Scanner(System.in);
			System.out.print("Moi ban chon chuc nang:");
			n = k.nextInt();
			switch(n) {
				case 1: nhapTT();
					break;
				case 2: inTT();
					break;
			}
		}
	}
  public sach(String masach,String tentacgia,String namxuatban,String tensach, Double gia, Long soluong) {
	  super();
	  this.masach= masach;
	  this.namxuatban= namxuatban;
	  this.tensach= tensach;
	  this.tentacgia=tentacgia;
	  this.soluong= soluong;
	  this.gia= gia;
  }
  public void nhapTT() {
	  int n;
	  System.out.print("Nhap ma sach:");
      masach=i.nextLine();
      System.out.print("Nhap nam xuat ban:");
      SimpleDateFormat a= new SimpleDateFormat("dd-MM-yyyy");
      namxuatban=i.nextLine();
      System.out.print("Nhap ten tac gia:");
      tentacgia=i.nextLine();
      System.out.print("Nhap ten sach:");
      tensach=i.nextLine();
      System.out.print("Nhap gia:");
      gia=i.nextDouble();
      System.out.print("Nhap so luong:");
      soluong=i.nextInt();
}
  public void inTT() {
	  System.out.println("----------THONG TIN SACH----------");
	  System.out.println("Ma sach:"+masach);
	  System.out.println("Nam xuat ban:"+namxuatban);
	  System.out.println("Ten tac gia:"+tentacgia);
	  System.out.println("Ten sach:"+tensach);
	  System.out.println("Gia:"+gia);
	  System.out.println("So luong:"+soluong);
  }
  public String tostring() {
	  return "Ma sach:"+this.masach +"Nam xuat ban:"+this.namxuatban+"Ten tac gia:"+this.tentacgia+"Ten sach:"+this.tensach+"Gia:"+this.gia+"So luong:"+this.soluong;
  }
    public static void main(String[] args) {
      // TODO Auto-generated method stub
 new sach();
 }
}
