package org.usfirst.frc1591.Newbot.commands;

import org.usfirst.frc1591.Newbot.Robot;
import org.usfirst.frc1591.Newbot.subsystems.WinchSub;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class winchOn extends Command {

    public winchOn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

    	requires(Robot.winchSub);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.winchSub.winchOn();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.winchSub.winchOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
