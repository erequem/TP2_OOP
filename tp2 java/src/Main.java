
public class Main {
    public static void main(String[] args) {
        CustomStack s = new CustomStack(5);
        s.AddElement(1);
        s.AddElement(2);
        s.AddElement(3);
        s.AddElement(4);
        s.AddElement(5);
        s.AddElement(6);
        System.out.println(s.TopElement());
        s.RemoveElement();
        System.out.println(s.IsEmpty());
        System.out.println(s.IsFull());

    }
}