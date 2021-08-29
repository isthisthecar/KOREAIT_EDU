package step01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br =null;
		try {
			fr = new FileReader("writer.txt");
			char[] buffer = new char[10];
			while(true) {
				int count = fr.read(buffer);
				if(count == -1) break;
//				System.out.println(count + " " + Arrays.toString(buffer));
				String str = new String(buffer);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
