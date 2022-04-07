/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -04-07
 * Destination:
 */
public class Dog {
    public void bark(){
        System.out.println("汪汪");
    }
    public void bark(int num){
        for(int i =0;i<num;i++){
            System.out.println("汪汪");
        }
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("嗅");
    }
    public void bark(){
        System.out.println("嗷呜嗷呜");
    }
}
