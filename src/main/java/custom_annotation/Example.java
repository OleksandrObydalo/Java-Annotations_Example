package custom_annotation;

public class Example {
    @MyAnnotation(name = "Great Method", version = 1)
    public static void method(){
        System.out.println("This is method");
    }
}
