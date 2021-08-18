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
);