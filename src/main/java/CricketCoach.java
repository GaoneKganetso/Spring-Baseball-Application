public class CricketCoach implements Coach {

    //Use the FortuneService interface
    private FortuneService fortuneService;

    //create a no-arg constructor
    public  CricketCoach(){
        System.out.println("CricketCoach:inside no arg constructor");

    }
    //Create Setter Methods for injection
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice cricket daily ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
