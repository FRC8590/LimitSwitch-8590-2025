package frc.robot.Subsystems;

import java.text.RuleBasedCollator;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.*;

public class ColorSensorSubsystem extends SubsystemBase{
     /** Creates a new ColorSensorSubsystem. */
    private DigitalInput colorSensor = new DigitalInput(Constants.kColorSensorPort);
public ColorSensorV3 color = new ColorSensorV3(null);
     public boolean getcolorSensorState() {
      return colorSensor.get();
  }

  public ColorSensorSubsystem() {
      super();
  }
  //Change red when autotomus
  public ColorSensorV3 automated(){
    if(robot.isAutonomus())
  return null;
  }
  //Change to Blue
  //Change to Green

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}
