<div align="justify">


# Bucles y Condiciones 2

## Descripción del ejercicio

El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000).

## Diagrama de flujos

<div align="center">
    <img src="images/Bucles y Condiciones 2.png"/> 
</div>

## Pseudocódigo

1. Inicio
2. imprimir "Añada el primer numero de la cadena"
3. Pedir el valor "primero"
4. imprimir "Añada el ultimo numero de la cadena"
5. Pedir el valor "ultimo"
6. mientras (primero > ultimo)
7. declarar int i, int suma = 0, int n, n = primero
8. para (i = 1; i < n; i++)
9. si (n % i == 0)
10. suma = suma + i;
11. fin si
12. fin para
13. si (suma == n)
14. imprimir "Perfecto"
15. sino
16. imprimir "No es perfecto"
17. primero++
18. fin mientras
19. fin

</div>
