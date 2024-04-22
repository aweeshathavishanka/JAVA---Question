package question01;

public class EmpApp {
    public static void main(String[] args) {
        ParttimeEmployee emp1 = new ParttimeEmployee("Alice", 20000.00, 7);
        ParttimeEmployee emp2 = new ParttimeEmployee("Bob", 15000.00, 5);

        emp1.displayEmpInfo();
        emp2.displayEmpInfo();
    }
}
