package JavaFAQs;

import java.io.File;
import java.util.Arrays;

public class PrintFiles_FolderNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\User\\Downloads";
		File file = new File(path);
		File donwload[] = file.listFiles();
		Arrays.sort(donwload);
		
		for(File e: donwload) {
			if(e.isFile()) {System.out.println("File "+e.getName()+" "+"path "+e.getAbsolutePath());}
			else if (e.isDirectory()) {System.out.println("File "+e.getName()+" "+"path "+e.getAbsolutePath());}
			else {System.out.println("Unkown");}
		}
	}

}
