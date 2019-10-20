import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainClass implements Runnable{

	@Override
		public void run() {
		int table= Integer.parseInt(Thread.currentThread().getName());
		for(int x=1;x<=10;x++) {
			System.out.println(table + " X "+ x + " = "+ (table*x));
		}
		
		
		}
//public class MainClass extends Thread{
//	@Override
//		public void run() {
//		for(int x=0;x<100;x++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("Downloading .. "+x+"%");
//		}
//		}
public static void main(String[] args) {
	int number = 7;
	Thread []thread = new Thread [number];
	for(int x=1;x<=number;x++) {
		thread[x-1]= new Thread(new MainClass());
		thread[x-1].setName(x+"");
		thread[x-1].start();
	}
	
	
	
	//Executor Framework
//	ExecutorService service= Executors.newFixedThreadPool(3);
//	service.submit(new Runnable() {
//		
//		@Override
//		public void run() {
//			for(int x=0;x<100;x++) {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("Downloading .. "+x+"%");
//			}
//		}
//	});
//	service.shutdown();
//	try {
//		service.awaitTermination(5, TimeUnit.SECONDS);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	System.out.println("Terminated");
	
	
	
	
	
//	Thread t1 = new Thread (new MainClass()
//			);
//	t1.start();
//	MainClass mainClass = new MainClass();
//	mainClass.start();
	
	
	
//	Runnable runnable = ()->{
//		for(int x=0;x<100;x++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("Downloading .. "+x+"%");
//		}
//};
//	Thread t1= new Thread(runnable);t1.start();
//	try {
//		t1.join();
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	System.out.println("Remaining Program");
}
}
