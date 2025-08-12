public class backspace_demo {
    public static void main(String[] args) {
        // 演示 \b 的基本用法
        System.out.println("Hello\bWorld");  // 输出: HellWorld
        System.out.println("ABC\b\bD");      // 输出: AD
        System.out.println("Test\b\b\b\bNew"); // 输出: Newt
        
        // 演示 \b 与字符串长度的关系
        System.out.println("Java\b\b\b\bScript"); // 输出: Script
        System.out.println("12345\b\bXX");       // 输出: 123XX
    }

    public static class literal{
        public static void main(String[] args){
            System.out.println("start output literal:");
            printliteral();

        }
        public static void printliteral(){
            int a=10;
            double b=10.0;
            long c=10000000000L;
            float d=10.0f;
            char e='A';
            boolean f=true;
            String g="Hello, World!";
            System.out.println("int: " + a);
            System.out.println("double: " + b);
            System.out.println("long: " + c);
            System.out.println("float: " + d);
            System.out.println("char: " + e);
            System.out.println("boolean: " + f);
            System.out.println("String: " + g);
            System.out.println("end output literal:");
            System.out.println("c\ba");
        }
    }
}