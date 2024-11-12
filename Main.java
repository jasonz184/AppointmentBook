public class Main
{
    public static void main(String[] args)
    {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        for(int i = 50; i < 60; i++) schedule[1][i] = true;
        a.printPeriod(2);
        System.out.println("Test cases: ");
        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2, 9));
        System.out.println(a.findFreeBlock(2, 20));
        AppointmentBook b = new AppointmentBook(schedule);
        b.printPeriod(4);
        System.out.println(b.makeAppointment(2, 4, 22));
        b.printPeriod(4);
        System.out.println(" ");
        AppointmentBook c = new AppointmentBook(schedule);
        c.printPeriod(3);
        System.out.println(c.makeAppointment(3, 4, 3));
        c.printPeriod(3);
        System.out.println(" ");
        AppointmentBook d = new AppointmentBook(schedule);
        d.printPeriod(2);
        System.out.println(d.makeAppointment(2, 4, 30));
        d.printPeriod(2);
    }
}