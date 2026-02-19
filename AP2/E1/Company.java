import java.util.*;
import java.util.stream.Collectors;
abstract class Employee{
    private final String empId,empName;
    private final double baseSalary;
    public Employee(String empId,String empName,double baseSalary){
        this.empId=empId;
        this.empName=empName;
        this.baseSalary=baseSalary;
    }
    public String getEmpId(){return empId;}
    public String getEmpName(){return empName;}
    public double getBaseSalary(){return baseSalary;}
    public abstract double calculateBonus();
    public void displayDetails(){
        double bonus=calculateBonus();
        System.out.printf("ID:%s | Name:%s | Base Salary:₹%.2f | Bonus:₹%.2f | Total:₹%.2f%n",empId,empName,baseSalary,bonus,baseSalary+bonus);
    }
}
class Manager extends Employee{
    public Manager(String id,String name,double salary){super(id,name,salary);}
    public double calculateBonus(){return getBaseSalary()*0.20;}
}
class Developer extends Employee{
    private static final double PROJECT_ALLOWANCE=2000;
    public Developer(String id,String name,double salary){super(id,name,salary);}
    public double calculateBonus(){return getBaseSalary()*0.15+PROJECT_ALLOWANCE;}
}
class Intern extends Employee{
    public Intern(String id,String name,double salary){super(id,name,salary);}
    public double calculateBonus(){return getBaseSalary()>10000?getBaseSalary()*0.05:500;}
}
public class Company{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Employee> employees=new ArrayList<>();
        System.out.print("Enter number of employees:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.printf("%nEnter details for Employee %d%n",i);
            System.out.print("Category(Manager/Developer/Intern):");
            String category=sc.nextLine().trim().toLowerCase();
            System.out.print("ID:");
            String id=sc.nextLine().trim();
            System.out.print("Name:");
            String name=sc.nextLine().trim();
            System.out.print("Base Salary(₹):");
            double salary=sc.nextDouble();
            sc.nextLine();
            Employee emp=switch(category){
                case "manager"->new Manager(id,name,salary);
                case "developer"->new Developer(id,name,salary);
                case "intern"->new Intern(id,name,salary);
                default->{System.out.println(" Invalid category,skipping this employee.");yield null;}
            };
            if(emp!=null){
                employees.add(emp);
                emp.displayDetails();
            }
        }
        if(employees.isEmpty()){
            System.out.println("\nNo valid employees entered.");
            return;
        }
        Employee topEmployee=employees.stream().max(Comparator.comparingDouble(Employee::calculateBonus)).orElse(null);
        if(topEmployee!=null){
            System.out.println("\n Employee with Highest Bonus:");
            topEmployee.displayDetails();
        }
        System.out.println("\n Average Bonus per Category:");
        Map<String,Double> avgBonusByCategory=employees.stream().collect(Collectors.groupingBy(e->e.getClass().getSimpleName(),Collectors.averagingDouble(Employee::calculateBonus)));
        avgBonusByCategory.forEach((cat,avg)->System.out.printf("%s:₹%.2f%n",cat,avg));
        sc.close();
    }
}
