public class MyApp {

    public static void main (String[] args){

        /**
        1.Create the Object
        2.Code refactoring : use interface for reuse
        3.BaseBallCoach theCoach = new BaseBallCoach();
        Change to
         **/
        //Coach theCoach = new BaseBallCoach();

        Coach trackCoach = new TrackCoach();


        //Use the object
        System.out.println(trackCoach.getDailyWorkout());

    }
}
