public class RubberDuck extends Duck implements Quackable {
    private Quackable quackBehavior;
    RubberDuck(Quackable quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    public void quack(){
        quackBehavior.quack();
    }
    public void display(){
        System.out.println("RubberDuck");
    }
}
