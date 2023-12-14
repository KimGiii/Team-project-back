package com.teamprojectback.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="board_view")
@Table(name="board_view")
public class boardView_Entity {
    @Id
    public int number;
    private String title;
    private String text;
    private String date;
    private String videoInfo;
}
