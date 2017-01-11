package org.usfirst.frc1591.Newbot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class armToFloor15 extends CommandGroup {
    
    public  armToFloor15() {
      
    	addSequential(new UAto15inches());
        addSequential(new armInFull());
    }
}
