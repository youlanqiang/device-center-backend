package top.youlanqiang.devicecenter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import top.youlanqiang.devicecenter.domain.common.ValidateGroups.AddGroup;
import top.youlanqiang.devicecenter.domain.common.ValidateGroups.UpdateGroup;
import top.youlanqiang.devicecenter.domain.vo.DcBuildingVO;
import top.youlanqiang.devicecenter.service.IDcBuildingService;

@RestController
@RequestMapping("/building")
@AllArgsConstructor
@Tag(name = "建筑模块")
public class BuildingController {

    private final IDcBuildingService buildingService;

    @PostMapping("/add")
    @Operation(description = "新增建筑", summary = "新增建筑")
    public ResponseEntity<String> addBuilding(@Validated(AddGroup.class) @RequestBody DcBuildingVO buildingVO) {
        return null;
    }

    @DeleteMapping("/remove/{buildingId}")
    @Operation(description = "删除建筑", summary = "删除建筑")
    public ResponseEntity<String> removeBuilding(@PathVariable("buildingId") Long buildingId) {
        return null;
    }

    @PutMapping("/update")
    @Operation(description = "更新建筑", summary = "更新建筑")
    public ResponseEntity<String> updateBuilding(@Validated(UpdateGroup.class) @RequestBody DcBuildingVO buildingVO) {
        return null;
    }

}
