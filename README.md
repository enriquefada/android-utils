# android-utils

[![](https://jitpack.io/v/enriquefada/android-utils.svg)](https://jitpack.io/#enriquefada/android-utils)

## Integración

En ```build.gradle``` para *proyecto*:
```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

En ```build.gradle``` para *módulo*:
```
dependencies {
	implementation 'com.github.enriquefada:android-utils:v0.0.1'
}
```

------

## Utilidades

```UuidHelper``` - Clase para obtener un UUID de instalación persistente. Ejemplo:

```java
UuidHelper.getInstallUuid(getApplicationContext())
```
