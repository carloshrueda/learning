package main

import "fmt"

//Condicionales anidadas con Switch

// Ejemplo:Comprobar si un número es par o no

func main() {
	modulo := 6 % 2
	switch modulo {
	case 0:
		fmt.Println("Es par")
	default:
		fmt.Println("Es impar")
	}

	//Switch sin condicion
	valor := 200
	switch {
	case valor > 100:
		fmt.Println("Es mayor a 100")
	case valor < 0:
		fmt.Println("Es menor a 0")
	default:
		fmt.Println("No cumplió la condición")
	}
}