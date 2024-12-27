package main

// Condicional sencillo

import (
	"fmt"
	"log"
	"strconv"
)

func main() {
	valor1 := 1
	//valor2 := 2

	if valor1 == 1 {
		fmt.Println("Es 1")
	} else {
		fmt.Println("No es 1")
	}

	// Atoi : conviete un texto a un numero
	valor, err := strconv.Atoi("25")
	if err != nil {
		//Si sucede un error se imprime un log
		log.Fatal(err)
	}
	fmt.Println("Valor", valor)
}