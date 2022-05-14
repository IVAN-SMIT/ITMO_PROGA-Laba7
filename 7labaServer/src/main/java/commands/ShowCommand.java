package commands;

import City.*;
import auxiliary.Command;

import java.util.Stack;
import java.util.Iterator;

/**
 * Показывает все существующие элементы коллекции
 */

public class ShowCommand implements Command {
    public String run(String argument, Stack<City> cityCollection) throws Exception {
        if (argument != null) {return("Show не имеет аргументов!"); }

    try {
        Iterator<City> iterator = cityCollection.iterator();
        if (cityCollection.size() == 0 | cityCollection == null) {
            return "В коллекции отсутствуют элементы!\n";
        }

        String result ="";

        while (iterator.hasNext()) {
            result = result + iterator.next().toString() + "\n";
        }
            return result;

         }catch (Exception e){
            System.out.println(e);
             System.out.println("Ошибка!");
        }
        return argument;
    }
}