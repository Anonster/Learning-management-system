import java.util.ArrayList;

class  Teacher_Organizer{

ArrayList <Teacher> cs =new ArrayList<Teacher>();

    // to add new teachers
  public  void addTeacher(Teacher t) {
        cs.add(t);
  }

    // to remove existing teachers
  public  boolean  removeTeacher(String name) {
    for(Teacher s1 : cs){
      if (s1.getName().equalsIgnoreCase(name)){
          cs.remove(s1);
          return true;
       }
    }
      return false;
  }
 

    // total count of teachers present
  public int  teachercount(){
    System.out.println("Size of bscs is : " + cs.size());
      return cs.size();
  }

    // prints all teachers
  public  void  printTeacher(){
    for(Teacher s : cs){
     s.display();;
    }
  }

    // search teacher on the basis of name
  public  boolean  searchteacher(String name){
    for(Teacher s : cs){
      if (s.getName().equalsIgnoreCase(name)){
         return true;
      }
    }
    return false;
  }

    // search teacher by their salaries
  public boolean search_teacher_salary(int salary){
    for(Teacher s : cs){
        if(s.getSalary() >= 50000 ){
          return true ;
        }
    }
      return false ;
  }

}