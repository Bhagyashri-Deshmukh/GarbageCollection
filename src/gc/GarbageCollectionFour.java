package gc;

// Object which is created anonymously will be garbage collected.

public class GarbageCollectionFour {
	
	private String name;

	public GarbageCollectionFour(String name) {
		super();
		System.out.println("Constructor called.");
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GarbageCollectionFour("Four");
		
		System.gc();
	}
	
	@Override
	protected void finalize() {
		System.out.println("Object "+this.name+" is garbage collected.");
	}

}
