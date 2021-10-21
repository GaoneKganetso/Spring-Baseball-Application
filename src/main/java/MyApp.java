public class MyApp {

    public static void main (String[] args){

        /**
        1.Create the Object
        2.Code refactoring : use interface for reuse
        3.BaseBallCoach theCoach = new BaseBallCoach();
        Change to
         **/
        Coach theCoach = new BaseBallCoach();



        //Use the object
        System.out.println(theCoach.getDailyWorkout());

    }
}
