// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {


    public static List<Student> createStudents() {
        List<Student> students = Arrays.asList(
                new Student(101, "Manoj", "Prayagraj", 30),
                new Student(102, "Rahul", "Delhi", 25),
                new Student(103, "krishna", "Prayagraj", 29),
                new Student(104, "Manoj", "Noida", 40),
                new Student(105, "Bablu", "Prayagraj", 18),
                new Student(106, "sumit", "Delhi", 22),
                new Student(107, "Bablu", "Prayagraj", 54),
                new Student(108, "Manoj", "Bangalore", 30)
        );
        return students;

    }
    public static void main(String[] args) {

        List<Student> students = createStudents();

        // students.forEach(System.out::println);
        students.stream()
                .filter(age ->age.getSage()>23)
                .map(name->name.getSname()+" - "+name.getSage())
                .forEach(System.out::println);
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (Integer l: numbers) {
            //System.out.println(l);
        }



        //numbers.forEach(value-> System.out.println(value));
        //numbers.forEach(System.out::println);


       /* numbers.stream()
               // .map(e->e.toString())
                //.map(String::valueOf)
                .map(e->String.valueOf(e))
                .forEach(System.out::println);
        */




    }

}