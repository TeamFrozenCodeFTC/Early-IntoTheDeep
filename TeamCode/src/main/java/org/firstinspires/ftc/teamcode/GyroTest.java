package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class GyroTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        BNO055IMU imu = hardwareMap.get(BNO055IMU.class, "imu");
        Gyro2 gyro = new Gyro2(imu, this);
        gyro.startGyro();
        waitForStart();
    }
}
