package top.youlanqiang.devicecenter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import top.youlanqiang.devicecenter.domain.common.ValidateGroups.AddGroup;
import top.youlanqiang.devicecenter.domain.vo.DcZoneVO;
import top.youlanqiang.devicecenter.service.IDcZoneService;

/**
 * @author youlanqiang
 *         created in 2023/04/28 20:14
 */
@RestController
@RequestMapping("/zone")
@AllArgsConstructor
@Tag(name = "区域模块")
public class ZoneController {

    private final IDcZoneService zoneService;

    @GetMapping("/page/{pageNum}/{pageSize}")
    @Operation(summary = "分页")
    public ResponseEntity<IPage<DcZoneVO>> page(@PathVariable("pageNum") Integer pageNum,
            @PathVariable("pageSize") Integer pageSize,
            @Parameter(description = "区域名称") @RequestParam(value = "zoneName", required = false) String zoneName) {
        return ResponseEntity.ok(zoneService.voPage(pageNum, pageSize, zoneName));
    }

    @PostMapping("/addZone")
    @Operation(summary = "新增区域")
    public ResponseEntity<Void> addZone(@Validated(AddGroup.class) @RequestBody DcZoneVO zoneVO) {

        return zoneService.addZone(zoneVO) ? ResponseEntity.ok().build() : ResponseEntity.internalServerError().build();
    }

}
