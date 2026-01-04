package sampleQuestions2.firstQuestion;

import java.util.*;

public class LibraryCatalog {
    private HashMap<String, String> libraryRecords = new HashMap<>();

    public void addBook(String bookData){
        String bookTitle;
        String genre;
        String parts[] = bookData.split(":");
        bookTitle = parts[0];
        genre = parts[1];
        libraryRecords.put(bookTitle, genre);
    }

    public List<String> getBookByGenre(String genre){
        List<String> listGenre = new ArrayList<>();
        for(Map.Entry<String, String> map : libraryRecords.entrySet()){
            if(map.getValue().equals(genre)){
                listGenre.add(map.getKey());
            }
        }
        return listGenre;

    }
}
