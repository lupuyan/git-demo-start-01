package cn.lpy.example.thread;

public class TestThread {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		new Thread(th,"窗口一").start();
		new Thread(th,"窗口二").start();
		new Thread(th,"窗口三").start();
		new Thread(th,"窗口四").start();
	}
}
