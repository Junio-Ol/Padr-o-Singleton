
public class Sair {

	private static Sair instance;
	
	private Sair(){
		
	};
	
	public static synchronized Sair getInstance() {
		
		if(instance == null) {
			instance = new Sair();
			
		}
		return instance;
		
	}
	
	public  void Taxi() {
		System.out.println("Pegar Táxi");
		
	}
	
	public  void uber() {
		System.out.println("Pegar  Uber");
	}
	
	
	
	
	
}
