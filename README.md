function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}

1.1 Discutir y concluir:

¿Qué hace el método?
 El método se enfoca en invertir un String y retornar la cadena invertida

¿Cómo lo hace?
Toma la variable "resultado", la cual es una cadena, luego la divide en subcadenas con la función
"cadena.split('')". Después, la cadena es invertida con la función "reverse()". Finalmente las subcadenas
invertidas son unidas con la función "join('')" y se actualiza "resultado" retornando una nueva variable
"cadena"

¿Cómo lo uso?
Se puede utilizar para verificar si una palabra es un palíndromo o no

Dé al menos un ejemplo de su uso (sin codificar nada).