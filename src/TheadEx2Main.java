class MyThread1 extends Thread{
	 
	//쓰레드의 main()
	 @Override
	 public void run() {
			//음악 듣기
			for(int i=0; i< 300; i++) {
				System.out.print("-");
			}
	 }
 }

 class MyThread2 extends Thread{
	 
	 @Override
	 public void run() {
			//비디오 보기
			for(int i=0; i< 300; i++) {
				System.out.print("+");
			}
	 }
 }
 

public class TheadEx2Main {

	public static void main(String[] args) {
	    
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();		
	}
}