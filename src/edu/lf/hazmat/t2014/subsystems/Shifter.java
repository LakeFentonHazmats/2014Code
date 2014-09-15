/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmat.t2014.subsystems;
import edu.lf.hazmat.t2014.RobotMap;
import edu.lf.hazmat.t2014.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.lf.hazmat.t2014.commands.ShiftToHigh;

/**
 *
 * @author Nicster34
 */
public class Shifter extends Subsystem{
    DoubleSolenoid shifter = new DoubleSolenoid(RobotMap.shifter1,RobotMap.shifter2); 
    
    
    public void initDefaultCommand() {
         setDefaultCommand(new ShiftToHigh());
         
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
         
    }
    public void shiftHigh(){
        shifter.set(DoubleSolenoid.Value.kForward);
    }
    public void shiftLow(){
        shifter.set(DoubleSolenoid.Value.kReverse);
    }
}
