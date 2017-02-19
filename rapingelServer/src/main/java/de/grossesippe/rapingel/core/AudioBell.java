package de.grossesippe.rapingel.core;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by ludal on 19.02.17.
 */
public class AudioBell {

    private ClassLoader classLoader = getClass().getClassLoader();
    public AudioBell(){}

    public void ring() throws  Throwable{

        File schulgongWav;
        schulgongWav = new File(classLoader.getResource("sound/schulgon.wav").getFile());
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(schulgongWav);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        Clip audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.open(audioStream);
        audioClip.start();


    }
}
