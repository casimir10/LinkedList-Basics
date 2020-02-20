//Christian Casimir
package cisc3150hw1;
import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) throws FileNotFoundException {
		//Read in From File
		//Tokenize on the delimiter(,)
		//Sort the Array alphabetically
		//Put all the prints in the outputfile
		
		LinkedList<String> artistList = new LinkedList<String>();
		LinkedList<String> Temp = new LinkedList<String>();
		File input = new File("artistsfile.txt");
		Scanner readfrom = new Scanner(input);
		PrintWriter outputfile = new PrintWriter("C:/Users/Christian Casimir/eclipse-workspace/cisc3150hw1/output.txt");
		
		//Fill the List with artist names from File
		String line;
		while(readfrom.hasNext()) {
			line = readfrom.nextLine();
			String[] tokens = line.split(",");
			artistList.add(tokens[2]);
			
		}
		//Sort the List Alphabetically
		Collections.sort(artistList);
		
		//Loop Through the Original List to Remove Duplicate Artist Names
		//Place Strings without Duplicates into new Temporary Array
		for(String x : artistList) {
				if(!Temp.contains(x)) {
					Temp.add(x);
				}
		}
		
		//Print the Output to File
		for(int i = 0; i < Temp.size();i++) {
			outputfile.println(Temp.get(i));
		}
		
		System.out.println("Code Complete");
		//Close Scanners and Files
		readfrom.close();
		outputfile.close();
	}//End Main

}//End Class
