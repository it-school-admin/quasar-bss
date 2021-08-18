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
);