/**
 * Created by ddp on 2017/12/1.
 */
public class Person {
    public void talk(Apple apple){
        System.out.print("讲解员介绍苹果：");
        apple.describle();
    }

    public void talk(Fruit fruit){
        System.out.print("讲解员介绍水果：");
        fruit.describle();
        System.out.println();
    }

    public void talk(Orange orange){
        System.out.print("讲解员介绍橘子：");
        orange.describle();
    }
}
