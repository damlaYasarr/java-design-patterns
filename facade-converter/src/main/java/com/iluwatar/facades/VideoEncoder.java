package com.iluwatar.facades;

import java.io.File;

import org.slf4j.Logger;

import lombok.extern.slf4j.Slf4j;
import ws.schild.jave.encode.VideoAttributes;
import ws.schild.jave.encode.enums.X264_PROFILE;
import ws.schild.jave.info.VideoSize;
@Slf4j
public class VideoEncoder {
    public String encode(String videofilepath) {
         /* Step 3. Set Video Attributes for conversion*/
        VideoAttributes video=new VideoAttributes();
        video.setCodec("h264");
        video.setX264Profile(X264_PROFILE.BASELINE);
// Here 160 kbps video is 160000
            video.setBitRate(160000);
// More the frames more quality and size, but keep it low based on devices like mobile
        video.setFrameRate(15);
        video.setSize(new VideoSize(400, 300));
        //LOGGER KULLAN
        LOGGER.info("Video encoding: " + videofilepath);
        // Video kodlama işlemleri 

        return "Encoded " + videofilepath;
    }
}
