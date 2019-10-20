import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
public static void main(String[] args) {
	File file = new  File("index.txt");
//	try(FileReader fileReader= new FileReader(file)) {
//		char [] data = new char[(int)file.length()];
//		fileReader.read(data);
//		for(char c : data) {
//			System.out.print(c);
//		}
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e1) {
//		e1.printStackTrace();
//	}
//	try(FileWriter writer = new FileWriter(file,true)){
//		writer.write("\nHi there !!");
//		writer.flush();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
	
//	System.out.println("hi there");
//	System.err.println("red eredredr");
//	Scanner scanner = new Scanner(System.in);
//	System.out.println(scanner.nextLine());
	
//	try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))){
//		int val;
//		while((val=inputStream.read())!=-1) {
//			System.out.print((char)val);
//		}
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	try(BufferedReader inputStream = new BufferedReader(new FileReader(file))){
//		String val="";
//		while((val=inputStream.readLine())!=null) {
//			System.out.println(val);
//		}
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
	try(BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file,true))){
		outputStream.write("\nthis is it".getBytes());
		outputStream.flush();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}
