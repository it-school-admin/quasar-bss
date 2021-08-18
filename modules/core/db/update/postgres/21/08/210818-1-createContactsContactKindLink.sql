create table BSS_CONTACTS_CONTACT_KIND_LINK (
    CONTACTS_ID uuid,
    CONTACT_KIND_ID uuid,
    primary key (CONTACTS_ID, CONTACT_KIND_ID)
);
