# OPERADORES LÓGICOS

Son aquellos que retorna TRUE o FALSE si cumplen o no una condición utilizando puertas lógicas.

### Operador AND:
Este operador indica que todas las condiciones declaradas deben cumplirse para poderse marcar como TRUE. En Go, se utiliza este símbolo **&&**.

**Ejemplo1**: 1>0 **&&** 2 >0 Esto retornará TRUE porque tanto la primera como la segunda condición son verdaderas.

**Ejemplo2**: 2<0 **&&** 1 > 0 Esto retornará FALSE porque una de las condiciones no es verdadera.

### Operador OR:
Este operador indica que al menos una de las condiciones debe cumplirse para marcarse como TRUE. En Go, se representa con el símbolo **||**.

**Ejemplo**: 2<0 **||** 1 > 0 Esto retornará TRUE porque la segunda condición se cumple, a pesar que la primera no.

### Operador NOT:
Este operador (**!**) retornará el opuesto al boleano que está dentro de la variable. Ejemplo:

```go
myBool :=  true
fmt.Println(!myBool) // Esto retornará false
```
