package com.keybord.event;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot();
		 // Simulate a mouse click
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

// ctrl + T & ctrl TAB  

    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_T);

    // CTRL+T is now pressed 

    robot.keyRelease(KeyEvent.VK_T);
    robot.keyRelease(KeyEvent.VK_CONTROL);



	}

}
