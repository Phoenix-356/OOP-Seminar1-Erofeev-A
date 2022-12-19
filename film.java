public class film {
    
    String name;
    String genre;
    String director;
    String leadActor;
    String country;
    int year;

    public void info() {
        System.out.println();
        System.out.printf("Название фильма: %s \n", name);
        System.out.printf("Жанр: %s \n", genre);
        System.out.printf("Режиссёр: %s \n", director);
        System.out.printf("В главных ролях: %s \n", leadActor);
        System.out.printf("Страна-производитель: %s \n", country);
        System.out.printf("Год выпуска: %d \n", year);
    }
            
    public boolean search (Object o) {
        film t = (film) o;
        return name.contains(t.name);
    }
}