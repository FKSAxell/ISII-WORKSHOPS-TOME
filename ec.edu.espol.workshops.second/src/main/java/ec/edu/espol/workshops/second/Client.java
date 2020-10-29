package ec.edu.espol.workshops.second;

public class Client {
	private int age;
	private char sex;
	private boolean maritalStatus; 
	private String licencia;
	
	public Client(int age,char sex,boolean maritalStatus,String licencia) 
	{
		this.age=age;
		this.sex=sex;
		this.maritalStatus=maritalStatus;
		this.licencia=licencia;
	}
	
	public String getLicencia() {

		 return licencia;

		 }
	public int getAge() {

		 return age;

		 }
	public void setAge(int age) {
		this.age=age;
	}

		public char getSex() {

		 return sex;

		 }
		public void setSex(char sex) {
			this.sex=sex;
		}

		public boolean isMaritalStatus() {

		 return maritalStatus;

		 }
		
	public void setIsMaritalStatus(boolean maritalStatus) {
		this.maritalStatus=maritalStatus;
	}

}
