package com.teamprojectback.DTO.Board;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PostBoard_RequestDTO {

    @NotBlank
    private String title;
    private String videoId;
    @NotBlank
    private String text;
    private String date;
//    @NotNull
//    private List<String> boardList;
}
