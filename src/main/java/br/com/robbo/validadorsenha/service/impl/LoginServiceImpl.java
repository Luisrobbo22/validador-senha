package br.com.robbo.validadorsenha.service.impl;

import br.com.robbo.validadorsenha.model.Login;
import br.com.robbo.validadorsenha.service.LoginService;
import br.com.robbo.validadorsenha.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    public static final Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Override
    public boolean validarLogin(Login login) {
        log.info("[LoginServiceImpl.validarLogin] - Validando login");

        if (login.getSenha().isBlank())
            return false;

        return validarSenha(login);
    }

    private boolean validarSenha(Login login) {
        log.info("[LoginServiceImpl.validarSenha] - Validando senha do login");
        boolean result = false;
        if (login.getSenha().contains(" ")) {
            result = false;
            return result;
        }

        login.setSenha(login.getSenha().trim());
        result = StringUtils.validarCaracterDuplicado(login.getSenha().toLowerCase());
        if (result) {
            result = StringUtils.validarPatternSenha(login);
            log.info("[LoginServiceImpl.validadorsenha] - Senha validada com sucesso");

        } else {
            log.info("[LoginServiceImpl.validadorsenha] - Senha inválida");
        }

        return result;
    }

}
