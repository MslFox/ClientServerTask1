# Клиент-серверное взаимодействие. Blocking и Non-Blocking IO.
## Задача 1. Тяжелые вычисления
## Описание
Представьте, что вам требуется провести очень сложные вычисления, которые займут крайне долгое время, 
если выполнять их на вашем компьютере. Допустим, что в некотором университете (МГУ, Оксфорд - кому что больше нравится) имеется суперкомпьютер, 
который мы можем использовать для наших вычислений. Тогда нам остается только передать данные для вычисления на суперкомпьютер (сервер) и дождаться ответа.
#### Задача заключается в том, чтобы сэмулировать подобную ситуацию, применив знания, полученные на лекции.
В качестве вычисления можно взять задачу с вычислением N-го члена ряда Фибоначчи

## Работа программы
- Старт сервера
- Старт клиента. Пользователю предлагается ввести некоторое целое число
- Считывание числа из консоли, передача его серверу
- Сервер рассчитывает N-ное число Фибоначчи и отправляет ответ обратно клиенту
- Клиент должен отобразить рассчитанный сервером ответ

