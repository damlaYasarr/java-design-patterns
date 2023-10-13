package com.iluwatar.facades;

public class Converter {
        
    private VideoEncoder videoEncoder;
    private AudioEncoder audioEncoder;
    private VideoFormatConverter videoFormatConverter;
    private AudioFormatConverter audioFormatConverter;
  
 public Converter(){
    this.videoEncoder = new VideoEncoder();
    this.audioEncoder = new AudioEncoder();
    this.videoFormatConverter = new VideoFormatConverter();
    this.audioFormatConverter = new AudioFormatConverter();
    }
   
    public String convertVideo(String inputVideo, String outputVideoFormat) {
        // Video dönüştürme işlemleri
        String encodedVideo = videoEncoder.encode(inputVideo);
        String convertedVideo = videoFormatConverter.convert(encodedVideo, outputVideoFormat);
        return convertedVideo;
    }

    public String convertAudio(String inputAudio, String outputAudioFormat) {
        // Ses dönüştürme işlemleri
        String encodedAudio = audioEncoder.encode(inputAudio);
        String convertedAudio = audioFormatConverter.convert(encodedAudio, outputAudioFormat);
        return convertedAudio;
    }
}
