package org.codenova.groupware.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
public class AddEmployee {
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @PastOrPresent
    private LocalDate hireDate;

    @NotNull
    private Integer departmentId;

    private String position;
}
