package evaluvation_1;

import java.io.File;

public class File_directory {

	public static void main(String[] args) {
		File file=new File("D:");
		System.out.println("list of files and directory:   ");
         File[] s=file.listFiles();
         for(File f:s)
         System.out.println(f);

}

}
