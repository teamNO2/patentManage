package com.suixingpay.mapper;

import com.suixingpay.entities.Patent;
import com.suixingpay.entities.Target;
import com.suixingpay.mapper.adminmapperimpl.LikeProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;


@Mapper
public interface TargetMapper {

    /**
     * @Description: 指标模糊查询
     * @Param: []
     * @return: java.util.List<com.suixingpay.entities.Target>
     * @Author: lichanghao
     * @Date: 2019/11/19
     */
    @SelectProvider( type = LikeProvider.class,method = "likeSelectTarget")
    List<Target> likeSelectTarget(Target target, Patent patent);
}
