package top.youlanqiang.devicecenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * 
 * 
 * @author youlanqiang
 */
@Data
@TableName("dc_product_attribute")
public class DcProductAttribute {

    private Long fkAttributeId;

    private Long fkProductId;

}
