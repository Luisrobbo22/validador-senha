package br.com.robbo.validadorsenha.service;

import br.com.robbo.validadorsenha.model.Login;
import org.springframework.http.ResponseEntity;

public interface LoginService {

    boolean validarLogin(Login login);
}
