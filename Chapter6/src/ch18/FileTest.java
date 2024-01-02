package ch18;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/hongdaeyong/Library/CloudStorage/OneDrive-숭실대학교-SoongsilUniversity/학교/백엔드/패스트캠퍼스_실습자료/Chapter6/fine.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	}

}
