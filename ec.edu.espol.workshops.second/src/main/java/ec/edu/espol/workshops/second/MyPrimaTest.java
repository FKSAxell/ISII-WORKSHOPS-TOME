package ec.edu.espol.workshops.second;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class MyPrimaTest {

  public static void TestNoAplicaInicio() {
	    CarInsurance tester = new CarInsurance();
	    Client client = new Client(80,'m', true, "A");
	    int x = (int) (Math.floor(18/client.getAge()));
	    int y = (int) (Math.floor(79/client.getAge()));
	    assertEquals(1, x);
	    assertEquals(0, y);
	    assertNotEquals('A',client.getLicencia());
}
  
 static void TestMarriet() {
	    CarInsurance tester = new CarInsurance();
	    Client client = new Client(40,'m', true, "A");
	    assertEquals(true, client.isMaritalStatus());
}
 
  public static void TestRangoEdad4565() {
	    CarInsurance tester = new CarInsurance();
	    Client client = new Client(47,'m', true, "A");
	    int x = (int) (Math.floor(44/client.getAge()));
	    int y = (int) (Math.floor(64/client.getAge()));
	    assertEquals(0, x);
	    assertEquals(1, y);
}
  public static void TestRangoEdad25() {
	    CarInsurance tester = new CarInsurance();
	    Client client = new Client(23,'m', true, "A");
	    int x = (int) (Math.floor(24/client.getAge()));
	    assertEquals(1, x);
	    assertEquals(false,client.isMaritalStatus());
}
  
  public static void TestCaseM() {
	    CarInsurance tester = new CarInsurance();
	    Client client = new Client(23,'m', true, "A");
	    assertEquals('m',client.getSex());
}
  public static void TestCaseF() {
	    CarInsurance tester = new CarInsurance();
	    Client client = new Client(23,'f', true, "A");
	    assertEquals('f',client.getSex());
}
  public static void main(String[] args) {
	  TestNoAplicaInicio();
	  TestMarriet();
	  TestRangoEdad4565();
	  TestRangoEdad25();
	  TestCaseM();
	  TestCaseF();
  }
}


