alter table BSS_MARKET_SEGMENT add constraint FK_BSS_MARKET_SEGMENT_ON_PARENT_SEGMENT foreign key (PARENT_SEGMENT_ID) references BSS_MARKET_SEGMENT(ID);
create index IDX_BSS_MARKET_SEGMENT_ON_PARENT_SEGMENT on BSS_MARKET_SEGMENT (PARENT_SEGMENT_ID);
