package herovired;

public class threadDemo {
	/*class thread1 extends Thread{
		public void run(){
			System.out.println("Thread is running");		
		}
	}
	public static void main(String[] args) {
		threadDemo thread = new threadDemo();
		thread1 t = thread .new thread1();
		t.start();
	}*/
	public static void main(String[] arg) {
		threadDemo thrObj = new threadDemo();
		Fibonacii fib = thrObj.new Fibonacii();
		fib.start();
	}
	class Fibonacii extends Thread{
		public void run() {
			int st = 0;
			int sst = 1;
			int sum = 1;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			System.out.println(st+"\n"+sst+"\n"+sum);
			for(int i = 0 ; i < 20 ; i++) {
				st = sst;
				sst = sum;
				sum = st+sst;
				System.out.println(sum);
			}
			
		}
	}
}
