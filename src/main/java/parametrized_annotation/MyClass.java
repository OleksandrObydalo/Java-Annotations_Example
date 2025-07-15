package parametrized_annotation;

@ClassPreamble (
        author = "John Doe",
        date = "3/17/2022",
        currentRevision = 6,
        lastModified = "4/12/2022",
        lastModifiedBy = "Jane Doe",
        reviewers = {"Alice", "Bob", "Cindy"}
)

public class MyClass {
    // class code goes here
}

@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}

