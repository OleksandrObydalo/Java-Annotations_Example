package parametrized_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@ClassPreamble(
        author = "John Doe",
        date = "3/17/2022",
        currentRevision = 6,
        lastModified = "4/12/2022",
        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class MyClass {
    // ваш код тут
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}

