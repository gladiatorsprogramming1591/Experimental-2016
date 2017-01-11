package org.usfirst.frc1591.Newbot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class liftGate3 extends CommandGroup {
    
    public  liftGate3() {
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
    	addSequential(new driveFoward(false,0,0.6,true,0.092*8.65));
    	addSequential(new liftGate());
    	addSequential(new liftGate2());
    }
}
