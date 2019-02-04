package UI;

import Application.ApplicationState;
import Car.CarEntryQueue;
import Car.CarExitQueue;
import Car.CarPaymentQueue;
import Car.CarQueue;
import ParkingGarage.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SimulatorPanel extends JPanel {

    private ApplicationState applicationState;
    private ParkingGarageView parkingGarageView;

    /**
     * Constructor for a simulator panel object, with no parameters and set values.
     */
    public SimulatorPanel() {
        applicationState = ApplicationState.getInstance();

        setMinimumSize(new Dimension(400, 400));
        setBorder(Theme.getDefaultBorder());

        parkingGarageView = new ParkingGarageView();

        ArrayList<CarQueue> queues = applicationState.getParkingGarage().getCarQueues();
        CarEntryQueue entryQueue = new CarEntryQueue(3);
        queues.add(entryQueue);
        queues.add(new CarPaymentQueue(1));
        queues.add(new CarExitQueue(5));

        setLayout (new BorderLayout());
        add(parkingGarageView);

        setVisible(true);
    }

    /**
     * method to return the parkingGarageView object.
     *
     * @return the corresponding parkingGarageView object.
     */
    public ParkingGarageView getParkingGarageView() {
        return parkingGarageView;
    }

}
