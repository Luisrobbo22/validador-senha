# Validador de Senha
Projeto para validar senha utilizando como base os seguintes requisitos:
- Nove ou mais caracteres</li>
- Ao menos 1 dígito</li>
- Ao menos 1 letra minúscula</li>
- Ao menos 1 letra maiúscula</li>
- Ao menos 1 caractere especial (!@#$%^&*()-+)</li>


## Sobre o projeto
Validador de Senha é um serviço desenvolvido no backend para avaliação e teste de um processo seletivo.

O Serviço consiste em receber uma String de senha,realizar algumas validações para verificar se o padão dessa senha está correta e em seguida retorna um TRUE caso estiver no padrão esperado e FALSE se não estiver.


## Back-End

- Java
- Spring Boot
- Maven


## Como executar o Projeto
- Pré-requesitos: Java 11

```bach
# Clonar o repositório
git clone https://github.com/Luisrobbo22/validador-senha

# Entrar na pasta do projeto
cd validador-senha

#Executar o projeto pelo terminal
./mvnw spring-boot:run    
    
```


## Formas de testar
A melhor opção para teste do serviço será utilizando ferramentas como o postman ou similares.

Usar o Json abaixo para realizar a requisição no endpoint
http://localhost:8080/validador-senha/login, utilizando Método POST.

OBS: O request deve ser enviado pelo Body.

```json
{
    "senha" : "sua senha aqui" 
}
```




## Autor
Luis Felipe Robbo

https://www.linkedin.com/in/luis-felipe-robbo/
