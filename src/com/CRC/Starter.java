package com.CRC;

import java.util.Scanner;

public class Starter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CRC crc = new CRC();
		String dataword;
		String crcBits;
		String rec;
		String zero = "0000000000000000";
//		String zero = "";
		
		System.out.println("enter the dataword to be sent");
		dataword = sc.nextLine();
		int n = dataword.length();
		
		crcBits = crc.divide(dataword + zero, n);
		
		System.out.println("Dataword =" + dataword);
		String checksum = dataword.substring(0,n) + crcBits.substring(n);
		System.out.print("CRC = ");
		System.out.println(crcBits.substring(n));
		System.out.println("Transmitted frame = " + checksum);
		System.out.println("Enter Received data :");
		rec = sc.nextLine();
		if (zero.equals(crc.divide(rec,n).substring(n))) {
			System.out.println("Correct Databits received");
		}
		else {
			System.out.println("Received frame contains one or more errors");
		sc.close();
		}
		
		
	}
}
