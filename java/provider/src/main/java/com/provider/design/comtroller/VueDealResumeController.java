package com.provider.design.comtroller;

import com.provider.design.service.VueDealResumeService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilFeatures;
import core.design.pojo.ResumeListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 *  MrChengs
 *  2020/1/17
 *  处理简历模块
 */
@RestController
public class VueDealResumeController {


    @Autowired
    VueDealResumeService vueDealResumeService;


    //查询为处理的简历列表
    @GetMapping("/vuegetAllResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllResumeByBossUserId(@PathVariable("userId")Integer userId){

        List<ResumeListDto> resumeListDtos = new ArrayList<>();
        try {
            resumeListDtos = vueDealResumeService.getAllResumeByBossId(userId);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.SELECT_DEAL_CODE,UtilFeatures.SELECT_DEAL_DESC);
        }
        return resumeListDtos;
    }


}
