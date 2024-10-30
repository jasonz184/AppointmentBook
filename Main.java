public class Main
{
    public static void main(String[] args)
    {
        int[][] nums = {
            {0, 10, 0},
            {10, 5, 1},
            {15, 15, 0},
            {30, 15, 1},
            {45, 5, 0},
            {50, 10, 1}
        };
        AppointmentBook x = new AppointmentBook(nums);
        System.out.println(x);
    }
}