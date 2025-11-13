# Проект по автоматизации UI тестирования мобильного приложения Wikipedia
<p align="center"></p><a href="https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest"><img width="30%" title="wikipedia" src="images/Wikipedia-logo.png"></a>

## :point_up: Структура:

- <a href="#point_up_2-стек">Стек</a>
- <a href="#point_up_2-проведенный автотест">Проведенный автотест</a>
- <a href="#point_up_2-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#point_up_2-сборка-в-Jenkins">Особенности сборки в Jenkins</a>
- <a href="#point_up_2-запуск-из-терминала">Запуск из терминала</a>
- <a href="#point_up_2-allure-отчет">Allure отчет</a>
- <a href="#point_up_2-видео-пример-прохождения-теста">Видео пример прохождения теста</a>

## :point_up_2: Стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Browserstack" src="images/logo/browserstack-icon.svg">
<img width="9%" title="Appium" src="images/logo/appium.png">
</p>

## :point_up_2: Проведенный автотест

- Успешное прохождение стартовых экранов и проверка компонентов на главном экране
- Успешное открытие статьи
- Успешный поиск по слову «Appium»

## :point_up_2: Сборка в Jenkins

- [Сборка в Jenkins](https://jenkins.autotests.cloud/job/Mobile-HW18/)

### Особенности сборки в Jenkins:
Сборка в Jenkins собрана на прогон тестов через BrowserStack

## :point_up_2: Запуск из терминала

- На BrowserStack:

```shell
gradle clean test -DdeviceHost=browserstack
```

- Локального запуск на эмуляторе (Pixel 4):

```shell
gradle clean test -DdeviceHost=emulation
```

- Локального запуск на реальном устройстве (POCO C65):

```shell
gradle clean test -DdeviceHost=real
```