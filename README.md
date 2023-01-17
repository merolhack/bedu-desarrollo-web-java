# bedu-desarrollo-web-java

## Hola Mundo en Java SE 1.8

* Crear directorios del paquete:
```bash
mkdir -p src/org/bedu
```

* Crear y editar archivo Java "HolaMundo.java":
```bash
nano src/org/bedu/HolaMundo.java
```

* Crear directorio donde se generarán las clases:
```bash
mkdir out
```

* Compilar el archivo Java "HolaMundo.java" y generar la clase en el archivo "out/org/bedu/HolaMundo.class":
```bash
javac -d . src/org/bedu/HolaMundo.java -d out
```

* Ejecuta la clase "HolaMundo":
```bash
java -cp out org.bedu.HolaMundo Lenin
```

* Empaquetar proyecto en archivo Jar "HolaMundo.jar":
```bash
jar cvf HolaMundo.jar -C out .
```

* Ejecutar paquete Jar "HolaMundo.jar":
```bash
java -cp HolaMundo.jar org.bedu.HolaMundo Lenin
```

## Tipos de datos en Java SE 1.8

* Crear y editar archivo Java "TiposDeDatos.java":
```bash
nano src/org/bedu/TiposDeDatos.java
```

* Compilar el archivo Java "TiposDeDatos.java" y generar la clase en el archivo "out/org/bedu/TiposDeDatos.class":
```bash
javac -encoding UTF-8 -d . src/org/bedu/TiposDeDatos.java -d out
```

* Ejecuta la clase "TiposDeDatos":
```bash
java -cp out org.bedu.TiposDeDatos
```

## Estructuras de Control en Java SE 1.8

* Crear y editar archivo Java "EstructurasDeControl.java":
```bash
nano src/org/bedu/EstructurasDeControl.java
```

* Compilar el archivo Java "EstructurasDeControl.java" y generar la clase en el archivo "out/org/bedu/EstructurasDeControl.class":
```bash
javac -encoding UTF-8 -d . src/org/bedu/EstructurasDeControl.java -d out
```

* Ejecuta la clase "EstructurasDeControl":
```bash
java -cp out org.bedu.EstructurasDeControl
```

## Leer datos del teclado en Java SE 1.8

* Crear y editar archivo Java "LeerDatos.java":
```bash
nano src/org/bedu/LeerDatos.java
```

* Compilar el archivo Java "LeerDatos.java" y generar la clase en el archivo "out/org/bedu/LeerDatos.class":
```bash
javac -encoding UTF-8 -d . src/org/bedu/LeerDatos.java -d out
```

* Ejecuta la clase "LeerDatos":
```bash
java -cp out org.bedu.LeerDatos
```
