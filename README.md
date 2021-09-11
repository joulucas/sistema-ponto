Sistema para Registro de Ponto online

Requisitos: ter alguma ide para importar o projeto e ter o git instalado.

Realizar o clone com o comando: "git clone https://github.com/joulucas/sistema-ponto.git"

Importar o projeto como maven na ide.


Executar o projeto atraves da classe "SistemaPontoApplication"

Neste primeiro commit temos uma tabela funcionario que pode ser acessada na url: http://localhost:8080/h2-console

E alguns endPoints disponiveis como o de cadastro(Verbo post) de funcionario atraves da url http://localhost:8080/funcionario com o seguinte modelo de json:
"
{
    "nome": "nome",
    "email": "email@gmail.com",
    "senha": "123",
    "matricula": 123
}
"
outro endpoint é o de consulta na seguinte url (verbo get) http://localhost:8080/funcionario, este busca todos cadastrados, (verbo get) http://localhost:8080/funcionario{id}
este busca por codigo
