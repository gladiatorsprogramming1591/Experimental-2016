package org.usfirst.frc1591.Newbot.commands;

import org.usfirst.frc1591.Newbot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class rotate extends Command {
	
	private double s1;
	private double s2;
	
	//positive = clockwise
	//negative = counterclockwise

    public rotate(double time, double speed1, double speed2) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arcadeDrive);
    	setTimeout(time);
    	
    	s1 = speed1;
    	s2 = -speed2;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arcadeDrive.driveCommand(s1, s2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arcadeDrive.driveStraight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
