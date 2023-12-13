package com.teamprojectback.Entity;


import com.teamprojectback.DTO.Auth.signUp_DTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user")
@Table(name="user")
public class user_Entity {
    @Id
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String birth;
    private String gender;

    public user_Entity(signUp_DTO dto) {
        this.email = dto.getEmail();
        this.password = dto.getPassword();
        this.name = dto.getName();
        this.phoneNumber = dto.getPhoneNumber();
        this.birth = dto.getBirth();
        this.gender = dto.getGender();
    }
}
