package ec.edu.espol.workshops.second;

/**
 * The CarInsurance class is responsible for calculating the premium 
 * that a user/customer/client must pay
 *
 *
 */
public class CarInsurance {
	/**
	 * BASEPREMIUM is the cost that applies to all clients in their premium
	 */
	public static double BASEPREMIUM=500;	
	/**
	 *It specifies whether customer's information is valid.
	 */
	public static boolean valido=true;
	/**
	 *It specifies that the company approves the premium.
	 */
	public static boolean aprobado=true;
	
	/**
	 * Verification of client data takes place to calculate the premium
	 * @param args
	 */
	public static void main(String[] args) {			
	    System.out.println("Calculate your BASE PREMIUM");
	    Client client = new Client(28,'m', true,"A");
	    CarInsurance insurance = new CarInsurance();
	    if(client.getAge()>80 || !valido) {
	    	System.out.println("No es posible vender");
	    	System.out.println(-1);
	    	System.exit(0);
	    }
	    insurance.calculatePremium(client);
	    if(!aprobado) {
	    	System.out.println(-1);
	    	System.exit(0);
	    }
	    System.out.println(BASEPREMIUM);   
	    System.out.println(1);
	}
	
	
	private void calculatePremium(Client cliente) {
		int age_client = cliente.getAge();
		char gender_client = cliente.getSex();
		boolean maritalStatus = cliente.isMaritalStatus();
		
		switch (gender_client) {
				case 'm':
					calculateCase1(age_client, maritalStatus );
					if (maritalStatus) {
						aprobado=true;
						BASEPREMIUM-=200;}
					break;
				case 'f':
					aprobado=true;
					BASEPREMIUM-=200;
					
					break;	
				default:
					break;
				}
				checkCase3(age_client);
		}
	
	
	 private void checkCase3(int edad) {
			if ((edad>=45)&&(edad<65)) {
				BASEPREMIUM -= 100;
				aprobado=true;
			}
			
	 }
	 
	 private  void calculateCase1(int age, boolean status) {
		 if(age<=25 && !(status)) {
			 BASEPREMIUM+=1500;
			 aprobado=true;
		 }
	 }	 
}
