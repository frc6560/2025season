package com.team6560.frc2025.controls;

import edu.wpi.first.wpilibj.Joystick;

public class ButtonBoard {
    public final Joystick buttonBoard;

    public ButtonBoard(int USB_ID){
        this.buttonBoard = new Joystick(USB_ID);
    }

    public boolean getButton(int buttonID) {
        return buttonBoard.getRawButton(buttonID);
    }

    public boolean getAxis(int axisID) {
        return buttonBoard.getRawButtonPressed(axisID);
    }

    // Reef buttons :(
    public boolean getScoreA() {
        return buttonBoard.getRawButtonPressed(1);
    }
    public boolean getScoreB() {
        return buttonBoard.getRawButtonPressed(2);
    }
    public boolean getScoreC() {
        return buttonBoard.getRawButtonPressed(3);
    }
    public boolean getScoreD() {
        return buttonBoard.getRawButtonPressed(4);
    }
    public boolean getScoreE() {
        return buttonBoard.getRawButtonPressed(5);
    }
    public boolean getScoreF() {
        return buttonBoard.getRawButtonPressed(6);
    }
    public boolean getScoreG() {
        return buttonBoard.getRawButtonPressed(7);
    }
    public boolean getScoreH() {
        return buttonBoard.getRawButtonPressed(8);
    }
    public boolean getScoreI() {
        return buttonBoard.getRawButtonPressed(9);
    }
    public boolean getScoreJ() {
        return buttonBoard.getRawButtonPressed(10);
    }
    public boolean getScoreK() {
        return buttonBoard.getRawButtonPressed(11);
    }
    public boolean getScoreL() {
        return buttonBoard.getRawButtonPressed(12);
    }

    public boolean getL1(){
        return buttonBoard.getRawButton(13);
    }
    public boolean getL2(){
        return buttonBoard.getRawButtonPressed(14);
    }
    public boolean getL3(){
        return buttonBoard.getRawButtonPressed(15);
    }
    public boolean getL4(){
        return buttonBoard.getRawButtonPressed(16);
    }

    public boolean getShift(){
        return buttonBoard.getRawButtonPressed(17);
    }

    public boolean getIntake(){
        return buttonBoard.getRawButtonPressed(18);
    }

    public boolean getClimb(){
        return buttonBoard.getRawButtonPressed(19);
    }
}
