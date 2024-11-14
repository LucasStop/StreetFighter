# Projeto Street Fighter Simulation

O **Street Fighter Simulation** é um projeto Java de simulação de combates em torneios de artes marciais. Inspirado em mecânicas de combate e classes de personagens populares, ele permite que jogadores escolham entre diferentes tipos de lutadores (como Ninjas e Guerreiros) e utilizem uma variedade de técnicas (ataque, defesa, cura) em um torneio. A aplicação também oferece uma interface visual para escolha e criação de personagens.

## Índice

- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Guia de Instalação e Execução](#guia-de-instalação-e-execução)
- [Exemplo de Uso](#exemplo-de-uso)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Visão Geral

O objetivo do **Street Fighter Simulation** é simular combates em torneios, permitindo ao jogador escolher entre classes de personagens e participar em lutas. As batalhas seguem um sistema de técnicas, onde cada personagem tem habilidades exclusivas de ataque, defesa e cura. Os torneios podem ser realizados tanto em formato individual quanto em equipe.

## Funcionalidades

1. **Escolha de Personagem**: Escolha entre classes de lutadores (Ninja ou Guerreiro), e visualize uma lista de personagens salvos para selecionar rapidamente.
2. **Sistema de Técnicas**: Cada personagem pode usar técnicas como:
   - **Ataque**: Golpes ofensivos que causam dano ao oponente.
   - **Defesa**: Habilidades defensivas para reduzir ou anular danos recebidos.
   - **Cura**: Técnicas de recuperação de vida, aumentando a durabilidade do personagem.
3. **Modos de Torneio**:
   - **Individual**: Personagens competem em batalhas um contra um até restar um vencedor.
   - **Equipe**: Lutas em equipes, onde a estratégia do time e combinação de habilidades são essenciais.
4. **Interface Gráfica**:
   - **Janela de Escolha de Personagem** (`CharacterChooser`): Interface para escolher entre os personagens existentes.
   - **Janela de Criação de Personagem** (`CharacterCreationWindow`): Permite que o jogador crie e personalize um novo personagem.
5. **Gerenciamento de Dados**:
   - **CSVManager**: Permite salvar e carregar dados dos personagens em formato CSV para persistência entre sessões.

## Estrutura do Projeto

### `src/Player`
Classes para definir os diferentes personagens:
- **Player.java**: Classe base para todos os jogadores, contendo métodos comuns.
- **PlayerNinja.java**: Define o comportamento específico de um personagem do tipo Ninja.
- **PlayerWarrior.java**: Define o comportamento específico de um personagem do tipo Guerreiro.

### `src/Technique`
Classes para definir as diferentes técnicas:
- **Technique.java**: Classe base para as técnicas de combate.
- **TechniqueAttack.java**: Representa técnicas ofensivas de ataque.
- **TechniqueDefense.java**: Representa técnicas defensivas.
- **TechniqueHealing.java**: Representa técnicas de cura para recuperação de vida.

### `src/Tournament`
Classes para gerenciar os torneios:
- **Tournament.java**: Lógica central de gerenciamento de torneios.
- **TournamentIndividual.java**: Implementa o modo de torneio individual.
- **TournamentTeam.java**: Implementa o modo de torneio em equipe.
- **TournamentInterface.java**: Interface que define métodos básicos para gerenciamento dos diferentes tipos de torneio.

### `src/Visual`
Classes para a interface gráfica:
- **CharacterChooser.java**: Interface para o jogador selecionar entre os personagens salvos.
- **CharacterCreationWindow.java**: Interface para criação e personalização de um novo personagem.
- **CSVManager.java**: Gerencia a persistência de dados dos personagens em arquivos CSV, permitindo salvar e carregar informações.

### `src/StreetFighter.java`
Ponto de entrada principal do programa que inicia a execução do jogo.

## Guia de Instalação e Execução

Para compilar e executar o projeto, siga os passos abaixo:

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/seu_usuario/StreetFighterSimulation.git
   cd StreetFighterSimulation
   ```

2. **Compile o Projeto**:
   No terminal, compile as classes Java com o comando:
   ```bash
   javac src/**/*.java
   ```

3. **Execute o Projeto**:
   Inicie o jogo com o comando:
   ```bash
   java -cp src StreetFighter
   ```

> **Observação**: Certifique-se de que o Java JDK está instalado e configurado corretamente no seu PATH.

## Exemplo de Uso

Após iniciar o projeto, siga as instruções na interface para criar ou selecionar um personagem, escolher técnicas, e participar de um torneio. Exemplo de passos básicos:

1. Abra a **Janela de Escolha de Personagem** para selecionar entre os personagens salvos.
2. Escolha o tipo de torneio e inicie as batalhas.
3. Utilize diferentes técnicas para derrotar seus oponentes e avançar no torneio.

## Contribuições
