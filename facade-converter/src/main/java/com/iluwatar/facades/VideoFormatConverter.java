package com.iluwatar.facades;

public class VideoFormatConverter {
    public String convert(String video, String outputFormat) {
        System.out.println("Video format conversion: " + video + " to " + outputFormat);
        // Video format dönüşüm işlemleri
        return "Converted " + video + " to " + outputFormat;
    }
}
