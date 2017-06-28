package kafka;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KafkaProducer1 producer = new KafkaProducer1();
		producer.SendMessage("test", "hello word");
	}
	
}
