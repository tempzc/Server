package com.ilodo.mybatis.controller.rest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传控制器
 * @author 常学军
 * @since jdk1.8
 * 2015-07-19
 *
 */
@Controller
public class FileUploadController {

    /**
     * 文件上传 
     * @param name 文件名 
     * @param file 文件流
     * @return
     */
    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file){
    	String userDir = System.getProperty("user.dir");
        if (!file.isEmpty()) {
        	String contentType = file.getContentType();
        	String fileExt = contentType.substring(contentType.indexOf("/")+1);
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(userDir+"/videos/"+name+"."+fileExt)));
                stream.write(bytes);
                stream.close();
                return "You successfully uploaded " + name + "!";
            } catch (Exception e) {
            	
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }

    
    /**
     * 文件下载 
     * @param name 视频文件名
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/videos", method=RequestMethod.GET)
    public ResponseEntity<byte[]> download(@RequestParam("name") String name) throws IOException {    
    	String userDir = System.getProperty("user.dir");
    	String fileExt = "mp4";
        File file=new File(userDir+"/videos/"+name+"."+fileExt);  
        HttpHeaders headers = new HttpHeaders();  	  
        
//        String fileName=new String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题  
//        headers.setContentDispositionFormData("attachment", fileName);   
        
        headers.setContentDispositionFormData("attachment", name+"."+fileExt);   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);    
    }		    

}
