/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmat.t2014.commands;

/**
 *
 * @author Nicster34
 */
import edu.lf.hazmat.t2014.subsystems.Shifter;

/**
 *
 * @author Nicster34
 */
public class ShiftToLow extends CommandBase{
    
    public ShiftToLow(){
        requires(driveShift);
    }
    
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveShift.shiftLow();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
}
