//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Created first Empobj
        Employee empObj = new Employee("John", "Doe", "Software Engineer", 50.00);
        double weeklySalary = empObj.calculateWeeklySalary();
        System.out.println("The weekly pay Rate is : " + weeklySalary);
        System.out.println(empObj.toString());
        Employee empObj1 = new Employee("Smith", "Nick", "Java Developer", 65.00);
        System.out.println(empObj.equals(empObj1));
        //Comparing two Objects
        Employee empObj2 = new Employee("John", "nick", "Software Engineer", 50.00);
        System.out.println(empObj.equals(empObj2));

    }
}