
public class SingletonDemo {
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadOne = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Singleton object1 = Singleton.getInstance();
			}
		});
		
		Thread threadTwo = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Singleton object2 = Singleton.getInstance();
			}
		});

		threadOne.start();
		threadTwo.start();

	}
}


class Singleton {

	public static Singleton singleton;
	
	private Singleton() {
		System.out.println("Constructor");
	}
	
	public static Singleton getInstance() {
		
		if (singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
