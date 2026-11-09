# Ejercicio 1: Persona

## Explicación Lógica
1. **Definición de Atributos:** Se declararon las variables de instancia `nombre` (`String`) y `edad` (`int`).
2. **Instanciación:** Se crearon dos instancias independientes (`persona1` y `persona2`) mediante el operador `new`.
3. **Acceso directo:** Se asignaron e imprimieron valores de las propiedades utilizando el operador punto (`.`).

## Explicación Técnica (Stack vs. Heap)
Al ejecutar `Persona p = new Persona();`:
- **Stack (Pila de llamadas):** Contiene la variable de referencia local `p`. Guarda únicamente la dirección de memoria de 64 bits (puntero) donde reside el objeto real.
- **Heap (Memoria dinámica):** Contiene el objeto de tipo `Persona` propiamente dicho, almacenando los atributos de instancia `nombre` (referencia a String) y `edad` (valor entero primitivo), inicializados por defecto (`null` y `0` respectivamente) antes de la asignación.