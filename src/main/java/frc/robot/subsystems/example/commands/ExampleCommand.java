package frc.robot.subsystems.example.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.example.ExampleSubsystem;

public class ExampleCommand extends Command {
    private final ExampleSubsystem exampleSubsystem;

    public ExampleCommand(ExampleSubsystem exampleSubsystem) {
        this.exampleSubsystem = exampleSubsystem;
    }

    @Override
    protected void initialize() {
        exampleSubsystem.setPower(Constants.ExampleSubsystem.POWER);
    }

    @Override
    protected void execute() {
    }

    @Override
    protected void end() {
        exampleSubsystem.setPower(0);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
