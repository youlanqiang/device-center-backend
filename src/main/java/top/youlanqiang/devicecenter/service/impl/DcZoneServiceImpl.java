package top.youlanqiang.devicecenter.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.base.Strings;

import top.youlanqiang.devicecenter.domain.entity.DcZone;
import top.youlanqiang.devicecenter.domain.vo.DcZoneVO;
import top.youlanqiang.devicecenter.mapper.DcZoneMapper;
import top.youlanqiang.devicecenter.service.IDcZoneService;

@Service
public class DcZoneServiceImpl extends ServiceImpl<DcZoneMapper, DcZone> implements IDcZoneService {

    @Override
    public IPage<DcZoneVO> voPage(Integer pageNum, Integer pageSize, String zoneName) {
        var page = lambdaQuery()
                .like(!Strings.isNullOrEmpty(zoneName), DcZone::getName, zoneName)
                .page(PageDTO.of(pageNum, pageSize));

        var result = new Page<DcZoneVO>(pageNum, pageSize);
        result.setTotal(page.getTotal());
        result.setRecords(page.getRecords().stream().map(DcZoneVO::cover).toList());
        return result;
    }

    @Override
    public boolean addZone(DcZoneVO zoneVO) {
        DcZone zone = zoneVO.toZone();
        return save(zone);

    }

}
