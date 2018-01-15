package com.quiz.udacity;

/**
 * Created by Ahmed Magdy on 1/15/2018.
 */

public class Questions {
    public String mQuestions []={
            "What is the range of short data type in Java?",
            "Which data type value is returned by all transcendental math functions?",
            "What would be the behaviour if this() and super() used in a method?",
            "What would be behaviour if constructor has a return type?",
            "First generation of computer was based on",
            "Second generation computers are made of",
            "Which of the following memory is non-volatile",
            "GUI stands for",
            "Time during which a job is processed by the computer is",
            "Circuit  used as a 'Memory device' in computers"
    };
    private String mChoices[][]={
            {"-128 to 127","-32768 to 32767","-2147483648 to 2147483647","None of the mentioned"},
            {"int","float","double","long"},
            {"Runtime error","Throws exception","Compile time error","Runs successfully"},
            {"Compilation error","Runtime error","Compilation and runs successfully","Only String return type is allowed"},
            {"Transistor","LSI","VLSI","Vaccum Tube"},
            {"Vaccum Tubes","Transistors","LSI","VLSI"},
            {"SRAM","DRAM","ROM","All of the above"},
            {"Graph Use Interface","Graphical User Interface","Graphical Unique Interface","None of these"},
            {"Execution Time","Delay Time","Real Time","Waiting Time"},
            {"Rectifier","Flip Flop","Comparator","Attenuator"}
    };
    private String mCorrectAnswer []={
            "-32768 to 32767",
            "double",
            "Compile time error",
            "Compilation error",
            "Vaccum Tube",
            "Transistors",
            "ROM",
            "Graphical User Interface",
            "Waiting Time",
            "Flip Flop"
    };
    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
