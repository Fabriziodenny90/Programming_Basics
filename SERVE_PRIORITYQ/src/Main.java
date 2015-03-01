
public class Main {

	public static void main(String[] args) {
		PriorityQ<String> q = new PriorityQ<String>(4);
		try {
			q.addElement("Primo", 20);
			q.addElement("Secondo", 10);
			System.out.println("Ehi " + q.peekMax());
			System.out.println("Ehi " + q.peekMax());
			System.out.println("Ehi " + q.takeMax());
			System.out.println("Ehi " + q.peekMax());
			q.addElement("e", 33);
			String s = new String("test");
			q.addElement(s, 39);
			q.changePriority(s, 1);
			q.addElement("z", 27);
			System.out.println("Ehi " + q.takeMax());
			System.out.println("Ehi " + q.takeMax());
			System.out.println("Ehi " + q.takeMax());
			System.out.println("Ehi " + q.takeMax());
			System.out.println("Ehi " + q.takeMax());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("" + e.getMessage());
		}
		
	}

}
