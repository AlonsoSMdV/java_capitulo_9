Conceptos de POO
    Ejercicio 1

    -¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas instancias de esta clase?

        -Atributos: nombre, edad, campeonatosGanados, numeroDeCarrerasOficiales, mediaDePuntosEnTemporada
        -Instancias: fernandoaAlonso, felipeMassa, kimiRaikkonen, SebastianVettel

    Ejercicio 2

    -A continuación tienes una lista en la que están mezcladas varias clases con instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos están escritos en minúscula. Di cuáles son las clases, cuáles las instancias, a qué clase pertenece cada una de estas instancias y cuál es la jerarquía entre las clases: paula, goofy, gardfiel, perro, mineral, caballo, tom, silvestre, pirita, rocinante, milu, snoopy, gato, pluto, animal, javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.

        -Animal
            -Pato
                lucas
            -Perro
                goofy, milu, snoopy, pluto, laika, ayudante_de_santa_claus
            -Caballo
                rocinante, bucefalo, pegaso
            -Gato
                garfield, tom, silvestre
            -Persona
                paula, javier

        -Mineral
            -Cuarzo
            -Pirita
        

    Ejercicio 3

    -¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?

        -Atributos: metrosCuadrados, numeroDeHabitaciones, tieneGaraje, orientacion
        -Subclases: Piso, Adosado, Cortijo

    Ejercicio 4

    -Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5 elementos distintos que intervengan en la liga?

        -Jugador, Partido, Estadio, Equipo, Arbitro

    Ejercicio 5

    -Haz una lista con los atributos que podría tener la clase caballo. A continuación haz una lista con los posibles métodos (acciones asociadas a los caballos).

        -Clase: Caballo
            -Atributos: nombre, raza, color, edad, carrerasGanadas
            -Métodos: cabalga, rumia, relincha, trota

    Ejercicio 6

    -Lista los atributos de la clase Alumno ¿Sería nombre uno de los atributos de la clase? Razona tu respuesta.
        -numExpediente, nombre, fechaNacimiento, curso, direccion, telefono

        -"nombre" es un atributo que guarda el nombre completo con tildes, espacios, mayúsculas y minúsculas, etc. En el programa principal, los objetos de la clase Alumno tendrán nombres como alumno1, alumnoAux, a, pepito... y no pueden tener espacios, tildes, etc.

    Ejercicio 7

    -¿Cuáles serían los atributos de la clase Ventana (de ordenador)? ¿cuáles serían los métodos? Piensa en las propiedades y en el comportamiento de una ventana de cualquier programa.

        -Atributos: esVisible, tieneElFoco, posicion, anchura, altura, colorDeFondo, titulo, esRedimensionable
        -Métodos: maximiza, minimiza, restaura, cierra, redimiensiona, mueve