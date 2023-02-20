package generics.exercise;

public class Person<J extends Job> {

    J job;

    public Person(J job){
        this.job = job;
    }


}
