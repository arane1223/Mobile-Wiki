# Мобильная автоматизация, ДЗ к урокам 18 и 19

В проекте реализована возможность запускать тесты на разных стендах (BrowserStack, эмулятор локальный, реальное устройство локальное) с использованием параметра командной строки:

## Команды для запуска

- На BrowserStack:

```shell
gradle clean test -DdeviceHost=browserstack
```

- Локального запуск на эмуляторе:

```shell
gradle clean test -DdeviceHost=emulation
```

- Локального запуск на реальном устройстве:

```shell
gradle clean test -DdeviceHost=real
```