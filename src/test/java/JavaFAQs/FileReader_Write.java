package JavaFAQs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//File Writer
		File src= new File("C:\\Users\\User\\Desktop\\FileTest.txt");
		FileWriter fw = new FileWriter(src);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hello test6 ");
		bw.close();
		System.out.println("Write is Completed");
		//File  Reader
		File path= new File("C:\\Users\\User\\Desktop\\FileTest.txt");
		FileReader fr= new FileReader(path);
		BufferedReader br= new BufferedReader(fr);
		System.out.println(br.readLine());
		
	}

}
