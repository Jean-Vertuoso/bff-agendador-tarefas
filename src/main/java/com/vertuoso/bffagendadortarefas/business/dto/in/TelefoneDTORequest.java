package com.vertuoso.bffagendadortarefas.business.dto.in;

public class TelefoneDTORequest {

    private String ddd;
    private String numero;

    public TelefoneDTORequest() {
    }

    public TelefoneDTORequest(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
