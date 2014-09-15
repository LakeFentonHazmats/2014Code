/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmat.t2014.commands;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 * @author Nicster34
 */
public class DriveToDistance extends CommandBase{
    double setpoint;
    
    /**
     * Require the drive train and store the desired setpoint.
     * 
     * @param setpoint The desired setpoint for the drive train.
     */
    public DriveToDistance(double setpoint) {
        requires(drivetrain);
        this.setpoint = setpoint;
    }

    // Called just before this Command runs the first time
    /**
     * Set the setpoint to the stored value and enable PID on the drivetrain.
     */
    protected void initialize() {
        drivetrain.setSetpoint(setpoint);
        drivetrain.enable();
        
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        SmartDashboard.putDouble("Help", drivetrain.getLeftEncoder());
        SmartDashboard.putDouble("ME", drivetrain.getPosition());
    }

    // Make this return true when this Command no longer needs to run execute()
    /**
     * @return true when it's close enough to the setpoint
     */
    protected boolean isFinished() {
        return Math.abs(drivetrain.getPosition() - setpoint) < .02;
    }

    // Called once after isFinished returns true
    /**
     * When this command ends, disable the drivetrain's PID
     */
    protected void end() {
        drivetrain.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    /**
     * When this command exits, disable the drivetrain's PID
     */
    protected void interrupted() {
        drivetrain.disable();
    }
    
}
