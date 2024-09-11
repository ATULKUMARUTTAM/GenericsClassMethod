import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        GenericClass<Integer, String> g1 = new GenericClass<>(101, "ABC");
        GenericClass<Integer, String> g2 = new GenericClass<>(102, "cde");
        GenericClass<Integer, String> g3 = new GenericClass<>(103, "xyz");
        GenericClass<Integer, String> g4 = new GenericClass<>(104, "ABC");

        List<GenericClass> LG = new ArrayList<>();
        LG.add(g1);
        LG.add(g2);
        LG.add(g3);
        LG.add(g4);

        display(LG);



        GenericClass<Integer, Double> g11 = new GenericClass<>(101, 12.45);
        GenericClass<Integer, Double> g22 = new GenericClass<>(102, 45.78);
        GenericClass<Integer, Double> g33 = new GenericClass<>(103, 67.78);
        GenericClass<Integer, Double> g44 = new GenericClass<>(104, 67.45);

        List<GenericClass> LD = new ArrayList<>();
        LD.add(g11);
        LD.add(g22);
        LD.add(g33);
        LD.add(g44);

        display(LD);



/*

        List<Student> LS = new ArrayList<>();
        LS.add(new Student(101, "gjhgj"));
        LS.add(new Student(561, "hgjhggjhgj"));
        LS.add(new Student(11, "uigjhgj"));
        LS.add(new Student(112, "dgfdgjhgj"));
        LS.add(new Student(151, "dfgdgjhgj"));

       display(LS);

List<Integer> LI =  new ArrayList<>();
        LI.add(10);
        LI.add(65);
        LI.add(3);
        LI.add(17);
display(LI);
        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.roll> o2.roll)
                    return -1;
                else
                    return 1;

            }
        };
        Collections.sort(LS, c);
        display(LS);

    List<Employee> LE =  new ArrayList<>();
    LE.add(new Employee(11, "hgjhg"));
        LE.add(new Employee(421, "gjhghgjhg"));
        LE.add(new Employee(211, "adshgjhg"));
        LE.add(new Employee(131, "klkhgjhg"));

        Collections.sort(LE);
        display(LE);
*/

    }
public static <T> void display(List<T> LG)
{
    for(T  i: LG)
        System.out.println(i);
}
}