-- begin BSS_QUASAR_PRODUCT
create table BSS_QUASAR_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_NAME varchar(255),
    AIM varchar(255) not null,
    --
    primary key (ID)
)^
-- end BSS_QUASAR_PRODUCT
-- begin BSS_BUSINESS_TYPE
create table BSS_BUSINESS_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end BSS_BUSINESS_TYPE
-- begin BSS_MARKET_SEGMENT
create table BSS_MARKET_SEGMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end BSS_MARKET_SEGMENT
-- begin BSS_COMPETITOR
create table BSS_COMPETITOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end BSS_COMPETITOR
-- begin BSS_QUASAR_PROJECT
create table BSS_QUASAR_PROJECT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PROJECT_NAME varchar(255) not null,
    AIM varchar(255),
    SHORT_PROPOSAL varchar(255),
    PROPOSAL text,
    LONG_PROPOSAL text,
    BUSINESS_TYPE_ID uuid not null,
    --
    primary key (ID)
)^
-- end BSS_QUASAR_PROJECT
-- begin BSS_MAIN_DIRECTION
create table BSS_MAIN_DIRECTION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DIRECTION_NAME varchar(255) not null,
    MISSION text,
    --
    primary key (ID)
)^
-- end BSS_MAIN_DIRECTION
-- begin BSS_QUASAR_PRODUCT_QUASAR_PRODUCT_LINK
create table BSS_QUASAR_PRODUCT_QUASAR_PRODUCT_LINK (
    QUASAR_PRODUCT_1_ID uuid,
    QUASAR_PRODUCT_2_ID uuid,
    primary key (QUASAR_PRODUCT_1_ID, QUASAR_PRODUCT_2_ID)
)^
-- end BSS_QUASAR_PRODUCT_QUASAR_PRODUCT_LINK
