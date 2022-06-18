package task0902;

public class Solution0902 {
    public static void main(String[] args) {
        method1();
    }
    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(stackTraceElements.length);
        System.out.println(stackTraceElements[0].getMethodName());
        System.out.println(stackTraceElements[1].getMethodName());
        System.out.println(stackTraceElements[2].getMethodName());
        return name;
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(stackTraceElements.length);
        System.out.println(stackTraceElements[0].getMethodName());
        System.out.println(stackTraceElements[1].getMethodName());
        System.out.println(stackTraceElements[2].getMethodName());
        System.out.println(stackTraceElements[3].getMethodName());
        return name;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        //System.out.println(name);
        return name;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        //System.out.println(name);
        return name;
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        //System.out.println(name);
        return name;
    }
}
