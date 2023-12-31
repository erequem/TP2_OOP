public class RedheadDuck extends Duck implements Quackable, Flyable {
    private Flyable flyBehavior;
    private Quackable quackBehavior;
    RedheadDuck(Flyable flyBehavior, Quackable quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    public void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }
    public void display(){
        System.out.println("RedheadDuck");
    }
}
