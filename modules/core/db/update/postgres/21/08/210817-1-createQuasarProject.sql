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
);