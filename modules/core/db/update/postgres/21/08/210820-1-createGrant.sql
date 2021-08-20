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
);