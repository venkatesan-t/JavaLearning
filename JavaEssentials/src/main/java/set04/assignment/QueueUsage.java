package set04.assignment;

public class QueueUsage {

	public static void main(String[] args) {
		Queue q = new QueueImplementation();
		q.insert(5);
		q.insert(8);
		q.insert(14);
		q.insert(46);
		q.insert(78);
		q.insert(89);
		q.delete();
		q.delete();
		q.delete();
		q.delete();
		System.out.println("The element at front is " + ((QueueImplementation)q).getElementAtFront());
		q.delete();
		q.delete();		
	}
}
