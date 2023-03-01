package top.youlanqiang.devicecenter.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author youlanqiang
 * created in 2022/11/25 00:54
 */
@RestController("/device")
public class DeviceController {

    @PostMapping
    public ResponseEntity<String> addDevice(){
        return ResponseEntity.ok("添加成功");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDevice(@PathVariable("id") String id){
        return ResponseEntity.ok("删除成功");
    }

    @PutMapping
    public ResponseEntity<String> updateDevice(){
        return ResponseEntity.ok("更新成功");
    }

}
