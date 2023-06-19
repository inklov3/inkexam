package top.inklov3.auth.domain.dto;

import lombok.Data;

@Data
public class UserDto {
    private String password;
    private String identifier;
    private String email;
}
