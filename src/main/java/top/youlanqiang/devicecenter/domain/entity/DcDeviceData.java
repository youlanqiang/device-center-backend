package top.youlanqiang.devicecenter.domain.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 设备最新数据
 * 
 * @author youlanqiang
 */
@Data
public class DcDeviceData {

    private Long fkAttributeId;

    private Long fkDeviceId;

    private String dataContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

}
