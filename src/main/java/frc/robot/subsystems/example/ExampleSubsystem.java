package frc.robot.subsystems.example;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Ports;


public class ExampleSubsystem extends Subsystem {
    private final TalonFX main = new TalonFX(Ports.ExampleSubsystem.MAIN);
    private final TalonSRX aux = new TalonSRX(Ports.ExampleSubsystem.AUX);

    private final static ExampleSubsystem INSTANCE = new ExampleSubsystem();

    public static ExampleSubsystem getInstance() {
        return INSTANCE;
    }

    private ExampleSubsystem() {
        // motor and sensor inversions
        main.setInverted(Ports.ExampleSubsystem.IS_MAIN_INVERTED);
        aux.setInverted(Ports.ExampleSubsystem.IS_AUX_INVERTED);
        main.setSensorPhase(Ports.ExampleSubsystem.IS_MAIN_SENSOR_INVERTED);
        aux.setSensorPhase(Ports.ExampleSubsystem.IS_AUX_SENSOR_INVERTED);

        // follow
        aux.follow(main);
    }

    public void setPower(double power) {
        main.set(ControlMode.PercentOutput, power);
    }


    @Override
    protected void initDefaultCommand() {

    }
}
