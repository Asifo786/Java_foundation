class Employee{
    String name;
    int yearOfJoining;
    int salary;
    String address;
}



public class Test5 {
    public static void main(String[] args) {
        // first employee as object of class Employee
        Employee obj1 = new Employee();
        obj1.name = "Robert";
        obj1.yearOfJoining= 1994;
        obj1.address = "64C-WallsStreet";

        // second employee as object or instance of class Employee
        Employee obj2 = new Employee();
        obj2.name = "Sam";
        obj2.yearOfJoining= 2000;
        obj2.address = "68D-WallsStreet";

        // Third employee as object or instance of class Employee
        Employee obj3 = new Employee();
        obj3.name = "John";
        obj3.yearOfJoining= 1999;
        obj3.address = "26B-WallsStreet";

        System.out.println("\nName\t\t\tYear of Joining\t\t\tAddress");
        System.out.println(obj1.name+"\t\t\t"+obj1.yearOfJoining+"\t\t\t"+obj1.address);
        System.out.println(obj2.name+"\t\t\t"+obj2.yearOfJoining+"\t\t\t"+obj2.address);
        System.out.println(obj3.name+"\t\t\t"+obj3.yearOfJoining+"\t\t\t"+obj3.address);
    }
}
