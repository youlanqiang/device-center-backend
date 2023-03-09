CREATE DATABASE IF NOT EXISTS `device_center`;

CREATE TABLE IF NOT EXISTS `dc_device`(
    id int(64) primary key,
    name varchar(64) not null comment '设备名称',
    fk_product_id int(64) not null comment '设备产品',
    fk_building_id int(64) comment '所属建筑',
    fk_floor_id int(64) comment '所属楼层',
    fk_zone_id int(64) comment '所属区域',
    installation_time datetime comment '安装时间',
    info varchar(255) comment '简介',
    create_time datetime default now() comment '创建时间',
    update_time datetime default now() on update now() comment '更新时间'
) comment = '设备模块-设备';

CREATE TABLE IF NOT EXISTS `dc_zone`(
    id int(64) primary key,
    name varchar(64) not null comment '区域名称',
    province_code smallint unsigned comment '省份编码',
    city_code smallint unsigned comment '城市编码',
    area_code smallint unsigned comment '区域编码',
    street_info varchar(255) comment '街道信息',
    info varchar(255) comment '简介',
    create_time datetime default now() comment '创建时间',
    update_time datetime default now() on update now() comment '更新时间'
) comment = '建筑模块-园区';

CREATE TABLE IF NOT EXISTS `dc_building`(
    id int(64) primary key,
    name varchar(64) not null comment '建筑名称',
    fk_zone_id int(64) comment '关联园区id',
    province_code smallint unsigned comment '省份编码',
    city_code smallint unsigned comment '城市编码',
    area_code smallint unsigned comment '区域编码',
    street_info varchar(255) comment '街道信息',
    info varchar(255) comment '简介',
    create_time datetime default now() comment '创建时间',
    update_time datetime default now() on update now() comment '更新时间'
) comment = '建筑模块-建筑';

CREATE TABLE IF NOT EXISTS `dc_floor`(
    id int(64) primary key,
    name varchar(64) not null comment '楼层名称',
    fk_building_id int(64) not null comment '关联建筑id',
    info varchar(255) comment '简介',
    sort int default 0 not null comment '排序'
) comment = '建筑模块-楼层';


CREATE TABLE IF NOT EXISTS `dc_product`(
    id int(64) primary key,
    name varchar(64) not null comment '产品名称',
    brand varchar(64) not null comment '品牌',
    service_life tinyint unsigned not null default 0 comment '使用年限，0表示不会过期',
    info varchar(255) comment '简介',
    create_time datetime default now() comment '创建时间',
    update_time datetime default now() on update now() comment '更新时间'
) comment = '设备模块-产品';


CREATE TABLE IF NOT EXISTS `dc_attribute`(
    id int(64) primary key,
    name varchar(64) not null comment '属性名称',
    mark varchar(64) not null comment '属性中文别名',
    type int(4) not null default 0 comment '0-数值类型',
    unit varchar(64) not null comment '单位',
    create_time datetime default now() comment '创建时间',
    update_time datetime default now() on update now() comment '更新时间'
) comment = '设备模块-属性';


CREATE TABLE IF NOT EXISTS `dc_product_attribute`(
    fK_attribute_id int(64) comment  '属性id',
    fk_product_id int(64) comment  '产品id',
    primary key(fK_attribute_id, fk_product_id)
) comment = '设备模块-产品属性关联';

CREATE TABLE IF NOT EXISTS `dc_device_data`(
    fk_attribute_id int(64) comment '属性id',
    fk_device_id int(64) comment '设备id',
    data_content varchar(64) comment '上报数据',
    create_time datetime default now() comment '上报时间',
    primary key(fk_attribute_id, fk_device_id)
) comment = '设备模块-设备最新数据'