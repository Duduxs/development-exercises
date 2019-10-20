#include <stdio.h>
#include <locale.h>

char keyboard[BUFSIZ]; // Prótotipo de função para limpeza do buffer.

struct st_filmes{

    int identificador;
    char titulo[40];
    int ano_de_producao;
    char genero[15];
};

void f_cadastrar_filme(){

    int qtd_filmes, i;

    printf("Diga-me quantos filmes você deseja cadastrar na locadora: ");
    scanf("%d",&qtd_filmes);

    struct st_filmes filmes[qtd_filmes];

    printf("\n======Cadastro de filmes=======\n\n");

    for(i = 0 ; i < qtd_filmes ; i++){

        printf("Diga-me o identificador do [%i] filme: ", i+1);
        setbuf(stdin,keyboard);                      // Tirando o lixo da entrada
        scanf("%d", &filmes[i].identificador);

        printf("Diga-me o título do [%i] filme: ", i+1);
        setbuf(stdin,keyboard);
        scanf("%39[^\n]s",filmes[i].titulo);        // Pegando o input da forma correta, sem o \n

        printf("Diga-me o ano de produção do [%i] filme: ", i+1);
        setbuf(stdin,keyboard);
        scanf("%d",&filmes[i].ano_de_producao);

        printf("Diga-me o gênero do [%i] filme: ", i+1);
        setbuf(stdin,keyboard);
        scanf("%14[^\n]s",filmes[i].genero);

        printf("\n\n");

    }
}

int main(){

setlocale(LC_ALL,"Portuguese"); // Permite acentos e outras regras da língua portuguesa em strings.

f_cadastrar_filme();

return 0;
}
