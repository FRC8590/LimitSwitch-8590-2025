// Connor and the 8590 goons
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LimitSwitchSubsystem extends SubsystemBase {
  /** Creates a new LimitSwitchSubsystem. */

  private DigitalInput limitSwitch = new DigitalInput(Constants.kLimitSwitchPort);

  public boolean getLimitSwitchState() {
      return limitSwitch.get();
  }

  public LimitSwitchSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
