package ec.edu.espol.workshops.second;

public class CarInsurance {
  public static double BASEPREMIUM=500;	
  public static boolean valido=true;
  public static boolean aprobado=false;
  
  /**  {@inheritDoc}
   * metodo principal
   * @param args String
   */
  public static void main(String[] args) {
   
    Client client = new Client(81,'f', false,"A");
    //System.out.println("Calculate your BASE PREMIUM");
    if(client.getAge()>80 || !valido) {
      System.out.println("It is not possible to sell");
      System.out.println(-1);
      System.exit(0);
  }
    
    calculatePremium(client);
    if(!aprobado) {
      System.out.println(-1);
      System.exit(0);
    }
      System.out.println(BASEPREMIUM);   
      System.out.println(1);
	}
  
  private static void calculatePremium(Client cliente) {
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
	
  public static void checkCase3(int edad) {
    if ((edad>=45)&&(edad<65)) {
      BASEPREMIUM -= 100;
      aprobado=true;
    }
  }

  private static void calculateCase1(int age, boolean status) {
    if(age<=25 && !(status)) {
      BASEPREMIUM+=1500;
      aprobado=true;
    }
  }
}
