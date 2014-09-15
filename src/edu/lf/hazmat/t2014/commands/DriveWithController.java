/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmat.t2014.commands;

/**
 
 * @author Nicster34
 */
public class DriveWithController extends CommandBase {
   
    
    public DriveWithController() {
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    /**
     * Have the drivetrain drive tank drive with the latest values from joysticks.
     */
    protected void execute() {
        drivetrain.arcadeDrive(-oi.getLeftSpeed(), oi.getRotation());
    }

    // Make this return true when this Command no longer needs to run execute()
    /**
     * @return false, so that it executes forever or until another command
     *         interrupts it.
     */
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
    
