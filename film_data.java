/*
Написать приложение, которое хранит информацию о фильмах и позволяет получaть все детали о них.
Реализовать поиск по части имени фильма.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class film_data {

    public static void main(String[] args) {

        film Snatch = new film();
        Snatch.name = "Snatch";
        Snatch.genre = "Криминал, комедия, боевик";
        Snatch.director = "Гай Ричи";
        Snatch.leadActor = "Джейсон Стэйтем, Стивен Грэм, Брэд Питт, Алан Форд, Робби Ги, Ленни Джеймс";
        Snatch.country = "Великобритания, США";
        Snatch.year = 2000;

        film TheManfromUNCLE = new film();
        TheManfromUNCLE.name = "The Man from U.N.C.L.E.";
        TheManfromUNCLE.genre = "Боевик, комедия, приключения";
        TheManfromUNCLE.director = "Гай Ричи";
        TheManfromUNCLE.leadActor = "Генри Кавилл, Арми Хаммер, Алисия Викандер, Элизабет Дебики, Хью Грант, Джаред Харрис";
        TheManfromUNCLE.country = "США, Великобритания";
        TheManfromUNCLE.year = 2015;
        
        film KingArthur_Legend_of_theSword = new film();
        KingArthur_Legend_of_theSword.name = "King Arthur: Legend of the Sword";
        KingArthur_Legend_of_theSword.genre = "Фэнтези, боевик, драма, приключения";
        KingArthur_Legend_of_theSword.director = "Гай Ричи";
        KingArthur_Legend_of_theSword.leadActor = "Чарли Ханнэм, Астрид Берже-Фрисби, Джуд Лоу, Джимон Хонсу, Эрик Бана, Эйдан Гиллен";
        KingArthur_Legend_of_theSword.country = "Великобритания, США, Австралия";
        KingArthur_Legend_of_theSword.year = 2017;

        film TheGentlemen = new film();
        TheGentlemen.name = "The Gentlemen";
        TheGentlemen.genre = "Криминал, комедия, боевик";
        TheGentlemen.director = "Гай Ричи";
        TheGentlemen.leadActor = "Мэттью МакКонахи, Чарли Ханнэм, Генри Голдинг, Хью Грант, Мишель Докери, Джереми Стронг";
        TheGentlemen.country = "Великобритания, США";
        TheGentlemen.year = 2019;

        film Wrath_of_Man = new film();
        Wrath_of_Man.name = "Wrath of Man";
        Wrath_of_Man.genre = "Боевик, триллер";
        Wrath_of_Man.director = "Гай Ричи";
        Wrath_of_Man.leadActor = "Джейсон Стэйтем, Холт Маккэллани, Джеффри Донован, Джош Хартнетт";
        Wrath_of_Man.country = "Великобритания, США";
        Wrath_of_Man.year = 2021;


        List<film> cinema = new ArrayList<film>(Arrays.asList( Snatch, TheManfromUNCLE,  KingArthur_Legend_of_theSword, TheGentlemen, Wrath_of_Man ));

        film user = new film();
        Scanner in = new Scanner(System.in);
        System.out.println("База данных содержит некоторый перечень фильмов Гая Ричи. Для поиска информации по фильмам введите полное или частичное название фильма на английском: ");
        user.name = in.nextLine();
        in.close();
        System.out.println(user.name);

        for (int i = 0; i < cinema.size(); i++) {
            if (cinema.get(i).search(user)) {
                cinema.get(i).info();
                System.out.println();
            }
        }
    }
}