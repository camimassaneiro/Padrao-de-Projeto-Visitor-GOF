# Padrao-de-Projeto-Visitor-GOF

Projeto que permite calcular as taxas dos produtos - Ensinado no canal Derek Banas - https://www.youtube.com/watch?v=pL4mOUDi54o&amp;t=726s

Intenção: representar uma operação a ser executada nos elementos de uma estrutura de objetos. Visitor permite definir uma nova operação sem mudar as classes dos elementos sobre os quais opera.

Aplicabilidade:
	Use o padrão Visitor quando:
	- uma estrutura de objetos contém muitas classes de objetos com interfaces que diferem e você deseja executar operações sobre esses objetos que dependem das suas classes 
concretas;
	- muitas operações distintas e não-relacionadas necessitam ser executadas sobre objetos de uma estrutura de objetos, e você deseja evitar "a poluição" das suas classes com 
essas operações. Visitor lhe permite manter juntas operações relacionadas, definindo-as em única classe. Quando a estrutura do objeto for compartilhada por muitas aplicações,
use Visitor para por operações somente naquelas aplicações que as necessitam;
	- as classes que definem a estrutura do objeto raramente mudam, porém você frequentemente deseja definir novas operações sobre a estrutura. A mudança das classes da estrutura 
do objeto requer a redefinição da interface para todos os visitantes, o que é potencialmente oneroso. Se as classes da estrutura do objeto mudam com frequência, provavelmente é 
melhor definir as operações nessas classes.

#### Estrutura:

![Estrutura Visitor](https://github.com/camimassaneiro/Padrao-de-Projeto-Visitor-GOF/blob/master/Estrutura%20visitor.PNG)

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 
