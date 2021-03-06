package com.example.webpoc.domain.cep;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author vinicius lima
 * @version : $<br/>
 */

@Data
@Builder
@AllArgsConstructor
public class CepResponse {

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("localidade")
    private String localidade;

    @JsonProperty("uf")
    private String uf;
}
