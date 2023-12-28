package gc;


/*This is a program to show that the objects in side method will be garbage collected
 after method execution.
*/

public class GarbageCollectionOne {
	
	String name;

	public GarbageCollectionOne(String name) {
		super();
		this.name = name;
	}

	public static void show() {
		System.out.println("Inside Show method.");
		GarbageCollectionOne garbageCollectionOne = new GarbageCollectionOne("Bhagyashri");
		
		/*
		 * If here we don't give call to method display() then the object
		 * garbageCollectionTwo becomes unreachable and hence garbage collected.
		 */
		display();
	}
	
	public static void display() {
		System.out.println("Inside Display method.");
		GarbageCollectionOne garbageCollectionTwo = new GarbageCollectionOne("Deshmukh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * If here we don't give call to method show() then the object
		 * garbageCollectionOne becomes unreachable and hence garbage collected.
		 */
		show();
		
		// Calling garbage collector manually.
		System.gc();
	}
	
	@Override
	protected void finalize() {
		
		System.out.println("Object "+this.name+" is garbage collected.");
	}
}
