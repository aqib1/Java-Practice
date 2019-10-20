public class MainClass {
	int x=6;
 public static void test() throws MyException{
	 try {
			int v=Integer.parseInt("abc");
			System.out.println(v);
		}catch(RuntimeException e) {
			System.out.println("catch exception");
			throw new MyException(e.getMessage()+"\n"+e.getLocalizedMessage());
		}finally {
			System.out.println("i am working");
		}
		
 }
public static void main(String[] args) {
	try {
		test();
	} catch (MyException e) {
		System.out.println(e.serialVersionUID);
		e.printStackTrace();
	}
//	int y ='c';

	
//	try {
//		
//	}catch (StackOverflowError e) {
//		
//	}
//	try {
//		
//	}catch(OutOfMemoryError e) {
//		
//	}
//	MainClass mainClass=null;
//	int val=Integer.parseInt("acb");
//	File file= new File("abc.txt");
//	try {
//		file.createNewFile();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
	
}
}
