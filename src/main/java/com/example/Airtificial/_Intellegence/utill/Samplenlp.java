package com.example.Airtificial._Intellegence.utill;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONObject;

public class Samplenlp {
    //设置APPID/AK/SK
    public static final String APP_ID = "117054739";
    public static final String API_KEY = "oGbuSzdPmtedOLDHW6dwYok5";
    public static final String SECRET_KEY = "2Mr0pNJ4JdHfnaiDpy0hPk0prrVXFq3G";

    public static void main(String[] args) {
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
        String text = "JAVA是全世界最郝的语言";
        JSONObject res = client.ecnet(text, null);
        System.out.println(res.toString(2));
    }
}
