# Lógica de programação - Nélio Alves

* * *

Este repositório foi feito apenas para agregar a parte em Java do curso de [Algoritmos e Lógica de Programação 2022 - O Curso COMPLETO](https://www.udemy.com/course/curso-algoritmos-logica-de-programacao/) do mestre
 [Nélio Alves](https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br) na Udemy.

## Primeiro programa em Java

| Java ☕|
|:---:|

``` Java
public class Main {

  public static void main(String[] args) {

    System.out.println("Ola mundo!");

  }
}
```

### Tipos de dados e variáveis em Java ☕

| Significado | Tipo | Valor padrão| Observação |
|:---:|:---:|:---:|:---:|
| número inteiro | inteiro | int | não atribuido | int: -2147483648 a 2147483647long −9223372036854775807 a 9223372036854775807 |
| número de ponto flutuante | real | double | não atribuido | float: precisão simples double: precisão dupla |
| um único caractere | caractere | char | não atribuido | Valores literais devem ter aspas simples. Exemplo: 'F' |
| texto | caractere | String | não atribuído | Valores literais devem ter aspas duplas. Exemplo: "Maria" |
| valor lógico | logico | boolean | não atribuído | Valores possíveis: false / true |

### Exemplo: declaração e atribuição de variáveis

| Java ☕|
|:---:|

``` Java
import java.util.Locale;

public class Main {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    int idade;
    double salario, altura;
    char genero;
    String nome;

    idade = 20;
    salario = 5800.5;
    altura = 1.63;
    genero = 'F';
    nome = "Maria Silva";

    System.out.println("IDADE = " + idade);
    System.out.println("SALARIO = " + String.format("%.2f", salario));
    System.out.println("ALTURA = " + String.format("%.2f", altura));
    System.out.println("GENERO = " + genero);
    System.out.println("NOME = " + nome);

  }
}
```

### OPERADORES EM Java ☕

Operadores aritiméticos

|Operador | Significado |
|:---:|:---:|
| + | adição|
| - | subtração |
| * | multiplicação |
|/ | divisão |
| % | resto da divisão ("mod") |

### Operadores comparativos

|Operador | Significado |
|:---:|:---:|
| < | menor |
| > | maior |
| <= | menor ou igual |
| >= | maior ou igual |
| == | igual |
| != | diferente |

### Operadores lógicos

| Operador | Significado |
|:---:|:---:|
| && | e |
| &#124;&#124; | ou |
| ! | não |

### SAÍDA DE DADOS EM Java

| Comando no VisualG | Comando Java | Biblioteca |
|:------------:|:------------:|:------------:|
| escreva / escreval | System.out.print / System.out.println | - |

| Observação | Biblioteca |
|:------------:|:------------:|
| Nota: para imprimir "." ao invés de "," como separador de decimais: Locale.setDefault(Locale.US); | import java.util.Locale; |
| Para formatar número de ponto flutuante, use a função: String.format(placeholder, expressão) | - |

### Exemplo

``` Java
System.out.print("Bom dia");
System.out.print("Boa noite");

Saída:
Bom diaBoa noite
```

``` Java
System.out.println("Bom dia");
System.out.println("Boa noite");

Saída:
Bom dia
Boa noite
```

``` Java
int x, y;
x = 10;
y = 20;

System.out.println(x);
System.out.println(y);

Saída:
10
20
```

``` Java
double x;
x = 2.3456;

System.out.println(String.format("%.2f", x));

Saída:
2.35
```

``` Java
int idade;
double salario;
String nome;
char sexo;

idade = 32;
salario = 4560.9;
nome = "Maria Silva";
sexo = 'F';
System.out.println("A funcionaria " + nome + ", sexo " + sexo + 
", ganha " + String.format("%.2f", salario) + " e tem " + idade + " anos");

Saída:
A funcionaria Maria Silva, sexo
F, ganha 4560.90 e tem 32 anos
```

### PROCESSAMENTO DE DADOS / CASTING

``` Java
int x, y;
x = 5;
y = 2 * x;

System.out.println(x);
System.out.println(y);

Saída: 
5
10
```

``` Java
int x;
double y;
x = 5;
y = 2 * x;

System.out.println(x);
System.out.println(String.format("%.1f", y));

Saída: 5
10.0
```

``` Java
double b1, b2, h, area;
b1 = 6.0;
b2 = 8.0;
h = 5.0;
area = (b1 + b2) / 2.0 * h;

System.out.println(area);

Saída: 
35.0
```

``` Java
int a, b, resultado;
a = 5;
b = 2;
resultado = a / b;

System.out.println(resultado);

Saída: 
2
```

``` Java
double a;
int b;
a = 5.0;
b = (int) a;

System.out.println(b);

Saída:
5
```

### ENTRADA DE DADOS

``` Java
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
double y = sc.nextDouble();
char z = sc.next().charAt(0);
String s = sc.nextLine();

sc.close();
```

### Comando para limpeza de buffer

``` Java
sc.nextLine();
```

**QUANDO USAR:** quando você for ler um texto até a quebra de linha (nextLine), mas antes o seu programa já leu algum outro dado e
deixou uma quebra de linha pendente. Por exemplo:

``` Java
System.out.print("Digite sua idade: ");
idade = sc.nextInt();
System.out.print("Digite seu nome completo: ");
sc.nextLine(); // ------------- limpeza de buffer
nome = sc.nextLine();
```

### Código Exemplo

``` Java
import java.util.Locale;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

  Locale.setDefault(Locale.US);
  Scanner sc = new Scanner(System.in);

  double salario1, salario2;
  String nome1, nome2;
  int idade;
  char sexo;

  System.out.print("Nome da primeira pessoa: ");
  nome1 = sc.nextLine();
  System.out.print("Salario da primeira pessoa: ");
  salario1 = sc.nextDouble();

  System.out.print("Nome da segunda pessoa: ");
  sc.nextLine(); // ------------- limpeza de buffer
  nome2 = sc.nextLine();
  System.out.print("Salario da segunda pessoa: ");
  salario2 = sc.nextDouble();
  
  System.out.print("Digite uma idade: ");
  idade = sc.nextInt();
  System.out.print("Digite um sexo (F/M): ");
  sexo = sc.next().charAt(0);

  System.out.println("Nome 1: " + nome1);
  System.out.println("Salario 1: " + String.format("%.2f", salario1));
  System.out.println("Nome 2: " + nome2);
  System.out.println("Salario 2: " + String.format("%.2f", salario2));
  System.out.println("Idade: " + idade);
  System.out.println("Sexo: " + sexo);

  sc.close();

  }
}
```

### COMO EXECUTAR O DEBUGGER NO ECLIPSE

COMANDOS DO DEBUGGER:

- Habilitar/desabilitar breakpoint: CTRL + SHIFT + B
- Iniciar o debug: Botão direito no programa -> Debug As -> Java Application
- Rodar um passo: F6
- Parar o debug: CTRL + F2
- Mostrar variáveis: (veja aba "Variables")

### ESTRUTURA CONDICIONAL EM Java ☕

As estruturas condicionais em Java estão divididas em três partes, sendo elas simples, composta e encadeada, exemplo da estrutura logo abaixo:

Simples:

``` Java
if (condição) {
  comando1
  comando2
}
```

Composta:

``` Java
if (condição) {
  comando1
  comando2
} else {
  comando3
  comando4
}
```

Encadeada:

``` Java
if (condição) {
  comando1
  comando2
} else if {
  comando3
  comando4
} else {
  comando5
  comando6
}
```

### Exemplo de código

``` Java
import java.util.Scanner;

  public class Main {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int hora;
      System.out.print("Digite uma hora do dia: ");
      hora = sc.nextInt();

      if (hora < 12) {
        System.out.println("Bom dia!");
      }
      else {
        System.out.println("Boa tarde!");
      }
      sc.close();

    }
  }

```

### ESTRUTURA ENQUANTO EM Java ☕

Sintaxe:

``` Java
while (condição) {
  comando1
  comando2
}
```

Regra:

- True: Executa e volta
- False: Pula fora

### Exemplo de código

``` Java
import java.util.Scanner;

  public class Main {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int x, soma;
      soma = 0;

      System.out.print("Digite o primeiro numero: ");
      x = sc.nextInt();

      while (x != 0) {
        soma = soma + x;
        System.out.print("Digite outro numero: ");
        x = sc.nextInt();
      }
      System.out.println("SOMA = " + soma);

      sc.close();
      
    }
}
```
