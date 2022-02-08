package com.curso.whatsapplist.Model;

public class Usuario {

    private int foto;
    private String nomeUsuario;
    private String mensagem;

    public Usuario(int foto, String nomeUsuario, String mensagem) {
        this.foto = foto;
        this.nomeUsuario = nomeUsuario;
        this.mensagem = mensagem;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
