alter table BSS_QUASAR_PRODUCT add constraint FK_BSS_QUASAR_PRODUCT_ON_DIRECTION foreign key (DIRECTION_ID) references BSS_MAIN_DIRECTION(ID);
create index IDX_BSS_QUASAR_PRODUCT_ON_DIRECTION on BSS_QUASAR_PRODUCT (DIRECTION_ID);