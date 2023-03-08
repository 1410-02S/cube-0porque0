package com.example.project;
import java.util.Scanner;

public class Cube {
    private static boolean proceed = true;

    static String[][] face = {
        {"1","2","3"},
        {"4","5","6"},
        {"7","8","9"}
    };

    static String[][][] cube = {
        {
            {"1b","2b","3b"},
            {"4b","5b","6b"},
            {"7b","8b","9b"}
        },
        {
            {"1r","2r","3r"},
            {"4r","5r","6r"},
            {"7r","8r","9r"}
        },
        {
            {"1o","2o","3o"},
            {"4o","5o","6o"},
            {"7o","8o","9o"}
        },
        {
            {"1g","2g","3g"},
            {"4g","5g","6g"},
            {"7g","8g","9g"}
        },
        {
            {"1y","2y","3y"},
            {"4y","5y","6y"},
            {"7y","8y","9y"}
        },
        {
            {"1w","2w","3w"},
            {"4w","5w","6w"},
            {"7w","8w","9w"}
        },
    };

    static void show(String[][] Face){
        for(String[] i: Face){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    static void move(String[][][] Cube, String input){
        String[][][] tempCube = new String[6][3][3];

        

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                for(int k=0; k<3;k++)
                    tempCube[i][j][k] = Cube[i][j][k];

        
        
        switch(input){
            case "u":
            System.out.println("working");   
                break;
            case "d":
            System.out.println("working"); 
                break;
            case "r":
            System.out.println("working"); 
                break;
            case "l":
            System.out.println("working"); 
                break;
            case "f":
            System.out.println("working"); 
                break;
            case "b":
            System.out.println("working"); 
                break;            
            default:
            System.out.println("working"); 
        }
    }


    static void rotateFace(String[][] Face, boolean clockwise){

        String[][] tempFace = new String[3][3];

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                tempFace[i][j] = Face[i][j];

        if(clockwise){
            //order is Face[y][x] or Face[row][col]

            Face[0][0] = tempFace[0][0];
            Face[1][0] = tempFace[1][0];
            Face[0][1] = tempFace[0][1];
            Face[1][1] = tempFace[1][1];
            Face[2][0] = tempFace[2][0];
            Face[0][2] = tempFace[0][2];
            Face[2][1] = tempFace[2][1];
            Face[1][2] = tempFace[1][2];
            Face[2][2] = tempFace[2][2];
            
        }else{

        }
    }


    public static void main(String[] args){
        rotateFace(face, true);
        show(face);
        System.out.println("Enter a move");
        
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        move(cube, input);
        
        
        
        
        
    }


    
}


