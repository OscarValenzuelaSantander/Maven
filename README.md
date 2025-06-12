¿Qué aprendiste sobre el ciclo de vida de Maven?
Aprendí que Maven tiene un ciclo de vida estructurado y predecible, con fases clave como validate, compile, test, package, verify, install y deploy. Esto permite que los procesos de construcción, prueba y despliegue se realicen de forma coherente en cualquier entorno, facilitando la automatización.

¿Cómo facilita Maven el trabajo en equipo y la reproducibilidad?
Maven facilita la colaboración porque estandariza el proyecto: todos los desarrolladores usan la misma estructura, comandos y versiones de dependencias definidas en el pom.xml. Esto asegura que el proyecto se construya de la misma forma en cualquier equipo, mejorando la reproducibilidad y evitando errores por configuraciones locales distintas.

¿Cuál fue el mayor reto al trabajar con dependencias?
El mayor reto fue resolver conflictos entre versiones de librerías, especialmente cuando se mezclan dependencias antiguas (como JUnit 3) con otras modernas (JUnit 4 o 5). También entender cómo Maven descarga y gestiona el árbol de dependencias transitivas me tomó algo de tiempo.

¿Por qué crees que Maven es tan usado en entornos empresariales?
Porque proporciona una forma confiable, estandarizada y automatizada de gestionar todo el ciclo de vida del software. Su integración con repositorios, plugins y perfiles de configuración lo convierte en una herramienta muy potente para entornos complejos donde la calidad, repetibilidad y trazabilidad son fundamentales.

¿Qué harías diferente si tuvieras que automatizar otro proyecto?
Empezaría definiendo bien los perfiles (dev, prod, test), automatizaría las pruebas unitarias desde el inicio y configuraría herramientas de integración continua desde el primer commit. También documentaría claramente las versiones de las dependencias y establecería convenciones de desarrollo comunes en el equipo.

Descripción del proyecto: ejercicio práctico emulando ser parte del equipo de desarroll de "TaskMaster", una herramienta simple que gestiona tareas desde consola, donde se usará Maven para automatizar el ciclo de construcción del proyecto.

Comandos usados con Maven:
Archetype:generate -DgroupId=com.equipo.taskmaster -DartifactId=taskmaster
DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false: Sirve para crear el proyecto con
todas sus dependencias.
Test: ejecuta las pruebas unitarias y de integración definidas en el proyecto.
Clean package: Elimina todos los archivos generados en compilaciones anteriores.
Exec:java: Este comando ejecuta la aplicación Java configurada en el plugin
Dependencias y plugins utilizados:
Dependencias usadas:
1. Junit: Es una biblioteca para realizar pruebas unitarias en Java.
2. Org.apache.commons: Es un grupo de bibliotecas que proporcionan utilidades adicionales para tareas comunes en Java, como manipulación de cadenas, colecciones, archivos, etc.
