<div align="justify">


# Ejercicio1 <a name="Ejercicio1"></a>

## Descripción del ejercicio

1. Escribe un programa en Java que imprima el patrón siguiente:

1 

2 3 

4 5 6 

7 8 9 10 

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio1.png"/> 
</div>

## Pseudocódigo

1. Inicio
2. Declaración de Variables:
numero = 1, nPorLinea = 1
3. Para i = 0; i < 4; i+1
4. Para j = 0; j < nPorLinea; j++
5. Imprimir numero y " "
6. numero+1
7. Fin para
8. nPorLinea+1
9. Imprimir salto de linea
10. Fin para
11. Fin

</div>

<div align="justify">


# Ejercicio2 <a name="Ejercicio2"></a>

## Descripción del ejercicio

Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio2.png"/> 
</div>

## Pseudocódigo



</div>

<div align="justify">


# Ejercicio3 <a name="Ejercicio3"></a>

## Descripción del ejercicio

Escribe un programa en Java que encuentre el número de Fibonacci en la posición n. Se debe solicitar el número por teclado.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio3.png"/> 
</div>

## Pseudocódigo


1. Inicio
2. Imprimir "Añada la posicion"
3. Leer pos
4. Declaración de Variables:
fibo1=0, fibo2=1, fibo3=0
5. Para int i = 0; i <= pos - 2; i+1
6. fibo3 = fibo2 + fibo1
7. si fibo1 < fibo2
8. fibo1 = fibo3
9. si no
10. fibo2 = fibo3
11. Fin Si no
12. Fin para
13. Imprimir fibo3
14. Fin


</div>

<div align="justify">


# Ejercicio4 <a name="Ejercicio4"></a>

## Descripción del ejercicio

Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio4.png"/> 
</div>

## Pseudocódigo

1. Inicio
2. Declaración de Variables:
n,resto,resultado=0,contador
3. Leer n
4. contador = n
5. Mientras contador>0
6. resto=contador%10
7. resultado=resultado*10+resto
8. contador=contador/10;
9. Fin mientras
10. Si resultado==n
11. Imprimir n+" es un palindromo"
12. Si no
13. Imprimir n+" no es un palindromo"
14. Fin Si no
15. Fin


</div>

<div align="justify">


# Ejercicio5 <a name="Ejercicio5"></a>

## Descripción del ejercicio

Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio5.png"/> 
</div>

## Pseudocódigo

1. Inicio
2. Imprimir "Añada la posicion"
3. Leer pos
4. Declaración de Variables:
fibo1=0, fibo2=1, fibo3=0
5. Imprimir "pocicion 1 = "+fibo1
6. Para int i = 0; i <= pos - 2; i+1
7. fibo3 = fibo2 + fibo1
8. Imprimir "pocicion " + i + " = " + fibo3
9. Si fibo1 < fibo2
10. fibo1 = fibo3
11. Si no
12. fibo2 = fibo3
13. Fin Si no
14. Fin para
15. Fin


</div>

<div align="justify">


# Ejercicio6 <a name="Ejercicio6"></a>

## Descripción del ejercicio

Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio6.png"/> 
</div>

## Pseudocódigo




</div>

<div align="justify">


# Ejercicio7 <a name="Ejercicio7"></a>

## Descripción del ejercicio

Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.

El día a verificar se debe de pedir por teclado.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio7.png"/> 
</div>

## Pseudocódigo

1. Inicio
2. Imprimir "Añada un numero"
3. Leer dia
4. Dependiendo de dia
    1. Imprimir "Lunes"
    2. Imprimir "martes"
    3. Imprimir "Miercoles"
    4. Imprimir "Jueves"
    5. Imprimir "viernes"
    6. Imprimir "Sabado"
    7. Imprimir "Domingo"
5. Fin Dependiendo de
6. Fin



</div>

<div align="justify">


# Ejercicio8 <a name="Ejercicio8"></a>

## Descripción del ejercicio

Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado. 

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio8.png"/> 
</div>

## Pseudocódigo

1. Inicio 
2. Imprimir "Añada el primer numero de la cadena"
3. Leer primero
4. Imprimir "Añada el ultimo numero de la cadena"
5. Leer ultimo
6. Mientras primero > ultimo
7. Declarar Variables
suma = 0, n = primero
8. Para int i = 1; i < n; i+1
9. Si n % i == 0
10. suma = suma + i
11. Fin si
12. Fin para
13. Si suma == n
14. Imprimir "Perfecto"
15. Si no
16. Imprimir "No es perfecto"
17. fin Si no
18. primero+1
19. Fin mientras
20. Fin

</div>

<div align="justify">


# Ejercicio9 <a name="Ejercicio9"></a>

## Descripción del ejercicio

Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio9.png"/> 
</div>

## Pseudocódigo

1. Inicio
2. Imprimir "Añada el nuemro"
3. Leer tabla
4. Para int i = 0; i <= 10; i+1
5. valor = i * tabla
6. Imprimir i+" * "+tabla+" = "+valor
7. Fin para
8. Fin

</div>

<div align="justify">


# Ejercicio10 <a name="Ejercicio10"></a>

## Descripción del ejercicio

Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.

## Diagrama de flujos

<div align="center">
    <img src="images/Ejercicio10.png"/> 
</div>

## Pseudocódigo

1. Inicio
2. Imprimir "Añada el numero"
3. leer ultimo
4. Declaración de Variables:
contador = 0, suma = 0
5. Hacer
6. contador+1
7. Si contador%2 == 0
8. suma+=contador
9. Fin si
10. Fin Hacer mientras contador!=ultimo
11. Imprimir "la suma es "+suma
12. Fin

</div>