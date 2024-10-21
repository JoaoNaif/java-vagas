package br.com.joaonaif.gestao_vagas.exceptions;

public class UserAlreadyExist extends RuntimeException{
    public UserAlreadyExist(){
        super("Usuário já existe");
    }
}
