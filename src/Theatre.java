public class Theatre {
    public static void main(String[] args) {
        //создаем людей
        Actor actor1 = new Actor("Тоби", "Магуайр", Gender.MALE, 172);
        Actor actor2 = new Actor("Эндрю", "Гарфилд", Gender.MALE, 179);
        Actor actor3 = new Actor("Том", "Холланд", Gender.MALE, 168);

        Director director1 = new Director("Сэм", "Рэйми", Gender.MALE, 150);
        Director director2 = new Director("Марк", "Уэбб", Gender.MALE, 220);

        Person musicCreator = new Person("Клава", "Кока", Gender.FEMALE);

        Person danceCreator = new Person("Баста", "ноггано", Gender.MALE);

        //создаем шоу
        Show show = new Show("Шоу1", 1000, director1);
        show.addActor(actor1);
        show.addActor(actor2);

        //создаем оперу
        Opera opera = new Opera("Опера1", 2000, director1, musicCreator, "Либретто оперы", 200);
        opera.addActor(actor2);
        opera.addActor(actor3);

        //создаем баллет
        Ballet ballet = new Ballet("Балет1", 2000, director2, musicCreator, "Либретто балета", danceCreator);
        ballet.addActor(actor3);
        ballet.addActor(actor1);

        //печать
        show.printListOfActors();

        opera.printListOfActors();
        opera.printLibrettoText();

        ballet.printListOfActors();
        ballet.printLibrettoText();

        System.out.println();
        ballet.replaceActor(actor2, actor3.getSurname());
        ballet.printListOfActors();

        System.out.println();
        show.replaceActor(actor1, "Иванов");
    }
}