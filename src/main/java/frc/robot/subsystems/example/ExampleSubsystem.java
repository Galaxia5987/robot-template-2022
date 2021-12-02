package frc.robot.subsystems.example;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;


public class ExampleSubsystem extends SubsystemBase {
    private final WPI_TalonFX main = new WPI_TalonFX(Ports.ExampleSubsystem.MAIN);
    private final WPI_TalonSRX aux = new WPI_TalonSRX(Ports.ExampleSubsystem.AUX);

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

    /**
     * Set the power output of the motor.
     * @param power the output of the motor in percent [-1, 1].
     */
    public void setPower(double power) {
        main.set(power);
    }

}
