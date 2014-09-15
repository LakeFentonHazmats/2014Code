/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmat.t2014.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.lf.hazmat.t2014.RobotMap;
import edu.lf.hazmat.t2014.commands.CommandBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Gyro;
import edu.lf.hazmat.t2014.commands.DriveWithController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 * @author Nicster34
 */
public class DriveTrain extends PIDSubsystem {
    
    private static final double Kp = .0005;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;
    
    RobotDrive drive;
    Encoder leftDistance;
    Encoder rightDistance;
    Gyro robotAngle;
    
    


    // Initialize your subsystem here
    public DriveTrain() {
        super("DriveTrain", Kp, Ki, Kd);
        drive = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);
        
        leftDistance = new Encoder(RobotMap.leftEncoder1, RobotMap.leftEncoder2);
        rightDistance = new Encoder(RobotMap.rightEncoder1, RobotMap.rightEncoder2);
        
        robotAngle = new Gyro(RobotMap.gyroSensor);
        
        
        
        
       
    }
//    public double getGryosangle() {
//        return robotAngle.getAngle();
//    }
    
    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithController());
    }

    /**
     * @return The value of the rangefinder used as the PID input device.
     *         These values correspond to your PID setpoint, in this case the
     *         value can be anywhere between 0v and 5v.
     */
    protected double returnPIDInput() {
        leftDistance.start();
        rightDistance.start();
        return leftDistance.getDistance();
        
        
    }
    public double getLeftEncoder(){
        return leftDistance.getDistance();
        
    }

    /**
     * @param output The value to set the output to as determined by the PID
     *               algorithm. This gets called each time through the PID loop
     *               to update the output to the motor.
     */
    protected void usePIDOutput(double output) {
        arcadeDrive(-output, 0);
    }
    
    /**
     * Implements the tank drive capability of the drivetrain.
     * 
     * @param left The speed for the left side of the drivetrain.
     * @param right The speed for the right side of the drivetrain.
     */
    public void arcadeDrive(double move, double rotate) {
        drive.arcadeDrive(move,rotate);
    }
    
    
}
