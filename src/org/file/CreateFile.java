package org.file;
import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
public class CreateFile {
@SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException {
	//create a new folder
	File f=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\JAVA");
	boolean dr=f.mkdir();
	System.out.println("Folder is created..."+dr);
	
	//create a new file
	
	File f1=new File("C:\\Users\\Lenovo\\Desktop\\greensjava\\JAVA\\TestText");
	boolean cfil=f1.createNewFile();
	System.out.println("New file is created..."+cfil);
	
	//Enter text in file
	
	/*FileUtils.write(f1, "\n Welcome \n",true);
	FileUtils.write(f1, "Hi \n",true);
	FileUtils.write(f1, "Hello \n",true);
	FileUtils.write(f1, "How \n",true);
	FileUtils.write(f1, "Are \n",true);
	FileUtils.write(f1, "You \n",true);
	FileUtils.write(f1, "Java \n", true);
	FileUtils.write(f1, "Is \n", true);
	FileUtils.write(f1, "Easy \n", true);
	FileUtils.write(f1, "To \n", true);
	FileUtils.write(f1, "Learn as simple as \n ", true);*/
	//FileUtils.write(f1, "Welcome \n", true);
	
	//read lines
	List<String> rd=FileUtils.readLines(f1);
	//Boolean cnts=rd.contains("Java");
	System.out.println("Does it contains java word ? "+rd.contains("Java"));
	
	//count
	int count=rd.size();
	System.out.println("No of lines..."+count);
	
	//print last five lines
	//for(int i=rd.size()-6;i<rd.size();i++) {
		//String s=rd.get(i);
		//System.out.println(s);
		
		
	/*	//Print odd lines
		for(int j=1;j<rd.size();j++) {
			if(j%2!=0) {
			
			System.out.println(rd.get(j));
			}
			
			}*/
	
		Set<String> sd=new HashSet(FileUtils.readLines(f1));
		//int size=sd.size();
		//System.out.println(size);
		//int size1=rd.size();
		//System.out.println("No of duplicate words are "+(size1-size));
		//for (String string : sd) {
			//System.out.println(string);
		//}
		//read lines
		
		List<String> redl=FileUtils.readLines(f1);
		System.out.println(redl);
		int size1=redl.size();
		
		Set<String> set1= new LinkedHashSet (FileUtils.readLines(f1));
		System.out.println(set1);
		int size2=set1.size();
		System.out.println("No of Duplicates are"+(size1-size2));
		
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

