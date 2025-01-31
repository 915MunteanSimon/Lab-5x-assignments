package com.example.app.dto.model;

import com.example.app.model.Role;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class RoleDTO {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Boolean read_all;
    @Getter
    @Setter
    private Boolean update_all;
    @Getter
    @Setter
    private Boolean delete_all;
    @Getter
    @Setter
    private Boolean read_own;
    @Getter
    @Setter
    private Boolean update_own;
    @Getter
    @Setter
    private Boolean delete_own;
    @Getter
    @Setter
    private Boolean create;

    public static Role toRole(RoleDTO roleDTO) {
        return new Role(
          roleDTO.getName(),
          roleDTO.getRead_all(),
          roleDTO.getUpdate_all(),
          roleDTO.getDelete_all(),
          roleDTO.getRead_own(),
          roleDTO.getUpdate_own(),
          roleDTO.getDelete_own(),
          roleDTO.getCreate()
        );
    }

    public static RoleDTO fromRole(Role role) {
        return new RoleDTO(
                role.getName(),
                role.getRead_all(),
                role.getUpdate_all(),
                role.getDelete_all(),
                role.getRead_own(),
                role.getUpdate_own(),
                role.getDelete_own(),
                role.getCreate()
        );
    }
}
