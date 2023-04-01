package top.youlanqiang.devicecenter.domain.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import top.youlanqiang.devicecenter.domain.common.ValidateGroups.UpdateGroup;

@Data
@Schema(description = "建筑vo")
public class DcBuildingVO {

    @Schema(description = "建筑ID")
    @NotNull(message = "建筑ID不能为空", groups = UpdateGroup.class)
    private Long id;

    @Schema(description = "建筑名称")
    @NotNull(message = "建筑名称不能为空")
    private String name;

    @Schema(description = "关联园区id")
    private Long fkZoneId;

    @Schema(description = "关联园区名称")
    private String fkZoneName;

    @Schema(description = "省份编码")
    private Integer provinceCode;

    @Schema(description = "城市编码")
    private Integer cityCode;

    @Schema(description = "区域编码")
    private Integer areaCode;

    @Schema(description = "街道信息")
    private String streetInfo;

    @Schema(description = "简介")
    private String info;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

}
