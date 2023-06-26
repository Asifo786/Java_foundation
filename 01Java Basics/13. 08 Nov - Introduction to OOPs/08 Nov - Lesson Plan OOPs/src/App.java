class Student{
    String studentName;
    int rollNo;
}



public class App {
    public static void main(String[] args) throws Exception {
       Student obj1 = new Student();
       obj1.studentName = "Musharraf Junaid";
       obj1.rollNo = 1;
       System.out.println(obj1.studentName);
       System.out.println(obj1.rollNo);

       Student obj2 = new Student();
       obj2.studentName = "Mustjaab";
       obj2.rollNo = 2;
       System.out.println(obj2.studentName);
       System.out.println(obj2.rollNo);
    }
}
