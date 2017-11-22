package com.company;

public class Main {

    public static void main(String[] args){

        int length = 7;

        for (int row = 1; row < length; row ++){

            for (int spaces_on_line = length - 1; spaces_on_line >= row; spaces_on_line--)
            {
                System.out.print(" ");
            }

            for (int symbol_on_line = 1; symbol_on_line <= row; symbol_on_line ++)
            {
                System.out.print("#");
            }

            System.out.println();

        }
    }
}



