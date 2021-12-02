package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.example.ExampleSubsystem;
import frc.robot.subsystems.example.commands.ExampleCommand;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public ExampleSubsystem exampleSubsystem = ExampleSubsystem.getInstance();
  private final XboxController xbox = new XboxController(Ports.Controls.XBOX);
  private final JoystickButton a = new JoystickButton(xbox, XboxController.Button.kA.value);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings and default commands
    configureDefaultCommands();
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    a.whenPressed(new ExampleCommand(exampleSubsystem));
  }

  private void configureDefaultCommands() {
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {

    // An ExampleCommand will run in autonomous
    return null;
  }
}
