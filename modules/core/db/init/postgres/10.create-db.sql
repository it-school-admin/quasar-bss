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
    AIM varchar(255),
    BUSINESS_VALUE text,
    DIRECTION_ID uuid,
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
    BUSINESS_TYPE_NAME varchar(255),
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
    BUSINESS_TYPE_ID uuid,
    SEGMENT_NAME varchar(255),
    PARENT_SEGMENT_ID uuid,
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
    NAME varchar(255),
    YEAR_BUDGET integer,
    YEAR_PROFIT integer,
    COST integer,
    FOUNDATION_DATE date,
    OFFICIAL_SITE varchar(255),
    LINK_TO_RUS_PROFILE varchar(255),
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
-- begin BSS_COMPETITOR_PRODUCT
create table BSS_COMPETITOR_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_NAME varchar(255) not null,
    DESCRIPTION varchar(255),
    PRICE_WITHOUT_TIME_LIMITS integer,
    PRICE_PER_YEAR integer,
    COMPETITOR_ID uuid,
    SALES integer,
    SITE_LINK varchar(255),
    PARENT_PRODUCT_ID uuid,
    --
    primary key (ID)
)^
-- end BSS_COMPETITOR_PRODUCT
-- begin BSS_FEATURE
create table BSS_FEATURE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(255),
    PARENT_FEATURE_ID uuid,
    PRODUCT_ID uuid,
    --
    primary key (ID)
)^
-- end BSS_FEATURE
-- begin BSS_QUASAR_PROJECT_MAIN_DIRECTION_LINK
create table BSS_QUASAR_PROJECT_MAIN_DIRECTION_LINK (
    MAIN_DIRECTION_ID uuid,
    QUASAR_PROJECT_ID uuid,
    primary key (MAIN_DIRECTION_ID, QUASAR_PROJECT_ID)
)^
-- end BSS_QUASAR_PROJECT_MAIN_DIRECTION_LINK
-- begin BSS_COMPETITOR_PRODUCT_QUASAR_PRODUCT_LINK
create table BSS_COMPETITOR_PRODUCT_QUASAR_PRODUCT_LINK (
    COMPETITOR_PRODUCT_ID uuid,
    QUASAR_PRODUCT_ID uuid,
    primary key (COMPETITOR_PRODUCT_ID, QUASAR_PRODUCT_ID)
)^
-- end BSS_COMPETITOR_PRODUCT_QUASAR_PRODUCT_LINK
-- begin BSS_CONTACT_KIND
create table BSS_CONTACT_KIND (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end BSS_CONTACT_KIND
-- begin BSS_CONTACTS
create table BSS_CONTACTS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONTACT_NAME varchar(255),
    DESCRIPTION varchar(255),
    CONTACT_DATA varchar(255),
    --
    primary key (ID)
)^
-- end BSS_CONTACTS
-- begin BSS_CONTACTS_CONTACT_KIND_LINK
create table BSS_CONTACTS_CONTACT_KIND_LINK (
    CONTACTS_ID uuid,
    CONTACT_KIND_ID uuid,
    primary key (CONTACTS_ID, CONTACT_KIND_ID)
)^
-- end BSS_CONTACTS_CONTACT_KIND_LINK
-- begin BSS_REGION
create table BSS_REGION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REGION_CODE varchar(255) not null,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BSS_REGION
-- begin BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE
create table BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHORT_NAME varchar(255),
    NAME varchar(255),
    DIRECTOR_ID uuid,
    SITE varchar(255),
    ADDRESS varchar(255),
    EDUCATIONAL_ORGANIZATIONS_ID uuid not null,
    --
    primary key (ID)
)^
-- end BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE
-- begin BSS_EDUCATIONAL_ORGANIZATIONS
create table BSS_EDUCATIONAL_ORGANIZATIONS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHORT_NAME varchar(255),
    NAME varchar(255),
    ADDRESS varchar(255),
    EMAIL varchar(255),
    PHONE varchar(255),
    SITE varchar(255),
    DIRECTOR_ID uuid,
    --
    primary key (ID)
)^
-- end BSS_EDUCATIONAL_ORGANIZATIONS
-- begin BSS_FUND
create table BSS_FUND (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    SHORT_NAME varchar(255),
    SITELINK varchar(255),
    --
    primary key (ID)
)^
-- end BSS_FUND
-- begin BSS_GRANT
create table BSS_GRANT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    AMOUNT integer,
    GRANT_DATE varchar(255),
    FUND_ID uuid not null,
    SITELINK varchar(255),
    --
    primary key (ID)
)^
-- end BSS_GRANT
