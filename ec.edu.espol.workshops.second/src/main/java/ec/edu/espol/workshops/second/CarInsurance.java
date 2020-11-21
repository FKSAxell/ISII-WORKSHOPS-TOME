package ec.edu.espol.workshops.second;

public class CarInsurance {
	public static double BASEPREMIUM = 500;
	public static boolean valido = true;
	public static boolean aprobado = false;

	/**
	 * {@inheritDoc} metodo principal
	 * 
	 * @param args String
	 */
	public static void main(String[] args) {

		System.out.println("GET PREMIUM");
		double num = getPremium(81, 'm', true);
		System.out.println(num);
	}

	/**
	 * method to get the premium
	 * 
	 * @param edad
	 * @param genre
	 * @return
	 */

	public static double getPremium(int edad, char genre, boolean maritalStatus) {
		BASEPREMIUM= 500;
		Client client = new Client(edad, genre, maritalStatus, "A");
		if (client.getAge() < 18 || client.getAge() > 80 || !valido) {
			return -1;
		}
		try {
		       int num=client.getAge()/1;
		} catch (NumberFormatException excepcion) {
		        return -1;
		}
		calculatePremium(client);
		if (!aprobado) {
			return -1;
		}

		return BASEPREMIUM;

	}

	private static void calculatePremium(Client cliente) {
		int age_client = cliente.getAge();
		char gender_client = cliente.getSex();
		boolean maritalStatus = cliente.isMaritalStatus();
		switch (gender_client) {
		case 'm':
			calculateCase1(age_client, maritalStatus);
			if (maritalStatus) {
				aprobado = true;
				BASEPREMIUM -= 200;
			}
			break;
		case 'f':
			aprobado = true;
			BASEPREMIUM -= 200;
			break;
		default:
			break;
		}
		checkCase3(age_client);
	}

	public static void checkCase3(int edad) {
		if ((edad >= 45) && (edad < 65)) {
			BASEPREMIUM -= 100;
			aprobado = true;
		}
	}

	private static void calculateCase1(int age, boolean status) {
		if (age <= 25 && !(status)) {
			BASEPREMIUM += 1500;
			aprobado = true;
		}
	}
}
