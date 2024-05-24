# Practica Final Selenium 

La idea de este proyecto es que se automatice un flujo completo de pruebas en la página [NopCommerce](https://demo.nopcommerce.com/). Teniendo en cuenta el material que se tiene de historias
de usuario y criterios de aceptación, se debe realizar la automatización de las pruebas. A partir de esta historia de usuario que representa un Feature del software se deben realizar
los escenarios correspondientes con gherkin y usar Page Object Model para la automatización de las pruebas.

Se tendrán en cuenta dar un contexto del la pagina, junto con historias de usuario pasadas
para tener un mejor entendimiento de la página y de las pruebas que se van a realizar. 
Se encuentra en el siguiente link [Historias de Usuario](https://megabarto.notion.site/Pr-ctica-final-SONAR-I-S-C-2023-2-394bd4b7421944f99c0040ced937337f?pvs=4)

---
## Consideraciones

- Para hacer el pull request, pueden iniciar sesión en GitHub con IntelliJ para mayor facilidad.
- Crean una rama con su nombre
- Deben descargar el driver correspondiente a su navegador y sistema operativo.
---
## Tecnologías

- Selenium WebDriver
- JUnit
- Gradle
- Gherkin
- Cucumber
- Page Object Model
---
## Material de apoyo

- [Manual Pull Request](https://drive.google.com/file/d/1OagidqedQAEj3h_LoacEr7wqJLBv7XER/view?usp=sharing)
- [Selenium WebDriver Documentación oficial](https://www.selenium.dev/documentation/en/webdriver/)
- [Selenium WebDriver PDF](https://drive.google.com/file/d/1vXx2OJF-xUjc7_YLAGHXSmEZkAUyExR_/view?usp=sharing)
- [JUnit](https://junit.org/junit5/docs/current/user-guide/)
- [Gradle](https://docs.gradle.org/current/userguide/userguide.html)
- [Page Object Model](https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/)
- [Gherkin](https://cucumber.io/docs/gherkin/reference/)
- [Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/)
- [ChromeDriver](https://googlechromelabs.github.io/chrome-for-testing/known-good-versions-with-downloads.json)
---
## **Historia de Usuario: Compra en nopCommerce Demo Store**

**Título:** Compra de un usuario registrado con dirección

**Actor Principal:** Usuario registrado

**Descripción:** Como usuario registrado con una dirección guardada, quiero comprar un producto en la tienda nopCommerce para tener una experiencia de compra fluida y rápida.

**Precondiciones:**

- El usuario debe estar registrado e iniciar sesión.
- El usuario debe tener una dirección registrada en su cuenta.

**Escenario Principal:**

1. **Inicio de sesión:** El usuario inicia sesión en la tienda.
2. **Navegación:** El usuario navega por las categorías de productos.
3. **Selección de producto:** El usuario selecciona un producto y lo añade al carrito.
4. **Revisión del carrito:** El usuario revisa los productos en el carrito y procede al pago.
5. **Dirección de envío:** La dirección registrada se selecciona automáticamente.
6. **Método de envío:** El usuario selecciona el método de envío preferido.
7. **Método de pago:** El usuario selecciona Pay check Money Order y proporciona los detalles del método de pago.
8. **Confirmación:** El usuario revisa y confirma el pedido.
9. **Pedido completado:** El usuario recibe una confirmación del pedido.
---
## Cosas basicas de Selenium

### Get

Get es un método que se utiliza para navegar a una página web. Get es un método que permite la navegación a una página

```
driver.get("https://www.google.com");
```

### By

By es una clase que se utiliza para localizar elementos en una página web. By es una clase que permite la localización
de elementos en una página web.

```java
By button = By.id("id");
```

### WebElement

WebElement es una interfaz que representa un elemento en una página web. WebElement es una interfaz que permite la
interacción con elementos en una página web.

```
WebElement element = driver.findElement(By.id("id"));
```

Se puede interactuar con los elementos de la siguiente manera:

```
element.click();
element.sendKeys("Texto");
element.getText();
element.clear();
```
---
## Autor

- [Sebastian Agudelo - Co-Lider Sonar I.S.C](https://www.linkedin.com/in/sebastianamo)
