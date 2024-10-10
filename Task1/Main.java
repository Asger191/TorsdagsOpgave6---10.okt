package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Customer> customers= new ArrayList<>();

       // Task1.Customer customer = new Task1.Customer("Asger", "Junker", "Junker191");
        customers.add(new Customer(" Asger", "Junker", "Junker191"));
        customers.add(new Customer("Daniel", "Jakobsen", "ProblemDaniel"));
        printCustomers(customers);


    }
    static void printCustomers(ArrayList <Customer> customers){
        for(Customer s : customers){
            System.out.println(s);
        }
    }

}