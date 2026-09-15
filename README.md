# Padrão Bridge — Sistema de Controle

Este projeto demonstra a aplicação do padrão de projeto estrutural **Bridge** em Java.

## Objetivo

Separar uma abstração de sua implementação, permitindo que ambas possam **evoluir independentemente**.

## Conceitos-Chave para Estudo

**Separação de Responsabilidades:** A abstração e a implementação ficam em hierarquias diferentes.

**Composição:** A abstração mantém uma referência para a implementação, evitando herança excessiva.

**Desacoplamento:** O código cliente trabalha com abstrações, sem depender diretamente das implementações concretas.

**Flexibilidade:** Novas abstrações ou implementações podem ser adicionadas sem modificar as existentes.

**Evita Explosão de Classes:** Reduz a necessidade de criar uma classe para cada combinação possível entre abstração e implementação.
