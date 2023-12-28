package gc;

/*this is a program to show that the object will be garbage collected 
if reference to that object is refered to another object.
*/

public class GarbageCollectionTwo {
	
	private String name;

	public GarbageCollectionTwo(String name) {
		System.out.println("Inside constructor.");
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionTwo two = new GarbageCollectionTwo("Two");
		GarbageCollectionTwo three = new GarbageCollectionTwo("Three");
		
		/*
		 * reference two is now pointing to object "Three", so object "Two" becomes
		 * eligible for garbage collection
		 */
		two=three;		
		System.gc();		
	}
	
	@Override
	protected void finalize() {
		System.out.println("Object "+this.name+" is garbage collected.");
	}

}
