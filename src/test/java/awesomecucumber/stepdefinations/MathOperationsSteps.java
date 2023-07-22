package awesomecucumber.stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;

import java.util.List;
import java.util.Map;

public class MathOperationsSteps {
  private int number1;
  private int number2;
  private int result;

  @Given("I have two numbers")
  public void setNumbers(DataTable dataTable) {
    List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
    Map<String, String> data = rows.get(0);
    number1 = Integer.parseInt(data.get("number1"));
    number2 = Integer.parseInt(data.get("number2"));
  }

  @When("I add them")
  public void addNumbers() {
    result = number1 + number2;
  }

  @Then("the result should be correct")
  public void verifyResult(DataTable dataTable) {
    List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
    Map<String, String> data = rows.get(0);
    int expected = Integer.parseInt(data.get("result"));
    if (result == expected) {
      System.out.println("The result is correct: " + result);
    } else {
      System.out.println("The result is incorrect.Expected : " + expected + ", Actual : " + result);
    }
  }
}
