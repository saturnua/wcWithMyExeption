package myPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileManager {
	
	public static void copyFileText() throws Exception{
			
			BufferedReader readFile = new BufferedReader (new FileReader("C:\\java\\first.txt"));	
			String s = readFile.readLine();
			
			BufferedWriter writeFile = new BufferedWriter(new FileWriter("C:\\java\\second.txt"));
			writeFile.write(s);
			
			writeFile.close();
			readFile.close();
			
			PrintWriter pw = new PrintWriter(System.out, true);
		    pw.println(s);
		}
}
