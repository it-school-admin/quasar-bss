create table BSS_IMPORTED_POST_CODE_1 (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    POST_INDEX varchar(6) not null,
    OPS_NAME varchar(255),
    OPS_TYPE varchar(255),
    PARENT_CODE varchar(255),
    AUTONOM varchar(255),
    AREA varchar(255),
    CITY varchar(255),
    SUB_CITY varchar(255),
    ACT_DATE varchar(255),
    INDEX_OLD varchar(8),
    --
    primary key (ID)
);