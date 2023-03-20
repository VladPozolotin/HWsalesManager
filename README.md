# SalesManager
## Содержание
* [Введение](#введение)
* [Основные функции](#основные-функции)
* [Использование](#использование)
## Введение
**Sales Manager** — продвинутый инструмент для анализа статистики продаж. Написан на языке програмирования _Java_.
## Основные функции
### Хранение данных о продажах
Sales Manager хранит информацию о количестве продаж в массиве данных `sales`:
```java
protected long[] sales;
```
### Анализ статистики продаж
На основе хранящихся в `sales` данных Sales Manager находит максимальное количество продаж:
```java
public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```
Кроме того, с помощью Sales Manager можно расчитать усечённое среднее:
```java
public long truncatedMean() {
        long min = sales[0];
        for (long sale : sales) {
        if (sale < min) {
        min = sale;
        }
        }
        long max = this.max();
        long sum = 0;
        int count = 0;
        long mean = 0;
        for (long sale : sales) {
        if (sale != max && sale != min) {
        sum = sum + sale;
        count++;
        }
        }
        if (count != 0) {
        mean = sum / count;
        }
        return mean;
        }
```
## Использование
1. Создайте новый объект класса `SalesManager` и передайте в него массив с данными о продаже.
```java
SalesManager sales = new SalesManager(new long[]{100, 400, 0, 999, 321});
```
2. Вызовите у созданного объекта метод `max`, который возвращает максимальное количество продаж.
```java
System.out.println(sales.max());
```
2. Вызовите у созданного объекта метод `truncatedMean`, который возвращает усечённое среднее.
```java
System.out.println(truncatedMean.max());
```