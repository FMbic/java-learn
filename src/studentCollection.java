import java.util.ArrayList;
import java.util.List;

public class studentCollection
{

    public void studentsArrayList()
    {
        List <String> students = new ArrayList<>();
        students.add("Dima");
        students.add("Daniel");
        students.set(1, "Cherry");

        System.out.println("Students: ");

        for (String student : students)
        {
            System.out.println(student);
        }
    }

    public static void main(String[] args)
    {
        studentCollection studentCollection = new studentCollection();
        studentCollection.studentsArrayList();

    }
}
