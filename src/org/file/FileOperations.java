package org.file;

import java.io.*;
import java.util.List;

import org.apache.commons.io.FileUtils;
public class FileOperations {
	public static void main(String[] args) throws IOException {
		//create a new folder
		File f=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\day22Fileoperaitons\\Selenium");
		boolean dr=f.mkdir();
		System.out.println(dr);
		
		//Create subfolder
		File f1=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\day22Fileoperaitons\\Java\\contrlstmt\\if");
		boolean drs=f1.mkdirs();
		System.out.println(drs);
		
		//create a file
		File f2=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\day22Fileoperaitons\\Java\\write.txt");
		boolean fil=f2.createNewFile();
		System.out.println(fil);
		
		//Check file is thr or not
		
		File f3=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\day22Fileoperaitons\\Java\\write.txt");
		boolean isfil=f3.isFile();
		System.out.println(isfil);
		
		//check particular directory or not
		boolean isdir=f.isDirectory();
		System.out.println(isdir);

		//Can read or not
		boolean rd=f2.canRead();
		System.out.println("can read? "+rd);
		
		// can write or not
		boolean wrt=f2.canWrite();
		System.out.println("CAn write ? "+wrt);
		
		//can execute or not
		boolean exe=f2.canExecute();
		System.out.println("can execute ? "+exe);
		
		//exist or not
		boolean ext=f2.exists();
		System.out.println("Does it exist? " + ext);
		
		//hidden or not
		boolean hid=f2.isHidden();
		System.out.println("Hidden file ? "+hid);
		
		//List out the files
		File f4=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\day22Fileoperaitons");
		String[] lifil=f4.list();
		for (String string : lifil) {
			System.out.println(string);
			
		}
		//list out files with path
		File[] lipa=f4.listFiles();
		for(File x:lipa) {
			System.out.println(x);
		}
		//get path of life
		String ab=f4.getAbsolutePath();
		System.out.println(ab);
		
		//write
		File f5=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\day22Fileoperaitons\\Java\\write.txt");
			FileUtils.write(f5, "\n welcome \n",true);
			FileUtils.write(f5, "Hi \n",true);
			FileUtils.write(f5, "Hello \n ",true);
			//create a file
			File f6=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\day22Fileoperaitons\\Selenium\\array.txt");
			boolean crfil=f6.createNewFile();
			System.out.println(crfil);
			//enter text into array doc
			FileUtils.write(f6, "How \n ",true);
			FileUtils.write(f6, "are \n",true);
			FileUtils.write(f6, "you \n",true);
			//copy file
			
			FileUtils.copyFile(f6, f5);
			System.out.println("done");
			
			//read file
			List<String> red =FileUtils.readLines(f5);
			System.out.println(red);
			System.out.println("size is"+red.size());
			//print all lines
			for(int i=0;i<red.size();i++) {
				String s=red.get(i);
				System.out.println(s);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	}
			}

