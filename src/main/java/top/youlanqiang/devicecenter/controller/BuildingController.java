package top.youlanqiang.devicecenter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import top.youlanqiang.devicecenter.service.IDcBuildingService;

@RestController
@RequestMapping("/building")
@AllArgsConstructor
public class BuildingController {

    private final IDcBuildingService buildingService;

    @PostMapping("/create")
    public ResponseEntity<String> createBuilding() {
        return null;
    }

}
