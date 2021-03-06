/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {
    Joystick driveStick = new Joystick(1);
    Joystick shootStick = new Joystick(2);
    
    RobotDrive mainDrive = new RobotDrive(1,2,3,4);
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        /*
        mainDrive.mecanumDrive_Cartesian(driveStick.getAxis(Joystick.AxisType.kX), 
                driveStick.getAxis(Joystick.AxisType.kY), 
                driveStick.getAxis(Joystick.AxisType.kZ), 
                0);
                */
        mainDrive.tankDrive(driveStick, shootStick);
    }
    
}
