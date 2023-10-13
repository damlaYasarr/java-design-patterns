package com.iluwatar.facades;
import lombok.extern.slf4j.Slf4j;
/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        LOGGER.info( "Hello World!" );
        Converter facade=new Converter();
        String inputVideo = "input_video.mp4";
        String outputVideoFormat = "avi";
        String convertedVideo = facade.convertVideo(inputVideo, outputVideoFormat);
         LOGGER.info("Converted video: " + convertedVideo);

        String inputAudio = "input_audio.wav";
        String outputAudioFormat = "mp3";
        String convertedAudio = facade.convertAudio(inputAudio, outputAudioFormat);
         LOGGER.info("Converted audio: " + convertedAudio);

    }
}
