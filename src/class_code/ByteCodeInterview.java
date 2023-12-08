package src.class_code;

public class ByteCodeInterview {
    public static void main(String[] args) {
        test6();
    }

    static void test1() {
        int i = 6;
        ++i;
        System.out.println(i);
    }

    static void test2() {
        int i = 3;
        i = i++;
        System.out.println(i);//3
    }

    static void test3() {
        int i = 6;
        i *= i++;
        System.out.println(i);//36
    }
    static void test4() {
        int k=10;
        k=k+(k++)+(++k);
        System.out.println(k);//10+10+12=32
    }

    static void test5() {

        Integer i1=128-118;
        Integer i2=9+1;
        System.out.println(i1==i2);//        true
        Integer i3=128;
        Integer i4=128;
        System.out.println(i3==i4);//        false
        Boolean b1=true;
        Boolean b2=true;
        System.out.println(b1==b2);//        true

    }
    static void test6() {
        StringBuilder sb=new StringBuilder();
        String str=new String("123")+new String("45");
        String str1="12345";
        System.out.println(str==str1);//false
    }

    static void test7(){
        Integer a=128;
        int b=128;
        System.out.println(b==a);//true
    }
}
