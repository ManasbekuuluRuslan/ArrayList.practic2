import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Azimbek", 13, "SchoolBoy");
        Employee employee2 = new Employee("Erbol", -14, "Programmer");
        Employee employee3 = new Employee("M", 21, "Manager");
        Employee employee4 = new Employee("Ruslan", 20, "Assistent restoran");
        Employee employee5 = new Employee("Syimyk", 18, null);

        try {
        ArrayList<Employee> people = new ArrayList<>(Arrays.asList(employee1,
                    employee2, employee3, employee4, employee5));
            System.out.println(people);
            for (Employee a : people) {
                if (a.getAge() < 0) {
                    throw new MyException("Жаш терс болушу мумкун эмес !!!");
                }
                else if (a.getJob() == null) {
                    throw new MyException("Жумушу жок болушу мүмкүн эмес!!!");
                }
                if(a.getName().length() < 2){
                    throw new MyException("Жумушчунун аты 1 симболдон кем болбойт!!!");
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Never look back!");
        }
    }
}