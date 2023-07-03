package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PhoneList01 {
	public static void main(String[] args) {
		File file = new File("phone.txt");
		
		if(!file.exists()) {
			System.out.println("File Not Found");
			return;
		}
		
		System.out.println("==== 파일정보 ====");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "bytes");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
		
		System.out.println("==== 전화번호 ====");

		
	}
}
