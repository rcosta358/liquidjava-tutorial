package com.tutorial.part2.exercise;;

public class ExampleFileUsage {

    public static void main(String[] args) {
        File file = new File();
        file.open();
        file.read();
        file.close();
        file.read(); // should be an error
    }
}
