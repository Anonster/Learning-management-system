//import java.util.Scanner;

public class Student{

    private String first_name;
    private String last_name; 
    private String father_name; 
    private String address;
    private int feespaid ;
    private int totalfee ;
    private int marks ;
    private float percentage;
    private int grade ;
    
    // empty constructor
     Student(){
    }
    
    
    // constructor that takes object as parameter 
    
    Student(Student ob) { 
      first_name = ob.first_name;
      last_name = ob.last_name ; 
      father_name = ob.father_name; 
      address = ob.address ;
      percentage = ob.percentage;
      feespaid = ob.feespaid ;
      totalfee = ob.totalfee ;
      grade = ob.grade ;

    
    }
    
    // parametrized constructor 
    Student(String first_name,String last_name,String father_name,String address){
          this.first_name=first_name;
          this.last_name=last_name;
          this.father_name=father_name; 
          this.address=address;
    }
    
    
    // parametrized constructor with all the fields
    Student(String first_name,String last_name,String father_name,String address,int marks,int grade){
          this.first_name=first_name;
          this.last_name=last_name;
          this.father_name=father_name; 
          this.address=address;
          this.marks = marks;
          this.grade = grade ;
          this.feespaid = 0 ;
          this.totalfee = 35000;
    
    }
    
        //setters or mutators 
    public void setfname(String first_name){
        this.first_name=first_name;
    }
    public void setlname(String last_name){
        this.last_name=last_name;
    }
    public void setsname(String  father_name){
        this.father_name=father_name;
    }
    public void setaddress(String address){
        this.address=address;
    }
   public void setGrade(int grade){
       this.grade = grade ;
   }
    public void setMarks(int marks){
        this.marks = marks ;
    }
    public void setFee(int feespaid){
        this.feespaid = feespaid;
    }

       // getors or accessors
    public String getfname(){
     return first_name;
    }
    public String getlname(){
     return last_name;
    }
    public String getsname(){
     return father_name;
    }
    public String getaddress(){
     return address;
    }
    public int getMarks(){
        return marks ;
    }
    public int getGrade(){
        return grade ;
    }
    public int getFeesPaid() {
        return feespaid;
    }
    public int getFeesTotal() {
        return totalfee;
    }
    
    
    // to calculate the percentage of students 
    public float percentage(int marks){
    
      return percentage = ( ( marks *100) / 500);
      
    }

    // to assign the grade to students according to their percentage
    public String  academicGrade(){
        if(percentage(marks)>90)
         return "A";
        else if (percentage(marks)>80)
         return "B+";
        else if  (percentage(marks)>70)
           return "B";
        else if (percentage(marks)>60)
           return "C";
        else if (percentage(marks)>50)
         return "C-";
        else if (percentage(marks)<50)
           return "F";
        
        return " ";
        }
 
    /*
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     */
    public void payFees(int fees){
        feespaid += fees;
        School.updateTotalMoneyEarned(feespaid) ;
    }
    
    public int getRemainingFees(){
        return totalfee - feespaid;
    }
    
    // display method 
    public void display(){
    System.out.println("########## STUDENT DATA ###########");
    System.out.println("Student Name:     " + getfname() + " " + getlname());
    System.out.println("Father Name:      " + getsname());
    //System.out.println("Total fees paid so far is Rs. " + feespaid );
    System.out.println("Percentage: "+ percentage(marks) + "%");
    System.out.println("Academic Grade : " + academicGrade());
    System.out.println("Grade: "+  grade ) ;
    System.out.println("##################################");
    System.out.println("                               ");
    }
    
    public void displayfee(){
        System.out.println(" fees paid : " + feespaid + " by Student " + getfname() + " " + getlname());
        
    }

    /*
    public static void main(String [] args){
        Student s1 = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Name:");
        s1.first_name = input.next();
        s1.last_name = input.next();
        System.out.println("father name:");
        s1.father_name = input.next();
        System.out.println("Address : ");
        s1.address = input.next();
        System.out.println("Marks");
        s1.marks = input.nextInt();
        input.close();
        s1.display();
    }
    */
    }