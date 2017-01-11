package org.usfirst.frc1591.Newbot.commands;

import org.usfirst.frc1591.Newbot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class armBackwardV extends Command {
	
	private double m;
	private double s;

    public armBackwardV(double speed, double max) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm);
    	m = max;
    	s = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.actuatorAction(s);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.arm.maxHeight(m);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.armstop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
