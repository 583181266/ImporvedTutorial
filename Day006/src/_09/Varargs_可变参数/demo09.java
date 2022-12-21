package _09.Varargs_可变参数;
/*
可变参数Varargs
格式：
    修饰符 返回值类型 方法名(数据类型...变量名){
        xxxxxxxx
    }

可变参数好处
    1,参数的数量可以变化
    2,简化代码，避免过多的重载

可变参数注意事项
    1,一个方法中只能有一个可变参数，最多只有一个可变参数
    2,可变参数需要在参数列表的最后面
 */
public class demo09 {
    public static void main(String[] args) {
        //
        ;
        System.out.println(add(1,2,3,4,5,6,7,8,9,10)); //55
    }

    //求任意个数的和
    //可变参数指的是参数的数量可以变化
    public static int add(int... a) {
        //System.out.println("a = " + a); //a = [I@7ef20235

        //定义求和变量
        int sum = 0;
        for (int number : a) {
            sum += number;
        }
        return sum;
    }

    //1,一个方法中只能有一个可变参数，最多只有一个可变参数
    //public static int add(int... a, String... b) {return 0;} //错误，多个可变参数

    //2,可变参数需要在参数列表的最后面
    //public static int add(int... a, String b, char C, ) {return 0;}//错误，可变参数需要在参数列表的最后面
    //                                      正确👇
    public static int add(String b, char C, int... a) {
        return 0;
    }
}
