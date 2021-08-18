alter table BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE add constraint FK_BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE_ON_DIRECTOR foreign key (DIRECTOR_ID) references BSS_CONTACTS(ID);
alter table BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE add constraint FK_BSS_EDUCATIOORGANIZASTRUCTUR_ON_EDUCATIONAL_ORGANIZATIONS foreign key (EDUCATIONAL_ORGANIZATIONS_ID) references BSS_EDUCATIONAL_ORGANIZATIONS(ID);
create index IDX_BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE_ON_DIRECTOR on BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE (DIRECTOR_ID);
create index IDX_BSS_EDUCATIOORGANIZASTRUCTUR_ON_EDUCATIONAL_ORGANIZATIONS on BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE (EDUCATIONAL_ORGANIZATIONS_ID);
