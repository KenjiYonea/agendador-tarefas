package com.javanauta.agendadortarefas.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    //DTO significa Data Transfer Object (Objeto de Transferência de Dados).
    private String email;
    private String senha;
}
