package herovired;
import java.io.*;
import java.util.*;
public class fileHandling {

	public static void main(String[] args) {
		try {
			File obj = new File("sample.txt");
			obj.createNewFile();
			Scanner sc = new Scanner(obj);
			while(sc.hasNext()) {
				sc.nextLine();
			}
			sc.close();
		}catch(Exception e) {}
	}

}
