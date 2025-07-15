package default_value_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyAnnotation(name = "someName")
public class TheClass {
    @MyAnnotation(name = "someName", value = "From field")
    public String myField = null;

    @MyAnnotation(name = "someName", value = "From Method")
    public void doSomething() { }


    public static void main(String[] args) {
        try {
            Field field = TheClass.class.getField("myField");
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) annotation;
                    System.out.println("name: " + myAnnotation.name());
                    System.out.println("value: " + myAnnotation.value());
                }
            }
        } catch (NoSuchFieldException e) {
            // Handle exception
        }

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
