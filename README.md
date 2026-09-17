# Spring AI Introduction 🤖🌱

Un proyecto introductorio para explorar la integración de Inteligencia Artificial en aplicaciones Spring Boot utilizando **Spring AI** y la API de **OpenRouter**.

En este proyecto, la IA está configurada mediante un *System Prompt* para actuar como un **profesor de informática especializado en Spring Boot**, explicando conceptos técnicos de forma sencilla y siempre en español.

## 🛠️ Tecnologías utilizadas

* **Java 25**
* **Spring Boot 4.1.1**
* **Spring AI (OpenAI Starter)**
* **Maven**
* **OpenRouter** (Modelo: `openrouter/free`)

## ⚙️ Requisitos previos

Para ejecutar este proyecto de forma local, necesitas tener instalado:
* Java Development Kit (JDK) 25.
* Un IDE como IntelliJ IDEA, Eclipse o VS Code.
* Una cuenta en [OpenRouter.ai](https://openrouter.ai/) para obtener una API Key gratuita.

## 🚀 Configuración y Ejecución

El proyecto protege las credenciales utilizando variables de entorno. **No debes escribir tu API Key directamente en el código.**

### 1. Variables de Entorno
Antes de ejecutar la aplicación, configura las siguientes variables de entorno en tu IDE o sistema operativo:

* `OPENROUTER_API_KEY`: Tu clave secreta generada en OpenRouter (ej. `sk-or-v1-...`)
* `OPENROUTER_BASE_URL`: `https://openrouter.ai/api/v1`
* `OPENROUTER_MODEL`: `openrouter/free`

*(En IntelliJ IDEA: Run > Edit Configurations... > Environment Variables).*

### 2. Ejecutar la aplicación
Puedes iniciar la aplicación directamente desde tu IDE ejecutando la clase `SpringAiIntroductionApplication.java`, o usando Maven desde la terminal:

- Ejemplo de url de prueba: curl -X GET "http://localhost:8080/api/ia/preguntar?pregunta=tu%20pregunta"

```bash
./mvnw spring-boot:run