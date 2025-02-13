package com.example.Airtificial._Intellegence.utill;

import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;

import java.util.HashMap;

public class Sampleimg {
    //设置APPID/AK/SK
    static String APP_ID = "117053400";
    static String API_KEY = "nwLKArNMwvsaOVvES7ITg6p6";
    static String SECRET_KEY = "X6WFIklMjRtKyIuwDGpNacL6e56g9wGB";

    public static void main(String[] args) {
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
        String path = "C:\\Users\\yunheishere\\Desktop\\testsample\\panda.jpg";
        JSONObject res = client.advancedGeneral(path, new HashMap<String, String>());//调用通用物体识别方法
        System.out.println(res.toString(2));
    }
}
