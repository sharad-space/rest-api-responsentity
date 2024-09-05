package com.api.book.bootrestbook.helper;


import java.io.InputStream;

import org.springframework.boot.autoconfigure.ssl.SslProperties.Bundles.Watch.File;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

    public final String UPLOAD_DIR="C:\\Users\\shara\\OneDrive\\Desktop\\boot\\bootrestbook\\src\\main\\resources\\static";

    public boolean uploadFile(MultipartFile multipartFile ){

        boolean b=false;

        try {
        //    InputStream is=  multipartFile.getInputStream();
        //    byte[] data=new byte[is.available()];
        //    is.read(data);
        //    FileOutPutStream ip=new FileOutPutStream(UPLOAD_DIR+"\\" multipartFile.getOriginalFilename());
        //   FIles.copy(multipartFile.InputStream(), UPLOAD_DIR.separator+multipartFile.getOriginalFilename(), StandardCopyOptipn)
           
        } catch (Exception e) {
            e.printStackTrace();
        }

        return b;
    }
    
}
