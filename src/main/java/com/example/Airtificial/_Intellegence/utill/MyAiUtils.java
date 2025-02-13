package com.example.Airtificial._Intellegence.utill;

import com.baidu.aip.imageclassify.AipImageClassify;
import com.baidu.aip.nlp.AipNlp;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;

public class MyAiUtils {
public static String  Img (MultipartFile file) throws IOException {
    String APP_ID = "117053400";
    String API_KEY = "nwLKArNMwvsaOVvES7ITg6p6";
    String SECRET_KEY = "X6WFIklMjRtKyIuwDGpNacL6e56g9wGB";
    // 初始化一个AipImageClassify
    AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
    // 调用接口
    //String path = "C:\\Users\\yunheishere\\Desktop\\testsample\\panda.jpg";
    //上行为本地测试用途
    JSONObject res = client.advancedGeneral(file.getBytes(), new HashMap<String, String>());//调用通用物体识别方法
    JSONArray ARRres = res.getJSONArray("result");
    String FinalRes = "该图片有" + ARRres.getJSONObject(0).getDouble("score") * 100 + "%的可能性是" + ARRres.getJSONObject(0).getString("keyword");
    return FinalRes;
}
    public static  String Word(MultipartFile file) throws IOException {
        //设置APPID/AK/SK
            String APP_ID = "117053400";
            String API_KEY = "nwLKArNMwvsaOVvES7ITg6p6";
            String SECRET_KEY = "X6WFIklMjRtKyIuwDGpNacL6e56g9wGB";
            // 初始化一个AipOcr
            AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
            // 调用接口
            //本地测试路径 String path = "C:\\Users\\yunheishere\\Desktop\\testsample\\WordsDetectSample.jpg";
            //上行为本地测试用途
            JSONObject res = client.basicGeneral(file.getBytes(), new HashMap<String, String>());//调用文字识别方法
            //打印json结果.  System.out.println(res.toString(2));
            JSONArray words_result=res.getJSONArray("words_result");
            StringBuffer resB=new StringBuffer();
            for (int i = 0; i < words_result.length(); i++) {
                resB.append(words_result.getJSONObject(i).getString("words"));
                resB.append("\n");
            }
            return resB.toString();
    }
    public static String Nlp(String text){
             String APP_ID = "117054739";
             String API_KEY = "oGbuSzdPmtedOLDHW6dwYok5";
             String SECRET_KEY = "2Mr0pNJ4JdHfnaiDpy0hPk0prrVXFq3G";
            // 初始化一个AipNlp
            AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);
            // 调用接口
            JSONObject res = client.ecnet(text, null);
       String FinalRes=res.getJSONObject("item").getString("correct_query");
        System.out.println(FinalRes);
        return FinalRes;
    }

    public static void main(String[] args) throws IOException {
    }
}
