# Trabalho Final - Estúdio de Tatuagem

Sistema de gerenciamento de um estúdio de tatuagem, desenvolvido em Java com interface gráfica Swing como trabalho final da disciplina de Programação de Computadores II.

|Grupo Isabela e Leticia|                                                                                                                                           |Integrantes: Isabela do Amaral e Leticia de Ramos Pacheco|                                                                                                         |Tema: Estúdio de Tatuagem|

## Funcionalidades do programa:

O programa é dividido em cinco abas. Na aba **Cliente**, é possível cadastrar, editar e remover clientes, guardando informações como nome, email, telefone e como eles ficaram sabendo do estúdio. Na aba **Agendamento**, o usuário escolhe um dia no calendário, define o horário e seleciona o artista responsável pela sessão. A aba **Orçamento** calcula o valor estimado da tatuagem com base no estilo escolhido (Old School, Realismo, Geométrico ou Minimalista) e no tamanho em centímetros. Já a aba **Portfólio** permite adicionar imagens do trabalho do estúdio direto do computador. Por último, a aba **Lista** exibe todos os agendamentos cadastrados e permite filtrar por artista.

## Instalações necessárias para compilar o programa:

Para rodar o projeto, você vai precisar do **Java JDK 24** ou superior ([baixar aqui](https://www.oracle.com/java/technologies/downloads/)) e do **NetBeans IDE**, preferencialmente na versão 21 ou mais recente ([baixar aqui](https://netbeans.apache.org/front/main/download/)). O Maven já vem embutido no NetBeans, então não é preciso instalar ele separado. Nenhuma biblioteca extra precisa ser baixada manualmente.

## Como baixar o projeto do GitHub:

A forma mais simples é clicar no botão verde **`<> Code`** no topo desta página e escolher **Download ZIP**. Depois é só extrair o arquivo em uma pasta de sua preferência. Se preferir usar o terminal com Git instalado, também dá pra clonar assim:

```bash
git clone https://github.com/leticiapachec0/2026-prog2-trabalho-estudio-de-tatuagem.git
```

## Como abrir e executar no NetBeans:

Abra o NetBeans e vá em **File → Open Project**. Navegue até a pasta onde você extraiu o projeto e selecione ela — o NetBeans vai reconhecer automaticamente que é um projeto Maven. Aguarde o carregamento terminar (tem uma barrinha de progresso no canto inferior direito, espere até ela sumir). Depois é só clicar na seta verde que se encontra na parte superior do NetBeans, porém abaixo do Menu de navegação.

## Estrutura do projeto:

```
src/
└── main/
    ├── java/
    │   └── com/mycompany/estudiodetatuagem/
    │       ├── EstudioDeTatuagem.java      ← ponto de entrada do programa
    │       ├── model/                      ← classes que representam os dados
    │       ├── controller/                 ← classes com as regras do sistema
    │       └── view/                       ← tela principal da interface
    └── resources/                          ← ícones e imagens usados na interface
```

## Dependência utilizada (FlatLaf):

O projeto usa a biblioteca [FlatLaf](https://www.formdev.com/flatlaf/) na versão **3.5.4**, que é responsável pelo visual moderno da interface (tema escuro). Ela é baixada automaticamente pelo Maven e não precisa de nenhuma configuração adicional.

## Tecnologia utilizada:

O projeto foi desenvolvido com **Java 24**, usando **Java Swing** para a interface gráfica e **Apache Maven** para o gerenciamento do projeto, tudo dentro do **NetBeans IDE**.

*Trabalho desenvolvido para a disciplina de Programação de Computadores II — 2026*
