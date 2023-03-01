package top.youlanqiang.devicecenter.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author youlanqiang
 * created in 2022/11/23 21:44
 */
@Data
public class DcDevice {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    private String name;

    private String fkProductId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
