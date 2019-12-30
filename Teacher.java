
//import java.util.Scanner;
public class Teacher{

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // parametrized constructor
    public Teacher(int id, String name , int salary){
        this.id=id;
        this.name=name;
        this.salary= salary;
        this.salaryEarned=0;
    }

    // constructor that takes object as parameter
    public Teacher(Teacher ob ){
        id = ob.id ;
        name = ob.name ;
        salary = ob.salary ;
        salaryEarned = ob.salaryEarned;
    }

    // empty constructor
    public Teacher(){
    }

    // getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return  salary;
    }

    //setters
    public void setId(int id){
        this.id = id ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setSalary(int salary){
        this.salary = salary ;
    }
    
     /*
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     */
    public void receiveSalary(int salary){
             salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public void display(){
        System.out.println("-----------Teachers Data------------");
        System.out.println("Teacher Name : " + getName());
        System.out.println("Teacher ID : " + getId());
        System.out.println("Teacher Salary : " + getSalary());
        System.out.println("-------------------------------------");
       
    }

        /*
        testing the class if it works
    public static void main(String [] args){
        Teacher s1 = new Teacher();
        Scanner input = new Scanner(System.in);
        System.out.println("Name :");
        s1.name = input.next();
        System.out.println(" ID : ");
        s1.id = input.nextInt();
        input.close();
        s1.receiveSalary(50000);
        System.out.println(s1);
    }
        */
}
