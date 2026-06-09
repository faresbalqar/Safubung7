public class University{

    public static void main(String[] args){
       Student student1 = new Student(444, 2, "Anna", "Schmidt");
       Student student2 = new Student(445, 2, "John", "Pitt");
       Student student3 = new Student(446, 2, "Peter", "Pan");

       Course course1 = new Course("PROG1");
       Exercise exercise1 = new Exercise("Methoden in Java");

       System.out.println(course1.register(student1));
       System.out.println(course1.register(student2));
       System.out.println(exercise1.register(student1));
       
       course1.print();
       student1.printStudent();

       System.out.println(course1.getCapacity());
       

    }

}