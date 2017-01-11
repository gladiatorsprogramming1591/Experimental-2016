package org.usfirst.frc1591.Newbot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1591.Newbot.Robot;

/**
 *
 */
public class armUpV extends Command {
	
	private double s;
	private double m;
	
	public armUpV(double speed, double max) {
		m = max;
		s = speed;
		requires(Robot.leftArm);
	}
    

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.leftArm.leftarmUp(s);
    	Robot.rightArm.rightarmUp(s);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.rightArm.maxHeight(m) || Robot.leftArm.maxHeight(m));
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
