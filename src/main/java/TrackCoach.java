public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }


    @Override
    public String getDailyWorkout() {
        return "Run 50 kilometres";
    }

    @Override
    public String getDailyFortune(){
        return "Try your fortune" + fortuneService.getFortune();
    }
}
