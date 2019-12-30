import java.util.ArrayList;

public class  Student_Organizer{



ArrayList <Student> bscs =new ArrayList<Student>();

// to add new students                                                                                                            
  public  void addStudents(Student s) {
        bscs.add(s);
      }

// to remove students
 public  boolean  removeStudent(String name) {
  for(Student s1 : bscs){
      if (s1.getfname().equalsIgnoreCase(name)){
          bscs.remove(s1);
          return true;
       }
  }
 return false;
}
 
// count total number of students present
public int  studentcount(){
   System.out.println("Size of bscs is : " + bscs.size());
   return bscs.size();
}

// prints all students
public  void  printStudents(){
    for(Student s : bscs){
     s.display();
     }
}

// search students on the basis of name
public  boolean  searchstudent(String name){
 for(Student s : bscs){
   if (s.getfname().equalsIgnoreCase(name)){
       return true;
    }
  }
 return false;
    }

// search students on the basis of percentage
public boolean search_student_percentage(int marks){
    for(Student s : bscs){
        if(s.percentage(marks) > 50 ){
        return true ;
        }
    }
    return false;
}
}