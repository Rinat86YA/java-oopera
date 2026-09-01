import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors() {
        System.out.println();
        System.out.println('"' + title + "\". Список актеров:");
        for (Actor actor : listOfActors) {
            System.out.println("    " + actor);
        }
    }

    public void addActor(Actor newActor) {
        System.out.println("Добавляем актёра:" + newActor + " в \"" + title + '\"');
        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр уже участвует в спектакль");
            return;
        }
        listOfActors.add(newActor);
        System.out.println("Актёр добавлен!");
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        System.out.println("Заменяем актёра " + oldSurname + " на " + newActor + " в \"" + title + '\"');
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor oldActor = listOfActors.get(i);
            if (oldActor.getSurname().equals(oldSurname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актер заменен!");
                return;
            }
        }
        System.out.println("Актёр " + oldSurname + " не участвет в спектакле");
    }
}