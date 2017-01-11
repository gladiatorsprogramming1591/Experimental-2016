package org.usfirst.frc1591.Newbot.commands;

import org.usfirst.frc1591.Newbot.commands.Arms_to_90;
import org.usfirst.frc1591.Newbot.commands.armDrive;
import org.usfirst.frc1591.Newbot.commands.drawBridge2;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class auto_Drawbridge extends CommandGroup {
    
    public  auto_Drawbridge() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addSequential(new armDrive());
    	addSequential(new Arms_to_90());
    	addSequential(new drawBridge2());
    }
}
