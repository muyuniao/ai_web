package com.example.Airtificial._Intellegence.controller;

import com.example.Airtificial._Intellegence.dto.OcrContentDTO;
;
import com.example.Airtificial._Intellegence.mapper.OcrContentDTOMapper;
import com.example.Airtificial._Intellegence.mapper.OcrContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OcrContentController {
    @Autowired
    private OcrContentMapper ocrContentMapper;
    @Autowired
    private OcrContentDTOMapper ocrContentDTOMapper;
@GetMapping("/getAllContent")
public List<OcrContentDTO> getAllContent() {
    return ocrContentDTOMapper.getAllContent();
}

@RequestMapping(value = "/deleteContent", method = RequestMethod.DELETE)
    public String deleteContent(@RequestParam("id") Integer id) {
        try {
            int result = ocrContentMapper.deleteById(id);
            if (result > 0) {
                return "删除成功";
            } else {
                return "删除失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "出现错误" + e.getMessage();
        }
    }
    @RequestMapping(value = "/deleteAllContent", method = RequestMethod.DELETE)
    public String deleteAllContent() {
        try {
            int result = ocrContentMapper.delete(null);
            if (result > 0) {
                return "删除全部成功";
            } else {
                return "删除全部失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "出现错误" + e.getMessage();
        }
    }
}