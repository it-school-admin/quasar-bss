alter table BSS_QUASAR_PRODUCT_QUASAR_PRODUCT_LINK add constraint FK_QUAPROQUAPRO_ON_QUASAR_PRODUCT_1 foreign key (QUASAR_PRODUCT_1_ID) references BSS_QUASAR_PRODUCT(ID);
alter table BSS_QUASAR_PRODUCT_QUASAR_PRODUCT_LINK add constraint FK_QUAPROQUAPRO_ON_QUASAR_PRODUCT_2 foreign key (QUASAR_PRODUCT_2_ID) references BSS_QUASAR_PRODUCT(ID);