package com.example.YouOnWork.way1;

import com.example.YouOnWork.way1.BookManager;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.setup();
        bookManager.read();
        bookManager.exit();
    }
}
