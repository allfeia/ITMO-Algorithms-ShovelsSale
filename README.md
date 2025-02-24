### Задача 2: Продажа лопат

В магазине Поликарпа есть n лопат. Причём i-я лопата стоит i бурлей, то есть первая лопата стоит 1 бурль, вторая лопата стоит 2 бурля, третья лопата стоит 3 бурля, и так далее. Поликарп решил продавать лопаты парами.

Покупатели охотнее покупают пару лопат, если их суммарная цена заканчивается на несколько цифр 9. По этой причине Поликарп решил выбрать пару лопат так, чтобы их суммарная цена оканчивалась на наибольшее возможное количество девяток. Например, если он выберет лопаты с ценами 12345 и 37454, то их суммарная цена будет равна 49799. Это число заканчивается на две девятки.

Определите количество пар лопат, суммарная стоимость которых оканчивается на максимальное количество девяток. Две пары лопат считаются различными, если в одной паре есть лопата, которой нет в другой паре.

#### Входные данные
В первой строке следует целое число n (2 ≤ n ≤ 10^9) — количество лопат в магазине Поликарпа.

#### Выходные данные
Выведите количество пар лопат, суммарная стоимость которых оканчивается на максимальное количество девяток.

Обратите внимание, что возможно, что наибольшее число девяток на конце равно 0, тогда все равно нужно посчитать все такие варианты.

Гарантируется, что для любого n ≤ 10^9 ответ не превосходит 2·10^9.

### Примеры
входные данные:
7
выходные данные:
3

входные данные:
14
выходные данные:
9

входные данные:
50
выходные данные:
1
