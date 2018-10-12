// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1807.Redbird.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1807.Redbird.Robot;
import org.usfirst.frc1807.Redbird.RobotMap;

/**
 *
 */
public class elevator_down extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public elevator_down() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.elevator);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	
    	while(RobotMap.elevatorpot.get() >=.44 && Robot.oi.manip.getRawButton(3)) {
    		//.47
    		if(RobotMap.elevatorpot.get() >.48) {
    			//RobotMap.elevatorelevator_one.set(-1);
    			
    			//RobotMap.elevatorelevator_one.set(-1);
    			
    			RobotMap.elevatorelevator_one.set(-1);
    			RobotMap.elevatorelevator_two.set(-1);
    		} else {
    			//RobotMap.elevatorelevator_one.set(-(RobotMap.elevatorpot.get()-.43)*(1/.215));
		
    			//RobotMap.elevatorelevator_two.set(-(RobotMap.elevatorpot.get()-.43)*(1/.215));
    			
    			RobotMap.elevatorelevator_one.set(0);
    			
    			RobotMap.elevatorelevator_two.set(0);
    		}
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
