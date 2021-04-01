package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Count {
public static void main(String[] args) throws IOException {
	
	File f1=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\JAVA\\Text.txt");
	//read lines
		List<String> rd=FileUtils.readLines(f1);
		Boolean cnts=rd.contains("java");
		System.out.println("Does it contains java word ? "+cnts);
		
		//count
		int count=rd.size();
		System.out.println("No of lines..."+count);

		System.out.println("Successfull");
		System.out.println("1234");

		

}
}
