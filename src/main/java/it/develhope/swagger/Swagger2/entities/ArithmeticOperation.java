package it.develhope.swagger.Swagger2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ArithmeticOperation {

    private String name;
    private int minNumberOfOperands;
    private String description;
    private String[] properties;

}
