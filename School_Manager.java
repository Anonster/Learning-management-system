import java.util.Scanner;
//65import java.util.ArrayList;
public class School_Manager{
    public static void main(String [] args){
        Student_Organizer student = new Student_Organizer() ;
        Scanner input = new Scanner(System.in);

        //constructor **********************
        Student s1 = new Student("Amna" , "Bajwa" , "Mahmood Ahmad Bajwa" , "Lahore" , 420 , 7 );
        Student s2 = new Student("Sussy" , "Latte" , "Latte Di voca" , "Spain" , 400 , 5 );
        Student s3 = new Student("Rosie" , "Gonzalus" , "Gonzalus Fretto" , "Costaluna" , 450 , 9 );          
        Student s4 = new Student("Carter" , "Mason" , "Joe Mason" , "America" , 435 , 8 );
        Student s5 = new Student("Sully" , "Diaz" , "Jeff Garlin" , "LosAngeles" , 380 , 6 );
        ///************************************* */  

        student.addStudents(s1);
        student.addStudents(s2);
        student.addStudents(s3);
        student.addStudents(s4);
        student.addStudents(s5);

       System.out.println("Total Students " + student.studentcount());
       
       System.out.println(" ");

        // user will initialize this student by giving input
        String ab;
        int ab1 ;
        //student 6 object
        Student s6 = new Student();
        student.addStudents(s6);
        System.out.println("Enter your first name ");
        ab = input.nextLine();
        s6.setfname(ab);
        System.out.println("Enter your last name: ");
        ab = input.nextLine();
        s6.setlname(ab);
        System.out.println("Enter your father name ");
        ab = input.nextLine();
        s6.setsname(ab);
        System.out.println("Enter your address ");
        ab = input.nextLine();
        s6.setaddress(ab);
        System.out.println("Enter your marks : ");
        ab1 = input.nextInt();
        s6.setMarks(ab1);
        System.out.println("Enter the grade you are in : ");
        ab1 = input.nextInt();
        //input.close();
        s6.setGrade(ab1);
        System.out.println("Enter fees :");
        int fees = input.nextInt();
        // s6.setFee(fees);
        //input.close();
        s6.getfname();
        s6.getlname();
        s6.getsname();
        s6.getaddress();
        s6.getMarks();
        s6.getGrade();
        s6.getFeesPaid();
        //test cases
        // System.out.println(" ");


        System.out.println("Total Students now " + student.studentcount());

        student.printStudents();

        System.out.println(" ");

        if (student.searchstudent("Pishu")) {
            System.out.println(" found the Student by the given name");
          } else {
            System.out.println(" did not found the Student by the given name  ");
          }

          System.out.println(" ");

        if (student.search_student_percentage(420)){
            System.out.println("found the student by given marks");
        } else {
            System.out.println("did not found the student by given marks");
        }

        System.out.println(" ");

        Teacher_Organizer teacher = new Teacher_Organizer() ;

        Teacher t1 = new Teacher(43 , "Mae Whitman" , 4700 );
        Teacher t2 = new Teacher(50 , "Lucy Liu" , 5000 );
        Teacher t3 = new Teacher(34 , "Pamela Adlon" , 5500 );
        Teacher t4 = new Teacher(67 , "Raven Symone" , 3700 );
        Teacher t5 = new Teacher(82 , "Rob Paulsen" , 6000 );

        teacher.addTeacher(t1);
        teacher.addTeacher(t2);
        teacher.addTeacher(t3);
        teacher.addTeacher(t4);
        teacher.addTeacher(t5);

        System.out.println(" ");

        System.out.println("Total Teachers " + teacher.teachercount());

        System.out.println(" ");

        // user will initialize this teacher by giving input
        String tc ;
        int tc1;
        // input.close();
        input.nextLine();
        Teacher t6 = new Teacher();
        teacher.addTeacher(t6);
        System.out.println("Enter your name : ");
        // Scanner input = new Scanner(System.in);
        tc = input.nextLine();
        t6.setName(tc);
        System.out.println("Enter your ID : ");
        tc1 = input.nextInt();
        t6.setId(tc1);
        System.out.println("Enter Salary : ");
        tc1 = input.nextInt();
        t6.setSalary(tc1);
        
        t6.getName();
        t6.getId();
        t6.getSalary();

        System.out.println(" ");

        System.out.println("Total Teachers now " + teacher.teachercount());

         teacher.printTeacher();

         System.out.println(" ");

         if (teacher.searchteacher("Joey")) {
            System.out.println(" found the Teacher by the given name");
          } else {
            System.out.println(" did not found the Teacher by the given name  ");
          }

            System.out.println(" ");

        if (teacher.search_teacher_salary(50000)){
            System.out.println("found the Teacher by given salary");
        } else {
            System.out.println("did not found the Teacher by given salary");
        }

            System.out.println(" ");

        input.close();

        School school = new School();

        s1.payFees(10000);
          s1.displayfee();
        s2.payFees(15000);
          s2.displayfee();
        s3.payFees(5000);
          s3.displayfee();
        s4.payFees(11000);
          s4.displayfee();
        s5.payFees(20000);
          s5.displayfee();
        s6.payFees(fees);
      
        System.out.println(" ");

        System.out.println("School has earned Rs. "+ school.getTotalMoneyEarned());

        System.out.println(" ");

        System.out.println("------SCHOOL PAYING SALARY TO STAFF-------");
        t1.receiveSalary(t1.getSalary());
        System.out.println("School has paid salary to " + t1.getName() + " and now has Rs. " + school.getTotalMoneyEarned());
        t2.receiveSalary(t2.getSalary());
        System.out.println("School has paid salary to " + t2.getName() + " and now has Rs. " + school.getTotalMoneyEarned());
        t3.receiveSalary(t3.getSalary());
        System.out.println("School has paid salary to " + t3.getName() + " and now has Rs. " + school.getTotalMoneyEarned());
        t4.receiveSalary(t4.getSalary());
        System.out.println("School has paid salary to " + t4.getName() + " and now has Rs. " + school.getTotalMoneyEarned());
        t5.receiveSalary(t5.getSalary());
        System.out.println("School has paid salary to " + t5.getName() + " and now has Rs. " + school.getTotalMoneyEarned());
        t6.receiveSalary(t6.getSalary());
        System.out.println("School has paid salary to " + t6.getName() + " and now has Rs. " + school.getTotalMoneyEarned());
    }
}