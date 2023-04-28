package top.youlanqiang.devicecenter.service;

import org.springframework.lang.NonNull;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import top.youlanqiang.devicecenter.domain.entity.DcZone;
import top.youlanqiang.devicecenter.domain.vo.DcZoneVO;

public interface IDcZoneService extends IService<DcZone> {

    /**
     * 返回VO分页对象
     * 
     * @param pageNum  页码
     * @param pageSize 页项数
     * @param zoneName 区域名称
     * @return DcZoneVO对象
     */
    IPage<DcZoneVO> voPage(Integer pageNum, Integer pageSize, String zoneName);

    boolean addZone(@NonNull DcZoneVO zoneVO);
}
