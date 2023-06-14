#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/**
@Author Eduardo José
@Since 24/08/19
@Version 1.0.0
*/

int main(){

// Declaração de variáveis

double n1,n2,valor = 0;



do{

printf("----------------------------------------------\n");
printf("      Calculadora criada por Eduardo Jose \n");
printf("----------------------------------------------\n");

// Usuario escolhe as operações artiméticas que deseja fazer
printf("Selecione uma operacao matematica: \n");
printf("\t1 - Adicao\n");
printf("\t2 - Subtracao\n");
printf("\t3 - Divisao\n");
printf("\t4 - Multiplicacao\n");
printf("\t5 - Potencia\n");
printf("\t6 - Raiz quadrada\n");
printf("\t7 - Raiz cubica\n");
printf("\t8 - Para sair\n");


// Vejo qual operação o usuário irá pedir
printf("Operacao: ");
scanf("%lf", &valor);

// Se o valor dado naõ estiver dentro dos parâmetros do programa, ele irá imitar uma mensagem de erro.
if(valor > 8 || valor <= 0){
    printf("\n");
    printf("Valor nao reconhecido! ");
    break;

}
// Declaração dos valores
if(valor == 8){
    break;
}

else if(valor == 1){
printf("\n");
printf("Diga-me o primeiro valor: ");
scanf("%lf", &n1);
printf("Diga-me o segundo valor: ");
scanf("%lf", &n2);
printf("\n");
printf("%.2lf + %.2lf = { %.2lf } ", n1,n2,n1+n2);
printf("\n");

}
else if(valor == 2){
printf("\n");
printf("Diga-me o primeiro valor: ");
scanf("%lf", &n1);
printf("Diga-me o segundo valor: ");
scanf("%lf", &n2);
printf("\n");
printf("%.2lf - %.2lf = { %.2lf } ", n1,n2,n1-n2);
printf("\n");
    
}
else if(valor == 3){
printf("\n");
printf("Diga-me o primeiro valor: ");
scanf("%lf", &n1);
printf("Diga-me o segundo valor: ");
scanf("%lf", &n2);
printf("\n");
printf("%.2lf / %.2lf = { %.2lf } ", n1,n2,n1/n2);
printf("\n");
    
}
else if(valor == 4){
printf("\n");
printf("Diga-me o primeiro valor: ");
scanf("%lf", &n1);
printf("Diga-me o segundo valor: ");
scanf("%lf", &n2);
printf("\n");
printf("%.2lf * %.2lf = { %.2lf } ", n1,n2,n1*n2);
printf("\n");
    
}
else if(valor == 5){
printf("\n");
printf("Diga-me o primeiro valor: ");
scanf("%lf", &n1);
printf("Diga-me o segundo valor: ");
scanf("%lf", &n2);
printf("\n");
printf("%.2lf elevado %.2lf = { %.2lf } ", n1,n2,pow(n1,n2));
printf("\n");
    
}
else if(valor == 6){
printf("\n");
printf("Diga-me o primeiro valor: ");
scanf("%lf", &n1);
printf("\n");
printf("%.2lf raiz quadrada = { %.2lf } ", n1,sqrt(n1));
printf("\n");
    
}
else if(valor == 7){
printf("\n");
printf("Diga-me o primeiro valor: ");
scanf("%lf", &n1);
printf("\n");
printf("%.2lf raiz cubica = { %.2lf } ", n1,pow(n1,3));
printf("\n");
    
}
printf("\n");
// no fim do loop após o usuário apertar alguma tecla o programa continua o loop.
system("pause");
system("cls");

}

while(valor !=8);
    
system("cls");
printf("\n");
printf("Obrigado por utilizar!");

return 0;



}
