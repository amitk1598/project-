package project1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class fetchfile {


	public static String path1 = "";
	public static String path2 = "";
 

	public static String path = "";


	fetchfile() throws Exception {

		File file = new File("C://Users//fameer foodie//Desktop//abcd.txt");
		FileReader fr = new FileReader(file);
		
		try {
			int first;
			while ((first = fr.read()) != 10) {
				path1 = path1 + (char) first;
			}
			System.out.println(path1);
			
			while ((first = fr.read())!= -1){
				path2 = path2 + (char) first;
				
			}
			System.out.println(path2);
			
		} catch (Exception e) {
			System.out.println("file not found ");
		} finally {
			if (fr != null) {
				fr.close();
			}}}
	public static void listf(String directoryName) throws IOException{
		File directory = new File(directoryName);
		File [] fList = directory.listFiles();
		
		ArrayList<File> file1 = new ArrayList<File>();
		
		for(File file : fList){
			if(file.isFile()){
				//ArrayList<File> file1 = new ArrayList<File>();
				file1.add(file);
			//System.out.println("File name: " +file.getName()+"File path: " +file.getAbsolutePath());
			Iterator<File> itr = file1.iterator();
			while(itr.hasNext()){
				File f = (File)itr.next();
				f.getName();
				f.getAbsolutePath();
				File fout = new File(path2);
				FileWriter out = new FileWriter(file);
				out.write(f.getName());
				out.write(f.getAbsolutePath());
			}
		}
			else if(file.isDirectory()){
			listf(file.getAbsolutePath());
		}}}
	
	public static void main(String[] args) throws Exception {
		fetchfile ob = new fetchfile();
         ob.listf(path1.substring(0,path1.length()-1));
       //  ob.listf(path2.substring(0,path2.length()-1));
        // ob.path();
	}
}
