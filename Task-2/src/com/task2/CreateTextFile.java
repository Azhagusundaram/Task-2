package com.task2;

import java.io.*;
public class CreateTextFile {
	public static void create() {
		try {
			BufferedWriter file=new BufferedWriter(new FileWriter(new File("sample.txt")));
			file.write("Programmatically created file.\\nThese words were written programmatically.\\nAll is well.Be happy and enjoy the moment.");
			file.flush();
			file.close();
			BufferedReader read=new BufferedReader(new FileReader(new File("sample.txt")));
			String line;
			while((line=read.readLine())!=null) {
				System.out.println(line);
			}
			read.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
