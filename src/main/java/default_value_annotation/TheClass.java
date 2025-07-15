package default_value_annotation;

import java.lang.reflect.Method;

@MyAnnotation(name = "someName")
public class TheClass {
    @MyAnnotation(name = "someName", value = "From Method")
    public void doSomething() { }

    public static void main(String[] args) {
        try {
            Method method = TheClass.class.getMethod("doSomething");
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("name: " + annotation.name());
            System.out.println("value: " + annotation.value());
        } catch (NoSuchMethodException e) {
            // Handle exception
        }
    }
}
