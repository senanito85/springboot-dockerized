<img src="icon.png" align="right" />

# Spring Boot with Docker
> Built with Gradle

Simple spring boot web app serving static content
Used Java version: openjdk 15.0.1 2020-10-20
Gradle version: 7.1

## To Build

```
gradle bootJar
````
or
```
./gradlew build
```

## To Containerize & run

```
docker build  -t springio/gs-spring-boot-docker .
docker run -p 8080:8080 springio/gs-spring-boot-docker
```

## Contribute

Contributions are always welcome!
Please read the [contribution guidelines](contributing.md) first.

## License

[![CC0](https://licensebuttons.net/p/zero/1.0/88x31.png)](https://creativecommons.org/publicdomain/zero/1.0/)

To the extent possible under law, [Sanan ibrahimov](https://mts.io) has waived all copyright and related or neighboring rights to this work.