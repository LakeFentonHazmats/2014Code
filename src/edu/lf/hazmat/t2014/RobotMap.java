package edu.lf.hazmat.t2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    public static final int
            leftMotor =1,
            rightMotor =2;
            
    
    
    
    public static final int
            leftEncoder1 =1,
            leftEncoder2 =2,
            rightEncoder1 =3,
            rightEncoder2 =4,
            pressureSensor =5,
            gyroSensor =1;
    
    public static final int
            relay =1;
    
    public static final int
            shifter1 = 1,
            shifter2 = 2;
            
            
    
            
    
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
