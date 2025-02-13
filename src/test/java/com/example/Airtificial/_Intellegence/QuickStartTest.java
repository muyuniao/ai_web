package com.example.Airtificial._Intellegence;

import com.example.Airtificial._Intellegence.controller.OcrContentController;
import com.example.Airtificial._Intellegence.dto.OcrContent;
import com.example.Airtificial._Intellegence.dto.OcrContentDTO;
import com.example.Airtificial._Intellegence.mapper.OcrContentDTOMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class QuickStartTest {
//    @Autowired
//    private OcrContentMapper ocrContentMapper;
//    @Autowired
//    private OcrContentMapper ocrContentdtoMapper;
//    @Autowired
//    private OcrContentController contentController;
//    @Autowired
//    private OcrContentDTOMapper ocrContentDTOMapper;
//
//    @Test
//    public void testSelectOcrContent() {
//        System.out.println("----- selectAll method test ------");
//        List<OcrContent> temp_ocrcontentSE = ocrContentMapper.selectList(null);
//        for (OcrContent content : temp_ocrcontentSE) {
//            System.out.println("content:" + content.getContent());
//            System.out.println("type:" + content.getType());
//            System.out.println("createTime:" + content.getCreateTime());
//            System.out.println("updateTime:" + content.getUpdateTime());
//            System.out.println("=====================================");
//        }
//    }
//
//    @Test
////    public void testInsertOcrContent() {
////        System.out.println("----- insertONEl method test ------");
////        OcrContent ocrContent = new OcrContent();
////        ocrContent.setContent("test");
////        ocrContent.setType('自然语言处理');
////        ocrContent.setCreateTime(new Date());
////        ocrContent.setUpdateTime(new Date());
////        int result = ocrContentMapper.insert(ocrContent);
////        System.out.println("成功插入" + result + "条数据");
////    }
//    public void testdeleteOcrContent() {
//        System.out.println("----- deleteONE method test ------");
//        int result1 = ocrContentMapper.deleteById(1);
//        System.out.println("成功删除"+result1+"条数据");
//    }
//    @Test
//    public void testupdateOcrContent() {
//        System.out.println("----- updateONE method test ------");
//        OcrContent ocrContent = new OcrContent();
//        ocrContent.setContent("updatetest");
//        ocrContent.setType("111");
//        ocrContent.setCreateTime(new Date());
//        ocrContent.setUpdateTime(new Date());
//        int result = ocrContentMapper.updateById(ocrContent);
//        System.out.println("成功更新"+result+"条数据");
//    }
@Autowired
private OcrContentDTOMapper ocrContentDTOMapper;

    @Test
    public void contencontrollertest() {
        List<OcrContentDTO> allcontent = ocrContentDTOMapper.getAllContent();
        for (OcrContentDTO content : allcontent) {
            System.out.println("id:" + content.getId());
            System.out.println("content:" + content.getContent());
            System.out.println("type:" + content.getType());
            System.out.println("createTime:" + content.getCreateTime());
            System.out.println("updateTime:" + content.getUpdateTime());
            System.out.println("=====================================");
        }
    }
}

