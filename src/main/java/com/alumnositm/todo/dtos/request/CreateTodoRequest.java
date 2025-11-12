package com.alumnositm.todo.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTodoRequest {
    @NotBlank(message = "El titulo no puede estar vacio")
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9\\s\\-_.,!¡]+$", message = "El titulo solo puede contener letras, numeros y espacios")
    private String title;

    @NotBlank(message = "La descripcion no puede estar vacia")
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9\\s\\-_.,!¡]+$", message = "La descripcion solo puede contener letras, numeros, espacios, comas y puntos")
    private String description;
}
