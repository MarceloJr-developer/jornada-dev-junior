### 2026-11-24 · Semana 04 · Referências e aliasing
- Conceito: `cards[0] = a1` não copia o objeto, copia o endereço. a1 e cards[0] apontam para o mesmo flashcard.
- Erro que cometi: achei que a1 e a2 não estavam no array e repeti o mesmo bloco de impressão 3 vezes. No exercício da Conta, calculei duas contas (70 e 150) onde só existia uma (120 e 120).
- Como corrigi: rastreei linha por linha os papéis (variáveis) e a casa (objeto), e apaguei os blocos duplicados.
- Analogia: é como apontar o dedo para o LEGO do meu amigo. Toda ordem que eu recebo, executo no LEGO dele, porque sigo o meu dedo.
- Trecho marcante:
  ```java
  cards[0] = a1;   // mesmo objeto, dois nomes
  cards[1] = a2;
  ```
- Commit: https://github.com/MarceloJr-developer/jornada-dev-junior/tree/main/src/semana04/bloco04-objetos
- Potencial de post: 3

### 2026-11-24 · Semana 04 · null em array de objetos
- Conceito: posição vazia num array de objetos guarda null.
- Erro que cometi: propus try/catch para um NullPointerException previsível.
- Como corrigi: checar antes de usar, com o && de curto-circuito (se o lado esquerdo é false, o direito nem é avaliado).
- Trecho marcante:
  ```java
  if (cards[i] != null && cards[i].estaDominado()) {
      contador++;
  }
  ```
- Commit: https://github.com/MarceloJr-developer/jornada-dev-junior/tree/main/src/semana04/bloco04-objetos
- Potencial de post: 2
