package top.youlanqiang.devicecenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 楼层
 * 
 * @author youlanqiang
 */
@Data
@TableName("dc_floor")
public class DcFloor {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 楼层名称
     */
    private String name;

    private Long fkBuildingId;

    /**
     * 简介
     */
    private String info;

    /**
     * 排序
     */
    private Integer sort;

}
