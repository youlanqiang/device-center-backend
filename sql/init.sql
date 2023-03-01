CREATE TABLE `dc_device`(
    id varchar(64) primary key,
    name varchar(64) not null comment '设备名称',
    fk_product_id varchar(64) not null comment '设备产品',
    create_time datetime default now() comment '创建时间'
) comment = '设备模块-设备';


CREATE TABLE `dc_product`(
    id varchar(64) primary key,
    name varchar(64) not null comment '产品名称',
    brand varchar(64) not null comment '品牌',
    create_time datetime default now() comment '创建时间'
) comment = '设备模块-产品';


CREATE TABLE `dc_attribute`(
    id varchar(64) primary key,
    name varchar(64) not null comment '属性名称',
    mark varchar(64) not null comment '属性别名',
    type int(4) not null default 0 comment '0-数字类型',
    unit varchar(64) not null comment '单位',
    create_time datetime default now() comment '创建时间'
) comment = '设备模块-属性';


CREATE TABLE `dc_product_attribute`(
    fK_attribute_id varchar(64) comment  '属性id',
    fk_product_id varchar(64) comment  '产品id',
    primary key(fK_attribute_id, fk_product_id)
) comment = '设备模块-产品属性关联';

