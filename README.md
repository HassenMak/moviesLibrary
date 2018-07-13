# Setup Vue.js & Spring Boot

## Project setup

```
spring-boot-vuejs
├─┬ backend     → backend module with Spring Boot code
│ ├── src
│ └── pom.xml
├─┬ frontend    → frontend module with Vue.js code
│ ├── src
│ └── pom.xml
└── pom.xml     → Maven parent pom managing both modules
```

## First App run

```
mvn clean install
```

Run our complete Spring Boot App:

```
mvn --projects backend spring-boot:run
```

Now go to http://localhost:8088/ and have a look at your first Vue.js Spring Boot App.


# frontend

Refers to the readme.md in ```frontend/readme.md```


# backend 

Refers to the readme.md in ```backend/readme.md```


# TroubleShooting 

##xs Problem during ```mvn clean install```

  -> Possible solution: Delete .m2 folder.


