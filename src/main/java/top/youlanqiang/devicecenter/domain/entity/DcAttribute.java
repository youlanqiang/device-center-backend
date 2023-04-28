package top.youlanqiang.devicecenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 产品属性实体类
 * 
 * @author youlanqiang
 *         created in 2022/11/25 00:31
 */
@Data
@TableName("dc_attribute")
public class DcAttribute {

    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性中文别名
     */
    private String mark;

    /**
     * 类型 0-数值类型
     */
    private Integer type;

    /**
     * 单位
     */
    private String unit;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}
