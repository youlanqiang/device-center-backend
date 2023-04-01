package top.youlanqiang.devicecenter.domain.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 建筑
 * 
 * @author youlanqiang
 */
@Data
public class DcBuilding {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 建筑名称
     */
    private String name;

    /**
     * 关联园区id
     */
    private Long fkZoneId;

    /**
     * 省份编码
     */
    private Integer provinceCode;

    /**
     * 城市编码
     */
    private Integer cityCode;

    /**
     * 区域编码
     */
    private Integer areaCode;

    /**
     * 街道信息
     */
    private String streetInfo;

    /**
     * 简介
     */
    private String info;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}
