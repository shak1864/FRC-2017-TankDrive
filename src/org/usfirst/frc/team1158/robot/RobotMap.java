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
	public static final int JOYSTICK_RIGHT_X = 4;
		
	public static int LEFT_FRONT_MOTOR = 0;
	public static int LEFT_BACK_MOTOR = 1;
	public static int RIGHT_FRONT_MOTOR = 2;
	public static int RIGHT_BACK_MOTOR = 3;
	
	public static final int LEFT_ENCODER_A = 0;
	public static final int LEFT_ENCODER_B = 1;
	public static final int RIGHT_ENCODER_A = 2;
	public static final int RIGHT_ENCODER_B = 3;
	
	public static final int GYRO = 0;
}
