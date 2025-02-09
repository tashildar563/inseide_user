CREATE TABLE geo_details (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    code VARCHAR(255) NOT NULL,
    parent_hierarchy  VARCHAR(255) NOT NULL UNIQUE,
    immediate_parent_id BIGINT DEFAULT NULL,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255),
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    updated_by VARCHAR(255)
);

CREATE TABLE geo_blocks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(255) NOT NULL,
    type_code varchar(255) not null,
    geo_block_level_id BIGINT DEFAULT NULL
);

CREATE TABLE villages (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    census_code VARCHAR(255) DEFAULT NULL,
    village_code VARCHAR(255) NOT NULL unique,
    parent_geo_details_id  BIGINT NOT NULL,
    pincode varchar(10) not null,
    is_deleted BOOLEAN default false,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255),
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    updated_by VARCHAR(255)
);

CREATE TABLE address (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(255) NOT NULL,
    address_line_one VARCHAR(255) NOT NULL,
    address_line_two VARCHAR(255) DEFAULT NULL,
    landmark varchar(16) default null,
    geo_details_id  BIGINT NOT NULL,
    mobile_number VARCHAR(20) DEFAULT NULL,
    email_address varchar(64) default null,
    pincode varchar(10) not null,
    is_deleted BOOLEAN default false,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255),
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    updated_by VARCHAR(255)
);


CREATE TABLE destination (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    code varchar(16) not null,
    village_id BIGINT DEFAULT NULL,
    description text default null,
    is_deleted BOOLEAN default false,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255),
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    updated_by VARCHAR(255)
);
CREATE TABLE destination_doc (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    destination_id BIGINT DEFAULT NULL,
    description_doc_id varchar(20) default null,
    is_deleted BOOLEAN default false,
    photo_id varchar(20) default null
);
CREATE TABLE travel_details (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    destination_id BIGINT DEFAULT NULL,
    is_deleted BOOLEAN default false,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255),
    updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    updated_by VARCHAR(255)
);


