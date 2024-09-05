package practice;
// import java.util.Scanner;
import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
public class File_Handling {

	public static void main(String[] args) {
		File myfile = new File("Mynewfile.txt");
//		try {
//			myfile.createNewFile();
//		} catch (IOException e) {
//			System.out.println("Unable to create file");
//			e.printStackTrace();
//		}
//		
//		try {
//			FileWriter filewrite = new FileWriter("Mynewfile.txt");
//			filewrite.write("This is very good practice");
//			filewrite.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
//		Scanner sc = new Scanner(myfile); 
//		while(sc.hasNextLine()) {
//			String line = sc.nextLine();
//			System.out.println(line);
//		}
//		sc.close();
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
      if(myfile.delete()) {
    	  System.out.println("File deleted "+ myfile.getName());
      }
      else {
    	  System.out.println("Some error occured");
      }
	}

}
