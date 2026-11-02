package chapter4; 

// 父类 Animal
class Animal{
    public void shout(){
        System.out.println("动物发出叫声");
    }
}

// 子类 Pig
class Pig extends Animal{
    @Override
    public void shout() {
        System.out.println("哼哼哼");
    }
}

// 子类 Sheep
class Sheep extends Animal{
    @Override
    public void shout() {
        System.out.println("咩咩咩");
    }
}

// 测试主类
public class Test2 {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.shout();

        Sheep sheep = new Sheep();
        sheep.shout();
    }
}
