package com.revature.myproject;

import java.io.File;

public class App {
    public static void main (String args){
        //File filename = new File("National_Pokedex.csv");
        DexRepository dexRepository = new DexRepository("National_Pokedex.csv");
        DexService dexService = new DexService(dexRepository);
        Server server = new Server(dexService);

    }

}
