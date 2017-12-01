/**
 * Created by ddp on 2017/12/1.
 */
public class Test {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Orange orange = new Orange();
        Person person = new Person();
        person.talk(apple);
        person.talk(orange);
    }
}
