import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public  static void main(String[] args){
        //load the spring configuration
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve the bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);


        //Call methods on the bean

        //close the context
        context.close();


    }


}
