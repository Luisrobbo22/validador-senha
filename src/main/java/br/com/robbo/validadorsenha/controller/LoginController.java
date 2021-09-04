package br.com.robbo.validadorsenha.controller;

import br.com.robbo.validadorsenha.model.Login;
import br.com.robbo.validadorsenha.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(path = "/validador-senha")
public class LoginController {


    @Autowired
    private LoginService loginService;


    @PostMapping(path = "/login" )
    @ResponseBody
    public ResponseEntity<Boolean> login (@RequestBody Login login, Errors errors){
        if(errors.hasErrors()){
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(loginService.validarLogin(login));
    }

}
