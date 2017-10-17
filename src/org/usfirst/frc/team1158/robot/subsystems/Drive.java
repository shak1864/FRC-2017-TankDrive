package org.usfirst.frc.team1158.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
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
	
	private RobotDrive robotDrive;
	
	private SpeedController left;
	private SpeedController right;
	
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
    	
    	left = new Victor(RobotMap.LEFT);
    	right = new Victor(RobotMap.RIGHT);
    	
    	ultrasonicOne = new Ultrasonic(1,1);
    	
    	try {
    	    gyro = new AHRS(SerialPort.Port.kUSB);
//    	    SerialPort.Port.
    	} catch (RuntimeException ex) {
                DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
    	    // TODO Add global variable
    	}
    	
    	robotDrive = new RobotDrive(left, right); 
    }
    
    public Shifter getCurrGear() {
		return currGear;
	}

	public Speed getCurrSpeed() {
		return currSpeed;
	}
 
	public void drive(Joystick joystick) {
		double leftMove = 1 * joystick.getRawAxis(RobotMap.JOYSTICK_LEFT_Y);
		double rightMove = 1 * joystick.getRawAxis(RobotMap.JOYSTICK_RIGHT_Y);
		robotDrive.tankDrive(leftMove, rightMove, true);
		
	}


	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
