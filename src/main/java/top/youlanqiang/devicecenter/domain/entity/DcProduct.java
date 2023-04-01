package top.youlanqiang.devicecenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 产品类
 * 
 * @author youlanqiang
 *         created in 2022/11/25 00:30
 */
@Data
public class DcProduct {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 使用年限,0表示不会过期
     */
    private Short serviceLife;

    /**
     * 简介
     */
    private String info;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

}
