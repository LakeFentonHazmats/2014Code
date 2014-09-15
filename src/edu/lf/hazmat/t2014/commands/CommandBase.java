package edu.lf.hazmat.t2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.lf.hazmat.t2014.OI;
import edu.lf.hazmat.t2014.subsystems.DriveTrain;
import edu.lf.hazmat.t2014.subsystems.Shifter;


/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {
    // CommandBase holds a static instance of OI
    public static OI oi;
    
    // Instances of each subsystem
    public static DriveTrain drivetrain = new DriveTrain();
    public static Shifter driveShift = new Shifter();
      
    /**
     * Call this command to properly finish initializing the CommandBase.
     * This call is automatically included in the default template.
     */
    public static void init() {
        oi = new OI();
        
        // Optional: Logs the currently running command for each subsystem in
        //           the SmartDashboard. This can be useful for debugging.
        SmartDashboard.putData(drivetrain);
        SmartDashboard.putData("PID", drivetrain.getPIDController());
        SmartDashboard.putNumber("Distance", drivetrain.getPosition());
      
       
       
       
    }
    
    // Automatically created constructors.
    public CommandBase(String name) { super(name); }
    public CommandBase() { super(); }
}
