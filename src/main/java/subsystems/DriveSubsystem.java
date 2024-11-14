// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  private final SwerveModule m_leftFront;
  private final SwerveModule m_rightFront;
  private final SwerveModule m_leftBack;
  private final SwerveModule m_rightBack;
 
 
  /** Creates a new drivetrain. */
  public DriveSubsystem() {
    m_leftFront = new SwerveModule(1, 2, 0);
    m_rightFront = new SwerveModule(3, 4, 0);
    m_leftBack = new SwerveModule(5, 6, 0);
    m_rightBack = new SwerveModule(7, 8, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
