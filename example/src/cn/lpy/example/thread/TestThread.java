package cn.lpy.example.thread;

public class TestThread {

	public static void main(String[] args) {
		
		say();
		save();
		System.out.println("我是克隆的");
	}
	
	public static void say(){
		System.out.println("参加活动！！！");
	}
	
	public static void save(){
		System.out.println("增加体重！！！");
	}
}
