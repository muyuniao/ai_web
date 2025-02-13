package com.example.Airtificial._Intellegence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.Airtificial._Intellegence.dto.OcrContentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OcrContentDTOMapper extends BaseMapper<OcrContentDTO> {
    @Select("SELECT id, content, type, create_time, update_time FROM ocr_content")
    List<OcrContentDTO> getAllContent();
}