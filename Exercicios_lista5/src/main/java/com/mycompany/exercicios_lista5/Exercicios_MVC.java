/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_lista5;


/*
1) O modelo lógico mostra como o sistema funciona (regras de negócio, usuários e transações).
Pode ser visualizado com diagramas, fluxogramas ou modelos ER (entidade-relacionamento).

2) A arquitetura MVC separa o sistema em três partes:
Model (dados), View (tela) e Controller (controle da lógica).

3)Usuário → View → Controller → Model → Banco de Dados

4) Model é a parte que representa os dados e regras de negócio do sistema.

5) View é a interface gráfica, onde o usuário vê e interage com o sistema.

6) Controller é o intermediário entre a View e o Model — ele recebe ações da tela e manda os comandos para o Model.

7) Porque os dados precisam ser guardados mesmo após o sistema ser fechado, para que possam ser usados novamente.

8) Sim. Regras de negócio bem organizadas melhoram a qualidade, pois tornam o sistema mais claro e fácil de manter.

9)
DAO (Data Access Object) separa o acesso ao banco de dados:

View → Controller → DAO → Banco de Dados


Etapas: o Controller chama o DAO → o DAO executa o SQL → retorna o resultado.

10) Hibernate é uma ferramenta Java que faz o mapeamento automático entre classes e tabelas do banco de dados.

11) ORM (Object Relational Mapping) é o processo de ligar objetos Java às tabelas do banco de dados.

12) Persistência é a capacidade de salvar dados de forma permanente, mesmo depois de fechar o sistema.

13) O modelo relacional foi criado por Edgar F. Codd.
Em Java, usamos o JDBC ou Hibernate para aplicar esse conceito.

14) Serve para ligar classes Java com tabelas do banco.
No Java, evoluiu com frameworks como JPA e Hibernate, que automatizam isso.

15) ORM é o processo de converter objetos do Java em registros de banco e vice-versa automaticamente.

16) Uma classe ClienteDao.java faz a conexão e operações (CRUD) no banco para o objeto Cliente.
Esquema:

Controller → ClienteDao → Banco de Dados


17) CRUD significa:
Create (Criar)
Read (Ler)
Update (Atualizar)
Delete (Excluir)

Esquema:

Tela → Controller → DAO → Banco
↑                           ↓
←--------- CRUD -------------


18) Exceções (Exception) servem para tratar erros sem travar o programa.
Estrutura:

try {
   // código que pode dar erro
} catch (Exception e) {
   // tratamento do erro
}


19) A classe é Exception.
Quando usada, o programa detecta o erro e executa o bloco de tratamento sem parar.

20) Sim, podem acontecer a qualquer momento, como erro de entrada, divisão por zero ou falha de conexão.

21) O try/catch tenta executar o código dentro do try e, se der erro, o catch captura e trata o problema.

*/
