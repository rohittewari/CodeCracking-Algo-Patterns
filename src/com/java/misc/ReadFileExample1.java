package com.java.misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {
	

	private static final String FILENAME = "C:\\Rohit\\Books_Dell\\Interview\\2_Revised\\14_Maven.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine = br.readLine();
			
			while (sCurrentLine!=null){
				System.out.println(sCurrentLine);
				sCurrentLine = br.readLine();
			}
			

			/*while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}*/

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}


}