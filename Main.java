package csvprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//csv comma separated values
		String Filename = "Demographic_Statistics_By_Zip_Code.csv";
		File file = new File(Filename); //TODO: read about file
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.hasNext();//ignore the first line
			while (inputStream.hasNext()) {
				String data = inputStream.next(); // gets a whole line
				String[] values = data.split(",");
				System.out.println(data + "**"); // select values to works
			}
			inputStream.close();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
		

