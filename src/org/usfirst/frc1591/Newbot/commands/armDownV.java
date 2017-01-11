package org.usfirst.frc1591.Newbot.commands;

import org.usfirst.frc1591.Newbot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class armDownV extends Command {
	
	double m;
	double s;

    public armDownV(double min, double speed) {
    	requires(Robot.leftArm);
    	m = min;
    	s = speed;
    }
    
    

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.leftArm.leftarmDown(s);
    	Robot.rightArm.rightarmDown(s);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if ((Robot.leftArm.getPosition()-Robot.rightArm.getPosition())>-0.003){
    		Robot.leftArm.leftarmDown(s);
    	}
    	else{
    		Robot.leftArm.leftarmDown(s - 0.1);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (Robot.rightArm.minHeight(m) || Robot.leftArm.minHeight(m));
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.leftArm.leftarmStop();
    	Robot.rightArm.rightarmStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
