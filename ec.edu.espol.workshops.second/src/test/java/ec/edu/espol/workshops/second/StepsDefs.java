package ec.edu.espol.workshops.second;
import ec.edu.espol.workshops.second.MyPrimaTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {
 private int year;
 private int actualAnswer;
 @Given("Customer is between 45 and 65 years old")
 public void customer_age_45() {
 year = 46;
 }
 @Given("The customer is {int}")
 public void customer_age(int year) {
 this.year = year;
 }
 @When("Calculate the premium")
 public void  TestPrima45between65() {
 actualAnswer = MyPrimaTest.TestPrima45between65(year);
 }
 @Then("I should be told {int}")
 public void i_should_be_told(String expectedAnswer) {
 assertEquals(expectedAnswer, actualAnswer);
 }
}