# SI_2023_lab2_216064
## Мартин Анѓелевски, 216064

### Control Flow Graph
![final_cfg](https://github.com/angjelevski/SI_2023_lab2_216064/assets/69772757/e8d12167-1301-4e1a-823e-3e6f517c3fad)

### Цикломатска комплексност
Цикломатската комплексност на овој граф е 11. Тоа може да се определи со броење на региони во графот. Истото се утврдува и со броење на предикатните јазли. Такви јазли се 10 (P=10; Јазли: 1, 3, 5, 6.2, 7, 9, 12, 14, 15.2, 16), па цикломатската комплексност е P+1, односно 11.

### Every Branch
Every branch критериумот го исполнив користејќи 5 тест случаи:
1. user=null
2. username=null, email="m@m.c", existingEmail && existingUsername, password="abcdefgh"
3. username="abc", email="abc" (не содржи '@' и '.'), password="abc" (должина<8)
4. email="m@m.c", notexistingEmail && notExistingUsername, password="abc abcabc" (содржи празно место)
5. password="!abvabvabva" (содржи специјален карактер)

Креирав excel табела за секое ребро и го исполнив Every branch критериумот

### Multiple Condition
![image](https://github.com/angjelevski/SI_2023_lab2_216064/assets/69772757/11a78256-11dc-44fb-a29a-94eaec1f18c6)

Test cases:
1. user=null (Од јазол 1 се преминува во јазол 2 - се влегува во if-от)
2. user=User("user", null, "user@user.com") (Од јазол 1 се преминува во јазол 2 - се влегува во if-от)
3. user=User("user", "user", null) (Од јазол 1 се преминува во јазол 2 - се влегува во if-от)
4. user=User("user", "user", "user@user.com") (Од јазол 1 се преминува во јазол 3 - не се влегува во if-от)
### Објаснување за unit тестовите
