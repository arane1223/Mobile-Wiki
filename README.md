# Проект по автоматизации UI тестирования мобильного приложения Wikipedia
<p align="center"></p><a href="https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest"><img width="30%" title="wikipedia" src="images/Wikipedia-logo.png"></a>

## Структура:

- <a href="#-стек">Стек</a>
- <a href="#-проведенный автотест">Проведенный автотест</a>
- <a href="#-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#-сборка-в-Jenkins">Особенности сборки в Jenkins</a>
- <a href="#-запуск-из-терминала">Запуск из терминала</a>
- <a href="#-allure-отчет">Allure отчет</a>
- <a href="#-видео-пример-прохождения-тестов">Видео пример прохождения тестов</a>

## 🛠️ Стек

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

## ✅ Проведенный автотест

- Успешное прохождение стартовых экранов и проверка компонентов на главном экране
- Успешное открытие статьи
- Успешный поиск по слову «Appium»

## 📋 Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Mobile-HW18/)

<p align="center">
<img title="Jenkins" src="images/screenshots/Jenkins.png">
</p>

### Особенности сборки в Jenkins:
Сборка в Jenkins собрана на прогон тестов через BrowserStack

## ▶️ Запуск из терминала

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

## 📑 Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/Allure.png">
</p>

- ### Страница с проведенным тестом
<p align="center">
<img title="Allure Test Page" src="images/screenshots/Allure-suites.png">
</p>

## 🎦 Видео пример прохождения тестов
<p align="center">
  <img title="Selenoid Video" src="images/video/wikitest.gif" style="width: 300px; height: auto;">
</p>