package top.youlanqiang.devicecenter.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import top.youlanqiang.devicecenter.domain.common.ValidateGroups;
import top.youlanqiang.devicecenter.domain.common.ValidateGroups.UpdateGroups;

@Data
@Schema(description = "建筑vo")
public class DcBuildingVO {

    @Schema(description = "建筑ID")
    @NotNull(message = "建筑ID不能为空", groups = UpdateGroups.class)
    private Long id;

    @Schema(description = "建筑名称")
    @NotNull(message = "建筑名称不能为空")
    private String name;
}
