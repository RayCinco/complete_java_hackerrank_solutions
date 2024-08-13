package Java37;

import java.util.*;

class Printer {


    public <Gen> void printArray(Gen[] array){
        for(Gen e: array ){
            System.out.println(e);
        }
    }

    }
public class Java37 {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        String[]  strArray ={"Hello","World"};
        Printer printer = new Printer();
        printer.printArray(intArray);
        printer.printArray(strArray);
    }
}
