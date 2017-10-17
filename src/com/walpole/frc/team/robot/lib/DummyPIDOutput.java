package com.walpole.frc.team.robot.lib;

import edu.wpi.first.wpilibj.PIDOutput;

/**
 * A dummy PID output that does not output to any hardware. Pass the
 * DummyPIDOutput object to the PIDController class and read the output in your
 * own code. This is useful for mixing the results of multiple PID controllers
 * to one output.
 * 
 * @author Joe Ross, Team 330
 */
public class DummyPIDOutput implements PIDOutput {
    double output;

    public DummyPIDOutput() {
	output = 0;
    }

    public void pidWrite(double output) {
	this.output = output;
    }

    public double getOutput() {
	return output;
    }
}