package org.usfirst.frc1591.Newbot.commands;

import org.usfirst.frc1591.Newbot.commands.armDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class auto_Drive extends CommandGroup {
    
    public  auto_Drive() {
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
    	addSequential(new driveFoward(true, 5, 0.7, false, 0));
    	addSequential(new rotate_180());
    }
}
