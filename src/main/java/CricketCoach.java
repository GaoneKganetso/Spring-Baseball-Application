public class CricketCoach implements Coach {

    //Create private fields for injecting literal values
    private String emailAddress;
    private String team;

    //Generate Setter and getter methods for injecting literal value

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach:setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach :setTeam");
        this.team = team;
    }

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
