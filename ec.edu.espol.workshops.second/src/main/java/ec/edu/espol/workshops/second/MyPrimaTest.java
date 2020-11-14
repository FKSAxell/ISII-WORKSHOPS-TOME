package ec.edu.espol.workshops.second;

public class MyPrimaTest {
  public static int TestPrimaOver80(int edad) {
    CarInsurance tester = new CarInsurance();
   // int edad=53;
    double baseprima=tester.BASEPREMIUM;
	System.out.println("The status of the premium before: "+tester.aprobado);
	System.out.println("the premium before: "+tester.BASEPREMIUM);
	System.out.println("Age of entry: "+edad);
	tester.checkCase3(edad);
	System.out.println("The status of the premium after: "+tester.aprobado);
	System.out.println("the premium after: "+tester.BASEPREMIUM);
	if(tester.aprobado==true && (baseprima-100)==tester.BASEPREMIUM) {
	  System.out.println("PASS");
	  return 1;
	}else {
	  System.out.println("NO PASS"); 
	  return -1;
	}
  }
  
  public static int TestPrimaAgeGenre(int edad, char genre) {
	    CarInsurance tester = new CarInsurance();
	    double baseprima=tester.BASEPREMIUM;
		System.out.println("The status of the premium before: "+tester.aprobado);
		System.out.println("the premium before: "+tester.BASEPREMIUM);
		System.out.println("Age of entry: "+edad);
		tester.checkCase3(edad);
		System.out.println("The status of the premium after: "+tester.aprobado);
		System.out.println("the premium after: "+tester.BASEPREMIUM);
		if(tester.aprobado==true && (baseprima-100)==tester.BASEPREMIUM) {
		  System.out.println("PASS");
		  return 1;
		}else {
		  System.out.println("NO PASS"); 
		  return -1;
		}
	  }
  
  public static void main(String[] args) {
	TestPrimaOver80(53);
  }
}
