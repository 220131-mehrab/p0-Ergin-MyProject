package com.revature.myproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DexRepository {
    private List<String> pocketMonsters;
    private File file;

    //constructor is a method that has the same name as the class and returns nothing
    //constructors are to build the field
    public DexRepository(String filename){
        this.pocketMonsters = new ArrayList<>();
        this.file = new File(filename);
        load();

    }

    public List<String> getPocketMonsters() {
        return pocketMonsters;
    }

    private void load() {
        try {
            Scanner scanner = new Scanner(this.file);
            scanner.useDelimiter("\n");
            while (scanner.hasNext()){
                this.pocketMonsters.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
