import ProtectTest2.C;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-05
 * Destination:
 */
//轮胎类
class Tire{
    //...
}

//发动机类
class Engine{
    //...
}

//车载系统类
class VehicleSystem{
    //...
}
public class Car {
    private Tire tire;//可以复用轮胎中的属性和方法
    private Engine engine;//可以复用发动机中的属性和方法
    private VehicleSystem vs;////可以复用车载系统中的属性和方法

    //...
}

//奔驰是汽车
class Benz extends Car{
    //将汽车中包含的：轮胎，发动机、车载系统全部继承下来
}