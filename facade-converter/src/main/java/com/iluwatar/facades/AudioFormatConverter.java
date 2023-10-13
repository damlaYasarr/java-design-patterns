package com.iluwatar.facades;

public class AudioFormatConverter {
    public String convert(String audio, String outputFormat) {
        System.out.println("Audio format conversion: " + audio + " to " + outputFormat);
        // Ses format dönüşüm işlemleri
        return "Converted " + audio + " to " + outputFormat;
    }
}
