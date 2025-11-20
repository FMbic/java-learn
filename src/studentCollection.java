import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studentCollection
{

    public void studentsArrayList()
    {
        List <String> students = new ArrayList<>() {};
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
        int above = 4;
        sg.put("Dima", 5);
        sg.put("Daniel", 4);
        sg.put("Cherry", 3);


        for(HashMap.Entry<String, Integer> kick : sg.entrySet())
        {
            if (kick.getValue() < above)
            {
                sg.remove(kick.getValue());
            }
        }


        for (HashMap.Entry<String, Integer> grades : sg.entrySet())
        {
            System.out.println(grades.getKey() + " - " + grades.getValue());
        }

        int avg = (sg.values().stream().mapToInt(Integer::intValue).sum()) / sg.size();
        System.out.println("Avg grade: "+avg);

        int high = sg.values().stream().max(Integer::compareTo).get();
        System.out.println("Highest grade: "+high);

        int low = sg.values().stream().min(Integer::compareTo).get();
        System.out.println("Low grade: "+low);



        for(HashMap.Entry<String, Integer> grade : sg.entrySet())
        {
            if (grade.getValue() > above)
            {
                System.out.println("Students above 4: "+grade.getKey() + " - " + grade.getValue());
            }
        }



    }


    public static void main(String[] args)
    {
        studentCollection studentCollection = new studentCollection();
        ///studentCollection.studentsArrayList();
        studentCollection.studentGrade();

    }
}
