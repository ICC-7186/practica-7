# Práctica 7: Uso y Propagación de Excepciones. 📌

Nombre: 

NumCuenta: 

En esta práctica se utilizarán y crearan excepciones sencillas.

## Autores 😊
* **Salvador López Mendoza** - *Titular* - [Correo](slm@ciencias.unam.mx)
* **Gerardo Emiliano Figueroa Sandoval** - *Teoría* - [Emiliano-Fs](https://github.com/Emiliano-FS)
* **Ramsés Antonio López Soto** - *Laboratorio* - [ramseslopez](https://github.com/ramseslopez)
  
## Objetivos 🚀

- Comprender la diferencia entre errores y excepciones.
- Crear y utilizar excepciones en situaciones específicas.
- Entender el uso de la sentencia **try-catch-finally** y la propagación de excepciones.
- Utilizar las excepciones para darle más robustez a programas hechos en java.

### Pre-requisitos 📋

- Sistema Operativo Linux (Ubuntu, Debian, Fedora, etc.)
- Git versión 2.43.0
- Java versión 21.0.7
- Perfil de GitHub

### Instalación 🔧

- Git

Para instalar la versión más reciente de Git:

```bash
sudo apt-get install git

```
Una vez finaliado, verifica la versión instalada.

```
git -v
```

- Java
  
Instala Java con el siguiente comando:

```
sudo apt-get install openjdk-21-jre
```

Al finalizar, verifica la versión instalada.

```
java --version
```
y también del compilador:

```
javac --version
``` 

- Maven 

Instala maven con el siguiente comando:

```
sudo apt-get install maven
```

Al finalizar verifica la versión:

```
mvn -v
```


## Recursos 📖

Puedes encontrar más información de los recursos a utilizar en:

- [Clase Exception](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html)
- [Tutorial Exception](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)

## Ejercicio ⌨️

Sigue las instrucciones al pie de la letra:

### Creación de excepciones

Dentro del paquete `exep` debes de crear las siguientes exepciones:

* `TresCrisfrasException`: se lanza si un número tiene más o menos de tres cifras.
* `NumeroNegativoException`: se lanza si un número es negativo.
* `NombreInvalidoException`: se lanza si un nombre no es válido.
* `NumeroInvalidoException`: se lanza si un número no es válido.

### Uso de excepciones

Debes de completar el cuerpo de los siguietnes métodos e indicar en qué momento se lanzan las excepciones antes creadas y algunas ya existentes:

* `generarCURP`: 

Genera la CURP solo si 

   - la cadena debe ser no vacía y no nula,
   - solo contiene un nombre y dos apellidos que empiecen en mayúscula, y su longitud sea mayor a cero y
   - la fecha cumple el formato `aaaa-mm-dd`   

* `verificarArmstrong3`:

Verifica si un número es un _número de armstrong_ solo si 

   - tiene tres dígitos,
   - no es negativo,
   - no es nulo y
   - no es una cadena

* `potencia`:

Calcula la potencia $n^k$ de la sigueinte forma:

  - $(n^k)^{k/2}$ si $k$ es par
  - $n(n^{(k-1)})$ si $k$ es impar

solo si
  
  - el número no es negativo,
  - el número no es nulo y
  - el número es entero.

* `dobleFactorial` (genéricos):

Calcula el factorial de la siguiente forma:
  
  - $f(0) = 1$
  - $f(1) = 1$
  - $f(n) = n * f(n-2)$

solo si

  - n es positivo
  - n es no nulo
  - n es ENTERO

* `verificarFelicidad`:

Verifica si un número es feliz, es decir, si la suma de los cuadrados de sus digitos repetidamente es igual a `1`.

Ejemplo $19 \rightarrow 1^2 + 9^2 = 82 \rightarrow 8^2 + 2^2 = 68 \rightarrow 6^2 + 8^2 = 100 \rightarrow 1^2 + 0^2 + 0^2 = 1$

solo si 

   - n es entero
   - n es no nulo
   - n es positivo

### Pruebas

En esta ocasión, al estar tocando el tema de excepciones, las prubas pueden ser modificadas. Algunas de ellas son incorrectas o están incompletas. Debes de corregirlas y/o completarlas para que se adecúen a tu solución. La única condición es que tengan sentido y no sean triviales.

### Propagación de Excepciones

Debes de completar la clase `Practica7` donde pruebes cada uno de los métodos anteriores con ejemplos no triviales, es decir, no se deben tener casos donde se sabe con exactitud cuando va a fallar y cuando no. También debe haber entrda de usuario con `Scanner`.

Recuerda que debe ser robusto. En ningún momento, el programa debe de terminar de forma inesperada.


Completa la documentación y genera los archivos `html` correspondientes:

```
mvn javadoc:javadoc
```

Una vez terminada la implementación, debes compilarla y ejecutar las pruebas unitarias para verificar que todo lo que hicise es correcto:

```
mvn test
```

Al final, ejecuta el archivo `Practica7.java`:

```
mvn install

java -jar target/Practica7.jar
```

## Intrucciones

* La práctica se entrega de forma individual.
* Debes de clonar el este repositorio con el comando `git clone`, agregar tu nombre en la parte de `Nombre: ` y seguido de tu número de cuenta en `NumCuenta: `.
* El código debe ser legible y el nombre varialbes y métodos debe ser adecuado. Debes de seguir las reglas correspondientes.
* Sube la solución de la práctica antes de las 23:59 del día de mañana con los comandos `git add`, `git commit` y `git push`.
* Una vez en el repositorio, debes de entregar en el Classroom la liga **HTTPS** que direcciona a tu repositorio.
* Ningún tipo de copia y/o plagio será tolerado.

## Licencia 📄

Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](LICENSE.md) para más detalles.