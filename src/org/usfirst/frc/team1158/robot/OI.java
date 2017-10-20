package org.usfirst.frc.team1158.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team1158.robot.commands.ExampleCommand;

import com.walpole.frc.team.robot.lib.RebelTrigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private Joystick driverStick = new Joystick(RobotMap.DRIVER_JOYSTICK);
        
    Button drA = new JoystickButton(driverStick, 1);
    Button drB = new JoystickButton(driverStick, 2);
    Button drX = new JoystickButton(driverStick, 3);
    Button drY = new JoystickButton(driverStick, 4);

    
    public Joystick getDriverStick() {
    	
    	return driverStick;
    	
    }
  
}
