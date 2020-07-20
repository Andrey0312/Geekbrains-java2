package homework.lesson1;

public class Race {
    /*
    Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать
    (методы просто выводят информацию о действии в консоль).
Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия
(бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
     */

        public static void main(String[] args) {

            Movable[] participatns = {
                    new Cat("Кот1", 10, 20),
                    new Human("Человек1", 15, 30),
                    new Cat("Кот2", 7, 23),
                    new Human("Человек2", 12, 31),
                    new Cat("Кот3", 5, 24),
                    new Human("Человек3", 11, 35),
            };

            Barrier[] barriers = {
                    new Wall(5),
                    new Track(10),
                    new Wall(10),
                    new Track(20),
                    new Wall(11),
                    new Track(33)
            };

            for(Movable participant : participatns) {
                for (int i = 0; i < barriers.length; i++) {
                    if (barriers[i] instanceof Wall) {
                        participant.jump((Wall)barriers[i]);
                        if (participant.jump((Wall)barriers[i])) {
                            System.out.println(participant + " участник cмог перепрыгнуть");
                        } else {
                            participant.setDroppedOut(true);
                        }
                    } else if (barriers[i] instanceof Track) {
                        if (participant.walk((Track)barriers[i])) {
                            System.out.println(participant + " участник cмог пробежать");
                        }else {
                            break;
                        }
                    } else {
                        if (participant.overcome(barriers[i])) {
                            System.out.println(participant + " участник cмог преодолеть");
                        }else {
                            break;
                        }
                    }
                }
            }


            for (int i = 0; i < barriers.length; i++) {
                for(Movable participant : participatns) {
                    if (participant.isDroppedOut()) {
                        continue;
                    }

                    if (barriers[i] instanceof Wall) {
                        participant.jump((Wall)barriers[i]);
                        if (participant.jump((Wall)barriers[i])) {
                            System.out.println(participant + " участник cмог перепрыгнуть");
                        } else {
                            participant.setDroppedOut(true);
                        }
                    } else if (barriers[i] instanceof Track) {
                        if (participant.walk((Track)barriers[i])) {
                            System.out.println(participant + " участник cмог пробежать");
                        }else {
                            participant.setDroppedOut(true);
                        }
                    } else {
                        if (participant.overcome(barriers[i])) {
                            System.out.println(participant + " участник cмог преодолеть");
                        }else {
                            participant.setDroppedOut(true);
                        }
                    }
                }
            }

        }

}
