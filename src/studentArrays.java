public class studentArrays
{
    public static void main(String[] args)
    {
        double [] studentGrades = {85.5, 92.0, 78.5, 96.5, 88.0};
        double gradeSum = 0;
        double hi = studentGrades[0];
        double lo = studentGrades[0];

        for (int i = 0 ; i < studentGrades.length; i++){
            gradeSum =  gradeSum + studentGrades[i];
        }
        double avgGrSum = gradeSum / studentGrades.length;

        for (int u = 0; u < studentGrades.length; u++)
        {
            if (studentGrades[u] > hi){
                hi = studentGrades[u];
            }
        }

        for (int x = 0 ; x < studentGrades.length; x++)
        {
            if (studentGrades[x] < lo)
            {
                lo = studentGrades[x];
            }
        }
        System.out.println("Highest number in array " + hi);
        System.out.println("Lowest number in array " + lo);
        System.out.println("The grade sum is " + avgGrSum);
    }
}
