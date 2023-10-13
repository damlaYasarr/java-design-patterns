package com.iluwatar.facades;

import ws.schild.jave.encode.AudioAttributes;

public class AudioEncoder {
    public String encode( String audioFilePath) {
        /* Step 2. Set Audio Attributes for conversion */
        AudioAttributes audioAttributes =new AudioAttributes();
        audioAttributes.setCodec("aac");
        // here 64kbit/s is 64000
        audioAttributes.setBitRate(64000);
        audioAttributes.setChannels(2);
        audioAttributes.setSamplingRate(44100);
        System.out.println("Audio encoding: " + audioFilePath);
        // Audio encoding operations
        return "Encoded " + audioFilePath;
    }
    
}
