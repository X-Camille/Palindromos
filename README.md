function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}

1.1 Discutir y concluir:

¿Qué hace el método?

¿Cómo lo hace?

¿Cómo lo uso?

Dé al menos un ejemplo de su uso (sin codificar nada).


1) El método comprueba si la palabra que se entrega es un palíndromo o no, es decir, si la palabra se lee igual al derecho que al revés o no. 
2) El método recibe por parámetro una cadena de caracteres, se declara una variable llamada resultado que inicialmente es una string vacía, después la cadena se da vuelta almacenandose en resultado, y se compara con la original. 
3) Se usa llamando a la función y dandole su parámetro correspondiente, que en este caso es una cadena de texto. 
4) Se le da una palabra llamada oso, y la función debería entregar un booleano que diga si la palabra oso es palíndromo o no.