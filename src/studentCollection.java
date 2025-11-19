import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class studentCollection
{

    public void studentsArrayList()
    {
        List <String> students = new ArrayList<>();
        students.add("Dima");
        students.add("Daniel");
        students.add(1,"Cherry");

        for (String list : students)
        {
            System.out.println(list);
        }
    }


    public void studentGrade()
    {
        HashMap<String, Integer> sg = new HashMap<>();

        sg.put("Dima", 5);
        sg.put("Daniel", 4);
        sg.put("Cherry", 3);

        for (HashMap.Entry<String, Integer> grades : sg.entrySet())
        {
            System.out.println(grades.getKey() + " - " + grades.getValue());
        }
    }




    public static void main(String[] args)
    {
        studentCollection studentCollection = new studentCollection();
        ///studentCollection.studentsArrayList();
        studentCollection.studentGrade();

    }
}
