/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:Gremmie
 * Date: -03-17
 * Destination:这是一个掷色子的程序
 */
public class Die {
    private final int MAX = 6;
//  定义一个最大值
    private int faceValue;
//  显示在Die上的现在的值
//  这里要注意，我们并没有对faceValue进行初始化赋值。
    public Die(){
        faceValue = 1;
    }
//  显示一个在模具上的新的面值，并返回结果
//  这里就是我们提到的构造函数，作用是讲骰子的初始点值设置为1
    public int roll(){
        faceValue = (int)(Math.random()*MAX)+1;
//  这里就是随机一个【1，6】的数字，我们也可以用Random类来实现
        return faceValue;
    }
//  这里我们就是重置色子的面值
//  The face value is not modified if the specified value is not valid
//  如果指定的值无效，则不会修改面值
    public void setFaceValue(int value)
    {
        if(value > 0 &&value <= MAX){
            faceValue = value;
        }
//  这里的作用是讲骰子的点值设置为指定值
    }
    public int getFaceValue(){
        return faceValue;
//  返回当前骰子面值
    }
    public String toString(){
        String result = Integer.toString(faceValue);
//  将骰子的值转化成字符串返回
        return result;
    }
}
