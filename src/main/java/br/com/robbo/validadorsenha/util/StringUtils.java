package br.com.robbo.validadorsenha.util;

import br.com.robbo.validadorsenha.model.Login;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    /**
     * Valida se a senha está no padrão correto
     *
     * @param login
     * @return boolean
     */
    public static boolean validarPatternSenha(Login login) {
        final String senhaPattern = "^(?=(?:[^A-Z]*[A-Z]){1})(?=[^!@#$%^&*()+-]*[!@#$%^&*()+-])(?=(?:[^0-9]*[0-9]){1}).{9,}$";


        final Pattern pattern = Pattern.compile(senhaPattern);

        Matcher matcher = pattern.matcher(login.getSenha());
        matcher.find();

        return matcher.matches();
    }

    /**
     * Valida se a senha contém caractere duplicado
     * @param senha
     * @return
     */
    public static boolean validarCaracterDuplicado(String senha) {
        boolean result = false;
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
        char[] charArray = senha.toLowerCase().toCharArray();
        for (Character ch : charArray) {
            if (baseMap.containsKey(ch)) {
                baseMap.put(ch, baseMap.get(ch) + 1);
            } else {
                baseMap.put(ch, 1);
            }
        }
        Set<Character> keys = baseMap.keySet();
        for (Character ch : keys) {
            if (baseMap.get(ch) > 1) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

}

