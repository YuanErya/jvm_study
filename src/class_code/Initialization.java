package src.class_code;

public class Initialization {
    public static void main(String[] args) {

    }
    public int num=1;//场景1：对于非静态的字段，不管是否进行了显式赋值，都不会生成<clinit>()方法
    public static int num1;//场景2：静态的字段，没有显式的赋值，不会生成<clinit>()方法
    public static final int num2=1;//场景3：比如对于声明为static final的基本数据类型的字段，不管是否进行了显式赋值，都不会生成<clinit>()方法
}
