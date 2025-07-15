package validation_anotations;

import jakarta.validation.constraints.Size;
import org.jetbrains.annotations.*;


public class Car {
    @NotNull
    @Size(min = 2, max = 14)
    private String licensePlate;

    // getters and setters ...
}
