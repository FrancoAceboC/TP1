# TP1
TP1 LabV: Vikingos y Espartanos

1- Que es Maven?

      Es una herramienta de build, esto es una herramienta que nos permite "buildear" un proyecto.
      "Buildear" implica ejecutar un conjunto de tareas las cuales pueden variar dependiendo de cada proyecto
      
2- POM que significa y para que nos sirve?

      Responde a las siglas Project Object Model, es un fichero xm, que es la "unidad" principal de un proyecto maven.
      Contiene informacion acerca del proyecto, fuentes, test, dependencias, plugins, version ...
      
3- Diferencia entre Archetype y ArtifactId

      Archetype -> es un conjunto de herramientas de plantillas de proyectos de Maven 
      ArtifactId -> se asocia al nombre del proyecto.
      
 4- Explique los siguientes goals de maven; [clean, package, install, compile]
 
    clean   -> limpia todas las clases compiladas del proyecto     
    compile -> compila el proyecto
    package -> empaqueta la aplicacion en un formato destribuible tipo jar, war, etc
    install -> instala el artefacto en el repositorio local 
    
    
 5- Explique los siguientes Scopes; [compile, provide, runtime, test, system]
 
    El scope sirve para indicar el alcance de nuestra dependencia y su transitividad
 
    compile -> es la que tenemos por defecto sino especificamos scope. Indica que la dependencia es necesaria para compilar 
    provide -> como compile pero se espera que el contenedor ya tenga esa libreria
    runtime -> la dependencia es necesaria en tiempo de ejecucion pero no es necesaria para compilar
    test -> solo para testing que es una de las fases de compilacion con maven
    system -> es como provide pero tenes que incluir la dependencia explicitamente. Maven no buscara este artefacto en el repositorio local, habra que especificar 
              la ruta de la dependencia mediante la etiqueta <systemPath>


    
        
