package generics.exercise;

public class Demo {
    public static void main(String[] args) {



        Person<Driver> driverPerson = new Person<>(new Driver());
        Person<Teacher> teacherPerson = new Person<>(new Teacher());
//        Person<Car> carPerson = new Person<>(new Car());

        driverPerson.job.drive();
        teacherPerson.job.teach();
//        carPerson.job.run();




    }
}
