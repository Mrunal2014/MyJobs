
public class InterThreadCommunicationDemo {

	public static void main(String[] args)
	{
		Storage storage = new Storage();
		
		Producer producer = new Producer(storage);
		Thread producerT = new Thread(producer);
		producerT.start();
		
		Consumer consumer = new Consumer(storage);
		Thread consumerT = new Thread(consumer);
		consumerT.start();
	}
}
