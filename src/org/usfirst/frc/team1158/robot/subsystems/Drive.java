package org.usfirst.frc.team1158.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team1158.robot.subsystems.Drive.Shifter;
import org.usfirst.frc.team1158.robot.subsystems.Drive.Speed;
import org.usfirst.frc.team1158.robot.RobotMap;
/**
 *
 */
public class Drive extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	private SpeedController leftFront;
	private SpeedController leftBack;
	private SpeedController rightFront;
	private SpeedController rightBack;
	
	private Ultrasonic ultrasonicOne;
	private Ultrasonic ultrasonicTwo;
	
    private AHRS gyro;
    
    public enum Shifter {
		High, Low
	}

	public enum Speed {
		Normal, Slow
	}

	private Shifter currGear = Shifter.Low;
	private Speed currSpeed = Speed.Normal;
    
    public Drive() {
    	
    	leftFront = new Victor(RobotMap.LEFT_FRONT_MOTOR);
    	leftBack = new Victor(RobotMap.LEFT_BACK_MOTOR);
    	rightFront = new Victor(RobotMap.RIGHT_FRONT_MOTOR);
    	rightBack = new Victor(RobotMap.RIGHT_BACK_MOTOR);
    	
    	
    	try {
    	    gyro = new AHRS(SerialPort.Port.kUSB);
//    	    SerialPort.Port.
    	} catch (RuntimeException ex) {
                DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
    	    // TODO Add global variable
    	}
    }
    
    public Shifter getCurrGear() {
		return currGear;
	}

	public Speed getCurrSpeed() {
		return currSpeed;
	}
 


	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
