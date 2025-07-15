package parametrized_annotation;

public class AnnotationReader {
    public static void main(String[] args) {
        Class<MyClass> clazz = MyClass.class;

        if (clazz.isAnnotationPresent(ClassPreamble.class)) {
            ClassPreamble preamble = clazz.getAnnotation(ClassPreamble.class);

            System.out.println("Author: " + preamble.author());
            System.out.println("Date: " + preamble.date());
            System.out.println("Current Revision: " + preamble.currentRevision());
            System.out.println("Last Modified: " + preamble.lastModified());
            System.out.println("Last Modified By: " + preamble.lastModifiedBy());
            System.out.print("Reviewers: ");
            for (String reviewer : preamble.reviewers()) {
                System.out.print(reviewer + " ");
            }
        } else {
            System.out.println("ClassPreamble not present.");
        }
    }
}
