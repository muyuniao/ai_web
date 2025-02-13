package com.example.Airtificial._Intellegence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.Airtificial._Intellegence.dto.OcrContent;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface OcrContentMapper extends BaseMapper<OcrContent> {
    @Delete("DELETE FROM ocr_content WHERE id = #{id}")
    int deleteById(@Param("id") Integer id);
}
