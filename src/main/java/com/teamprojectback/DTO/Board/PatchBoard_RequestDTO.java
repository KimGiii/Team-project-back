package com.teamprojectback.DTO.Board;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatchBoard_RequestDTO {
    @NotBlank
    private String title;
    @NotBlank
    private String text;
}
