package org.example.seminar3.hw3.Task3;
import org.example.seminar3.hw3.Task1.Items;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Books book1 = new Books("Война и мир", "Толстой", 2090.23, 1996, 13);
        Books book2 = new Books("Арбузы зло", "Тимофеева", 240.99, 2020, 7);
        Books book3 = new Books("Масло-Это жир...", "Липидова", 1190.99, 2018, 1);
        Books book4 = new Books("Метафизика", "Аристотель", 524.99, -400, 100);
        Books book5 = new Books("Хлеба и зрелищ", "Маркс", 435.99, 1850, 200);
        Books book6 = new Books("Миротворцы", "Казакова", 240.99, 2010, 23);
        Books book7 = new Books("Устрицы противны, но все едят", "Лиз Мира", 190.23, 2023, 100);
        Books book8 = new Books("Африка-страна будующего", "Демидов", 290.99, 2017, 13);

        List<Books> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Books books : booksList) {
            if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }
    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
