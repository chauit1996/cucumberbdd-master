package awesomecucumber.stepdefinations;

import awesomecucumber.object.Customer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import java.util.Map;


public class DataTableStepDefs {

//  @DataTableType
//  public Customer customerEntry(Map<String, String> entry) {
//    return new Customer(entry.get("username"), entry.get("password"));
//  }

//  @DataTableType
//  public Customer customerEntry(DataTable dataTable) {
//    return new Customer(dataTable.row(0).get(1), dataTable.row(1).get(1));
//  }

  @DataTableType
  public Customer customerEntry(DataTable dataTable) {
    Map<String , String> entry = dataTable.asMap();
    return new Customer(entry.get("username"), entry.get("password"));
  }


//  @Given("My credentials")
//  public void myCredentials(List<Customer> customer) {
////    List<String> creads= dataTable.row(0);
////    List<List<String>> creads = dataTable.asLists();
////    System.out.println("Username = " + creads.get(0));
////    System.out.println("Password = " + creads.get(1));
////    System.out.println("Row 0 Username = " + customers.get(0).getUsername());
////    System.out.println("Row 0 Password = " + customers.get(0).getPassword());
////    System.out.println("Row 1 Password = " + customers.get(1).getUsername());
////    System.out.println("Row 1 Password = " + customers.get(1).getPassword());
////    System.out.println("Row 0 Password = " + creads.get(1).get(0));
////    System.out.println("Row 1 Password = " + creads.get(1).get(1));
//
////    System.out.println("Username = " + customers.get(1).get(0));
////    System.out.println("Password = " + customers.get(1).get(1));
////    System.out.println("Username = " + customers.get(0).get("username"));
////    System.out.println("Password = " + customers.get(0).get("password"));
////    System.out.println("Username1 = " + customers.get(1).get("username"));
////    System.out.println("Password1 = " + customers.get(1).get("password"));
//
//    System.out.println("USERNAME = " + customer.get(0).getUsername());
//    System.out.println("PASSWORD = " + customer.get(0).getPassword());
//    System.out.println("USERNAME1 = " + customer.get(1).getUsername());
//    System.out.println("PASSWORD1 = " + customer.get(1).getPassword());
//  }


//  @Given("My credentials")
//  public void myCredentials(List<String> customer) {
////    List<String> creads= dataTable.row(0);
//    System.out.println("USERNAME = " + customer.get(0));
//    System.out.println("PASSWORD = " + customer.get(1));
//  }

//  @Given("My credentials")
//  public void myCredentials(DataTable dataTable) {
//    List<String> customer = dataTable.asList();
//    System.out.println("USERNAME = " + customer.get(0));
//    System.out.println("PASSWORD = " + customer.get(1));
//  }

//  @Given("My credentials")
//  public void myCredentials(DataTable dataTable) {
//    Map<String, String> customer = dataTable.asMap();
//    System.out.println("USERNAME = " + customer.get("username"));
//    System.out.println("PASSWORD = " + customer.get("password"));
//  }

//  @Given("My credentials")
//  public void myCredentials(Map<String, String> customer) {
//    System.out.println("USERNAME = " + customer.get("username"));
//    System.out.println("PASSWORD = " + customer.get("password"));
//  }

//  @Given("My credentials")
//  public void myCredentials(@Transpose Customer customer) {
//    System.out.println("USERNAME = " + customer.getUsername());
//    System.out.println("PASSWORD = " + customer.getPassword());
//  }

  @Given("My credentials")
  public void myCredentials(Customer customer) {
    System.out.println("USERNAME = " + customer.getUsername());
    System.out.println("PASSWORD = " + customer.getPassword());
  }
}
