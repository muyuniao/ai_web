package com.example.Airtificial._Intellegence.utill;
import java.util.*;
import org.json.JSONObject;
import com.baidu.aip.ocr.AipOcr;
public class SampleWord {
    //设置APPID/AK/SK
    static String APP_ID = "117053400";
    static String API_KEY = "nwLKArNMwvsaOVvES7ITg6p6";
    static String SECRET_KEY = "X6WFIklMjRtKyIuwDGpNacL6e56g9wGB";

        public static void main(String[] args) {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
        String path = "C:\\Users\\yunheishere\\Desktop\\testsample\\WordsDetectSample.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());//调用文字识别方法
        System.out.println(res.toString(2));
    }
}