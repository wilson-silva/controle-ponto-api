package com.dio.live.controlepontoapi.model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {

    @Id
    private Long id;

    @OneToMany
    private NivelAcesso nivelAcesso;


    private String descricao;
}
