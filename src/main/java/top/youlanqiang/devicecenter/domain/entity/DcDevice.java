package top.youlanqiang.devicecenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 设备类
 * 
 * @author youlanqiang
 *         created in 2022/11/23 21:44
 */
@Data
public class DcDevice {

    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备产品id
     */
    private Long fkProductId;

    /**
     * 所属建筑
     */
    private Long fkBuildingId;

    /**
     * 所属楼层
     */
    private Long fkFloorId;

    /**
     * 所属区域
     */
    private Long fkZoneId;

    /**
     * 安装时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime installationTime;

    /**
     * 简介
     */
    private String info;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}
