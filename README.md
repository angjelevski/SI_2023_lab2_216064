# SI_2023_lab2_216064
## Мартин Анѓелевски, 216064

### Control Flow Graph
![cfg](final_cfg.png)
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
![mp_table](image.jpg)

Test cases:
1. user=null (Од јазол 1 се преминува во јазол 2 - се влегува во if-от)
2. user=User("user", null, "user@user.com") (Од јазол 1 се преминува во јазол 2 - се влегува во if-от)
3. user=User("user", "user", null) (Од јазол 1 се преминува во јазол 2 - се влегува во if-от)
4. user=User("user", "user", "user@user.com") (Од јазол 1 се преминува во јазол 3 - не се влегува во if-от)

### Објаснување за unit тестовите
Во класата SILab2Test постојат два тестови за методот function() од SILab2 и една листа од корисници. Едниот тест е за Every Branch критериумот, а другиот за Multiple Condition. За Multiple Condition ги искористив тест случаите погоре со користење на assertThrows() и assertDoesNotThrow(). Асертите за Every Branch тестот не ги напишав, но би ги користел тест случаите наведени во Every Branch погоре.
