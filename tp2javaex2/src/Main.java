public class Main {
    public static void main(String[] args) {
        Fly1 fb1 = new Fly1();
        Fly2 fb2 = new Fly2();
        Fly3 fb3 = new Fly3();
        Quack1 q1 = new Quack1();
        Quack2 q2 = new Quack2();
        Quack3 q3 = new Quack3();
        MallardDuck mallardDuck = new MallardDuck(fb1,q1);
        RedheadDuck redheadDuck = new RedheadDuck(fb2,q3);
        RubberDuck rubberDuck = new RubberDuck(q2);
        DecoyDuck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();

        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();

        decoyDuck.display();
        decoyDuck.swim();
    }
}