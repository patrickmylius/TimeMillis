public class time {
    public static void main(String[] args) {

        //Obtain the total milisceonds
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        //Prints out clock with calculations since 1970, had to add + 2 in () with currentHour to hit exact time zone
        System.out.println("Current time is " + (currentHour + 2 ) + " : " + currentMinute + " : " + currentSecond + " G M T ");

        System.out.println("Years since 1970 : " + System.currentTimeMillis()  / 1000 / 60 / 60 / 24 / 365);



    }
}
