# tetris

Proyecto presentado como Trabajo Práctico 1 en el Ciclo Lectivo 2023 para la materia Paradigmas y Lenguajes de Programación de la carrera Ingeniería en Sistemas de Información, Universidad de la Cuenca del Plata.

## Requerimientos a cumplir

1. **Creación de Piezas**
    - [x] Deben poder crearse piezas compuestas de 4 "elementos":
        - [x] T.
        - [x] Cuadrado.
        - [x] Palo.
        - [x] L (izquierda y derecha).
        - [x] Perro (izquierda y derecha).

2. **Rotación de Piezas**
    - [x] Las piezas pueden rotar hacia la izquierda o la derecha, "sobre su eje".

3. **Tablero y Movimiento de Piezas**
    - [x] El tablero "board" tiene dimensiones de 10x20 elementos.
    - [x] Las piezas ingresan aleatoriamente en cualquier lugar del primer renglón del tablero.
    - [x] No se permite colocar piezas fuera del tablero.
    - [x] Las piezas descienden a medida que avanza un reloj (tick.java).
    - [x] Solo la pieza actual puede moverse y descender, siempre que quepa en el espacio disponible en el tablero.

4. **Condiciones para perder**
    - [x] Se detiene el movimiento de la pieza actual cuando ya no puede descender o girar.
    - [x] No se pueden ingresar más piezas al tablero cuando no hay líneas disponibles, lo que marca el final del juego.

5. **Tetris y condiciones para ganar**
    - [x] Cuando se completa una línea en el tablero, esta desaparece.
    - [ ] El juego finaliza cuando se completan 5 líneas.
    - [x] El tablero mantiene las mismas casillas durante todo el juego.
  
## UML esperado
![image](https://github.com/StivenAlexis/tetris/assets/68785609/b91a00b5-88d2-4cf7-aadc-d02ebfb3b4a6)


### Consigna completa

[Documento de Google Drive](https://docs.google.com/document/d/1Q8-DyXBk7Z8GW0YhhHe6swtRJrqpNcLw9915FJjFH9Y/)
