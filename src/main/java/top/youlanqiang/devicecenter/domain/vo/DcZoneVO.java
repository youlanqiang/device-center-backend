package top.youlanqiang.devicecenter.domain.vo;

import org.springframework.beans.BeanUtils;
import org.springframework.lang.NonNull;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import top.youlanqiang.devicecenter.domain.common.ValidateGroups.UpdateGroup;
import top.youlanqiang.devicecenter.domain.entity.DcZone;

@Data
@Schema(description = "区域vo")
public class DcZoneVO {

    @Schema(description = "区域ID, 新增接口无视")
    @NotNull(message = "区域ID不能为空", groups = UpdateGroup.class)
    private Long id;

    @Schema(description = "区域名称")
    @NotNull(message = "区域名称不能为空")
    private String name;

    @Schema(description = "省份编码")
    private Integer provinceCode;

    @Schema(description = "省份名称", readOnly = true)
    private String provinceCodeStr;

    @Schema(description = "城市编码")
    private Integer cityCode;

    @Schema(description = "城市名称", readOnly = true)
    private String cityCodeStr;

    @Schema(description = "区域编码")
    private Integer areaCode;

    @Schema(description = "区域名称", readOnly = true)
    private String areaCodeStr;

    @Schema(description = "街道信息")
    private String streetInfo;

    @Schema(description = "简介")
    private String info;

    public static DcZoneVO cover(@NonNull DcZone zone) {
        DcZoneVO zoneVO = new DcZoneVO();
        BeanUtils.copyProperties(zone, zoneVO);
        return zoneVO;
    }

    public DcZone toZone() {
        DcZone zone = new DcZone();
        BeanUtils.copyProperties(this, zone);
        return zone;
    }
}
