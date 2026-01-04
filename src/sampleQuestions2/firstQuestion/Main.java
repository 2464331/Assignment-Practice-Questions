package sampleQuestions2.firstQuestion;

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        System.out.println("Enter the number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the book details (BookTitle:Genre):");

        String bookData;
        for(int i = 0; i<n; i++){
            bookData = sc.nextLine();
            libraryCatalog.addBook(bookData);
        }

        System.out.println("Enter the genre to retrieve books:");
        String genre = sc.nextLine();
        List<String> results = new ArrayList<>();
        results = libraryCatalog.getBookByGenre(genre);

        for(String result: results){
            System.out.println(result);
        }
        return;
    }
}
