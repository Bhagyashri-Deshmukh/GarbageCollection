package gc;

/*this program demonstrate that if you assign a reference to null,
that object would be garbage collected.*/

public class GarbageCollectionThree {
	
	private String name;

	public GarbageCollectionThree(String name) {
		super();
		System.out.println("Constructor is called.");
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionThree three = new GarbageCollectionThree("Three");
		
		// here reference three is assigned to null so object three will be garbage collected.
		three = null;
		System.gc();
	}
	
	@Override
	protected void finalize() {
		
		System.out.println("Object "+this.name+" is garbage collected.");
	}

}
