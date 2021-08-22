create table BSS_EDUCATIONAL_ORGANIZATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    IS_ACTIVE boolean not null,
    SHORT_NAME varchar(255) not null,
    NAME text,
    INN varchar(255),
    OGRN varchar(255),
    SCHOOL_GUID uuid,
    EMAIL varchar(255),
    PHONE varchar(255),
    SITE varchar(255),
    DIRECTOR_ID uuid,
    REGION_ID uuid not null,
    AREA_ID uuid,
    CITY_ID uuid,
    SUB_CITY_ID uuid,
    --
    primary key (ID)
);