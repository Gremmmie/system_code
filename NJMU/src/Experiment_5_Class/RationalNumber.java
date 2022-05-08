package Experiment_5_Class;

/**
 * @author Gremmie102
 * @date 2022/5/8 9:52
 * @purpose :
 */
/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User: 葛玉礼
 * Date: 2022-03-19
 * Destination:有理数之间的运算
 */
public class RationalNumber {
    private int numerator;//分子
    private int denominator;//分母
    public RationalNumber(int numer, int denom){
        if(denom == 0){
            denom = 1;
        }
        if(denom < 0){
            numer = numer * -1;
            denom = denom * -1;
        }
        numerator = numer;
        denominator = denom;
        reduce();//这个方法后面会写到
    }
    //    构建函数，用来初始化
    public int getNumerator(){
        return numerator;
//    返回分子
    }
    public  int getDenominator(){
        return  denominator;
//    返回分母
    }
    public RationalNumber reciprocal(){
        return new RationalNumber(denominator,numerator);
//    这里返回值类型为本RationalNumber类返回值类型，分子分母位置调换，所以方法作用为返回倒数
    }
    public RationalNumber add(RationalNumber op2){
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;
        return new RationalNumber(sum,commonDenominator);
//    和作为分子，分母之积作为分母
    }
    public RationalNumber subtract(RationalNumber op2){
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;
        return new RationalNumber(difference,commonDenominator);
    }
    //    以上为有理数的减法运算
    public RationalNumber multiply(RationalNumber op2){
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();
        return new RationalNumber(numer,denom);
    }
    //    以上为有理数的乘法运算
    public RationalNumber divide (RationalNumber op2){
        return multiply(op2.reciprocal());
//     有理数的除法，除一个数则是乘这个数的倒数
    }
    public boolean isLike(RationalNumber op2){
        return (numerator == op2.getNumerator()&&denominator == op2.getDenominator());
    }
    //    确定此有理数是否等于作为参数传递的有理数，假设在两者都被化简过的情况下
    public String toString (){
        String result;
        if (numerator == 0){
            result = "0";
        }else if(denominator == 1){
            result = numerator +"";
        }else {
            result = numerator + "/" + denominator;
        }
        return result;
//     将有理数转化为字符串
    }
    private void reduce(){
        if(numerator != 0){
            int common = gcd(Math.abs(numerator),denominator);
            numerator = numerator / common;
            denominator = denominator / common;
        }
    }
    //    重要的动作：化简，这里的gcd为返回最大公因数
    private int gcd(int num1, int num2){
        while (num1 != num2){
            if(num1>num2){
                num1 = num1 - num2;
            }else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
}
