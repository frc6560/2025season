package com.team6560.frc2025.commands;

import com.team6560.frc2025.ManualControls;
import com.team6560.frc2025.subsystems.BallGrabber;

import edu.wpi.first.wpilibj2.command.Command;
public class BallGrabberCommand extends Command {
    
    final BallGrabber ballGrabber;
    final ManualControls controls;

    public BallGrabberCommand(BallGrabber grabber, ManualControls controls) {
        this.ballGrabber = grabber;
        this.controls = controls;
        addRequirements(grabber);
    }

    @Override
    public void initialize() {
        ballGrabber.stop();
    }
    
    @Override
    public void execute() {
        if(controls.shiftedControls()){
            if(controls.runGrabberIntake()){
                ballGrabber.runIntake();
            } else if(controls.runGrabberOuttake()){
                ballGrabber.runOuttake();
            } else {
                ballGrabber.stop();
            }
        }
        else{
            ballGrabber.stop();
        }
    }

    @Override
    public void end(boolean interrupted) {
        ballGrabber.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}


