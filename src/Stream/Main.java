
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Students> human = Arrays.asList(
               new Students("Petro", 15),
       new Students("Misha", 17),
        new Students("Dima", 20),
        new Students("Gena", 23),
       new Students("Arsen", 47)

        );
       List <Students> result  = human.stream().filter(students -> ((students.getAge() > 18) && (students.getAge() < 27))).collect(Collectors.toList());
        result.forEach((e) -> System.out.println(e.getName()));

        double averageAge = human.stream().mapToDouble(Students::getAge).average().getAsDouble();

        System.out.println(averageAge);





    }
}
