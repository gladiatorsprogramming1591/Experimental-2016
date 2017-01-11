// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1591.Newbot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1591.Newbot.Robot;

/**
 *
 */
public class UAtoBumper extends Command {

	final static double SPEED = 0.6;
	final static double MINSPEED = 0.5;
	final static double TOLERANCE = 0.002;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public UAtoBumper() {
    	
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.leftArm);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		Robot.leftArm.leftarmDown(SPEED);
		Robot.rightArm.rightarmDown(SPEED);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		if ((Robot.rightArm.getPotValue() - Robot.leftArm.getPotValue()) > TOLERANCE) 
			Robot.leftArm.leftarmDown(MINSPEED);
		else if ((Robot.rightArm.getPotValue() - Robot.leftArm.getPotValue()) < -TOLERANCE) 
			Robot.leftArm.leftarmDown(SPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Robot.leftArm.getPosition() < 0.12)
    		return true;
    	else
    		return false;
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