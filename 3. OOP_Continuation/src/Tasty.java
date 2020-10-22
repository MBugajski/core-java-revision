
public interface Tasty {
	
//	public  void fry();
	
	public default void  fry() {
		System.out.println("A " + this.getClass().getName().toLowerCase()  + " is being fried");		
}
}