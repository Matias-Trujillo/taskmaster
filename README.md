# TaskMaster

TaskMaster es una aplicación simple de consola escrita en Java que permite gestionar tareas de forma básica. Fue creada como ejercicio de aprendizaje para comprender el funcionamiento de Maven como herramienta de automatización de construcción de proyectos Java. La aplicación permite agregar tareas, mostrarlas en consola y ejecutar pruebas unitarias básicas.

## 📦 Descripción del Proyecto

Este proyecto fue generado utilizando el arquetipo `maven-archetype-quickstart`, estructurado bajo buenas prácticas con Maven. TaskMaster demuestra cómo configurar y ejecutar un proyecto Java con dependencias externas, plugins de compilación, perfiles de entorno y pruebas automatizadas con JUnit.

## ⚙️ Comandos Usados con Maven

```bash
# Crear el proyecto usando el arquetipo básico de Maven
mvn archetype:generate -DgroupId=com.equipo.taskmaster -DartifactId=taskmaster -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

# Ingresar al directorio del proyecto
cd taskmaster

# Ejecutar pruebas unitarias
mvn test

# Compilar y empaquetar el proyecto
mvn clean package

# Ejecutar la aplicación principal
mvn exec:java

# Ejecutar con un perfil específico y propiedad de sistema
mvn exec:java -Pdev -Denv.name=Dev
```

## 📚 Dependencias y Plugins Utilizados

### Dependencias

```xml
<dependency>
  <groupId>org.apache.commons</groupId>
  <artifactId>commons-lang3</artifactId>
  <version>3.12.0</version>
</dependency>
```

- `commons-lang3`: Librería de Apache que proporciona utilidades adicionales para trabajar con Strings, números y colecciones.

### Plugins

```xml
<!-- Plugin para compilar el proyecto con Java 11 -->
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.8.1</version>
  <configuration>
    <source>11</source>
    <target>11</target>
  </configuration>
</plugin>

<!-- Plugin para ejecutar la clase principal -->
<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>exec-maven-plugin</artifactId>
  <version>3.1.0</version>
  <configuration>
    <mainClass>com.equipo.taskmaster.App</mainClass>
  </configuration>
</plugin>
```

## 🧪 Pruebas

Se utilizó **JUnit 4** para probar el método `addTask`, validando que las tareas se agregan correctamente a la lista.

Archivo de prueba: `AppTest.java`

```java
@Test
public void testAddTask() {
    App.tasks.clear();
    App.addTask("Terminar ejercicio Maven");
    assertEquals(1, App.tasks.size());
}
```

## 🔁 Perfiles de Maven

El proyecto incluye perfiles personalizados para entornos de desarrollo y producción:

```xml
<profiles>
  <profile>
    <id>dev</id>
    <properties>
      <env.name>Desarrollo</env.name>
    </properties>
  </profile>
  <profile>
    <id>prod</id>
    <properties>
      <env.name>Producción</env.name>
    </properties>
  </profile>
</profiles>
```

Esto permite ejecutar la aplicación en diferentes ambientes:

```bash
mvn exec:java -Pdev -Denv.name=Dev
```

## 📘 Mayor Aprendizaje Técnico

El principal aprendizaje fue comprender la estructura de un proyecto Maven, cómo gestionar dependencias externas y plugins, así como el uso de perfiles para personalizar comportamientos según el entorno. También se profundizó en la ejecución de pruebas automáticas y en cómo empaquetar y ejecutar el proyecto de forma automatizada.

## 🧩 Desafío Enfrentado

El mayor desafío fue entender cómo funcionan los **plugins** dentro del `pom.xml`, especialmente al momento de configurar correctamente el `exec-maven-plugin` para ejecutar la clase principal. Además, resultó retador integrar correctamente perfiles de entorno y pasar propiedades desde la línea de comandos sin errores.

## 🚀 Autor

- Equipo de desarrollo: 1 (Marcelo Bravo - Nicolás Gravertt - Cristián Sepulveda - Daniel Jeremías - Matías Trujillo)
- Proyecto de práctica para aprendizaje de Maven
