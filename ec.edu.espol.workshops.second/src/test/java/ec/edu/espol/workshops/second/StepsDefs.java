package ec.edu.espol.workshops.second;

import ec.edu.espol.workshops.second.CarInsurance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {
	private int age;
	private char genre;
	private boolean maritalStatus;
	private double actualAnswer;

	@Given("The customer is {int} old")
	public void the_customer_is_old(int age) {
		this.age = age;
	}

	@When("Calculate the premium")
	public void CalculatePremium80() {
		actualAnswer = CarInsurance.getPremium(age, 'm', true);
	}

	@Then("Show {double}")
	public void show(Double int1) {
		assertEquals(int1, actualAnswer, 0);
	}
	
	/**Test for the second feature*/
	@Given("The customer is {string}, {string}, and {int} years old")
	public void the_customer_male_unmarried_24(String genre, String isMarried, Integer years) {
		char ngenre = (genre.equals("male"))? 'm': 'f';
		this.genre = ngenre;
		this.age= years;
		this.maritalStatus= (isMarried=="married")? true: false;
	}
	
	@When("Calculate the Premium second case")
	public void CalculatePremiumMaleUnmarriedUnder25() {
		actualAnswer = CarInsurance.getPremium(age, genre, maritalStatus);
	}
	
	@Then("Show {double} premium")
	public void showMaleUnmarriedUnder25(Double int1) {
		assertEquals(int1, actualAnswer, 0);
	}
	
	/**Test for the third feature*/
	@Given("The customer is {string} and {int} years old")
	public void the_customer_female_under80(String genre, Integer years) {
		char ngenre = (genre.equals("male"))? 'm': 'f';
		this.genre = ngenre;
		this.age= years; 
		this.maritalStatus= true; // it does not matter
	}
	
	@When("Calculate the premium for female third case")
	public void calculate_female_under_80() {
		actualAnswer = CarInsurance.getPremium(age, genre, maritalStatus);
	}
	
	@Then("Show {double} premium for female")
	public void showFemaleUnder80(Double int1) {
		assertEquals(int1, actualAnswer, 0);
	}
	
	/**Test for the last case, male between 45 - 80*/
	@Given("Customer is {string}, {string} and {int} years old, last case")
	public void the_customer_male_between(String genre, String isMarried, Integer years) {
		char ngenre = (genre.equals("male"))? 'm': 'f';
		this.genre = ngenre;
		this.age= years; 
		this.maritalStatus= (isMarried=="married"? true: false); // it does not matter
	}
	
	@When("Calculate the premium for a male last case")
	public void calculate_male_between() {
		actualAnswer = CarInsurance.getPremium(age, genre, maritalStatus);
	}
	
	@Then("Show {double} for last case")
	public void show_male_between(Double int1) {
		assertEquals(int1, actualAnswer, 0);
	}
	
}