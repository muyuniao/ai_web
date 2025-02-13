package com.example.Airtificial._Intellegence.controller;

import com.example.Airtificial._Intellegence.dto.OcrContent;
import com.example.Airtificial._Intellegence.mapper.OcrContentMapper;
import com.example.Airtificial._Intellegence.utill.MyAiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class AiController {
    @Autowired
    private OcrContentMapper ocrContentMapper;
   @RequestMapping(value = "/nlp",method = RequestMethod.GET)
    public String  Nlp(@RequestParam("text") String text) {
       Date d = new Date();
       SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String Nlpres=MyAiUtils.Nlp(text);
       OcrContent ocrContent = new OcrContent();
         ocrContent.setContent(Nlpres);
         ocrContent.setType("自然语言处理");
         ocrContent.setCreateTime(new Date(System.currentTimeMillis()));
         ocrContent.setUpdateTime(new Date(System.currentTimeMillis()));
            ocrContentMapper.insert(ocrContent);
        return Nlpres ;
    }
    @RequestMapping(value = "/img",method = RequestMethod.POST)
    public String  Img(@RequestParam("file")MultipartFile file) throws IOException {
       String Imgres=MyAiUtils.Img(file);
        OcrContent ocrContent = new OcrContent();
            ocrContent.setContent(Imgres);
             ocrContent.setType("图像识别");
        ocrContent.setCreateTime(new Date(System.currentTimeMillis()));
        ocrContent.setUpdateTime(new Date(System.currentTimeMillis()));
        ocrContentMapper.insert(ocrContent);
        return Imgres;
    }
    @RequestMapping(value = "/word",method = RequestMethod.POST)
    public String  Word(@RequestParam("file")MultipartFile file) throws IOException {
       String Wordres=MyAiUtils.Word(file);
        OcrContent ocrContent = new OcrContent();
                ocrContent.setContent(Wordres);
                ocrContent.setType("文字提取");
        ocrContent.setCreateTime(new Date(System.currentTimeMillis()));
        ocrContent.setUpdateTime(new Date(System.currentTimeMillis()));
        ocrContentMapper.insert(ocrContent);
        return Wordres;
    }
}
