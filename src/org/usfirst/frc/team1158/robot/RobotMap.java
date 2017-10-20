package org.usfirst.frc.team1158.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int DRIVER_JOYSTICK = 0;
	
	public static final int JOYSTICK_LEFT_Y = 1;
	public static final int JOYSTICK_RIGHT_Y = 3;
		
	public static int LEFT = 0;
	public static int RIGHT = 1;
	
	public static final int LEFT_ENCODER_A = 0;
	public static final int LEFT_ENCODER_B = 1;
	public static final int RIGHT_ENCODER_A = 2;
	public static final int RIGHT_ENCODER_B = 3;
	
	public static final int GYRO = 0;
	
	public static final int ULTRASONIC_ONE_DIGITAL_INPUT = 4;
	public static final int ULTRASONIC_TWO_DIGITAL_INPUT = 5;
	
	public static final int ULTRASONIC_ONE_TRIGGER_IMPLUSE = 6;
	public static final int ULTRASONIC_TWO_TRIGGER_IMPLUSE = 7;



}
