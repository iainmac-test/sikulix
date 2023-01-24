package com.pokerstars.is;

import org.junit.jupiter.api.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliTest {
    @Test()
    public void testSomething(){

        String filepath = "/Users/DonalIai/IdeaProjects/sikulix-poker/src/main/resources/sikuli/";
        //Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
        Pattern packageImage = new Pattern(filepath + "package.png");


        Screen s = new Screen();
        try{
            s.click(packageImage);
            //s.wait("imgs/spotlight-input.png");
            //s.click();
            //s.write("hello world#ENTER.");
        }
        catch(FindFailed e){
            e.printStackTrace();
        }

    }

}
