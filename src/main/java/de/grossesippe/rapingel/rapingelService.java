package de.grossesippe.rapingel;

import com.pi4j.io.gpio.GpioController;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.*;
import com.pi4j.io.gpio.GpioFactory;

import static com.pi4j.io.gpio.PinPullResistance.PULL_UP;

/**
 * Monitoring my Button
 * Created by Benjamin on 14.01.17.
 */
public class rapingelService {


    public static void main(String args[]) throws InterruptedException {
        System.out.println("<--Pi4J--> GPIO Listen Example ... started.");

        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();

        // provision gpio pin #02 as an input pin with its internal pull down resistor enabled
        final GpioPinDigitalInput myButton = gpio.provisionDigitalInputPin(RaspiPin.GPIO_09, PULL_UP);

        // set shutdown state for this input pin
        myButton.setShutdownOptions(true);

        // create and register gpio pin listener
        myButton.addListener(new GpioPinListenerDigital() {
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                // display pin state on console
                System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
            }

        });

        System.out.println(" ... complete the '"+ myButton.getPin() +"' circuit and see the listener feedback here in the console.");

        // keep program running until user aborts (CTRL-C)
        while (true) {
            Thread.sleep(500);
        }

        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)
        // gpio.shutdown();   <--- implement this method call if you wish to terminate the Pi4J GPIO controller
    }
}


