CREATE TABLE `crayon`.`test_user`
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '自增id',
    `note_id`     varchar(20) NOT NULL COMMENT '文章编号',
    `author`      varchar(8) NULL COMMENT '作者姓名',
    `content`     text NULL COMMENT '内容',
    `create_time` datetime NULL COMMENT '创建时间',
    `update_time` datetime    NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `BIZ_NOTE_IDX1`(`note_id`) USING BTREE COMMENT '文章唯一id'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户表';
CREATE TABLE `crayon`.`test_user_add`
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '自增id',
    `note_id`     varchar(20) NOT NULL COMMENT '文章编号',
    `author`      varchar(8) NULL COMMENT '作者姓名',
    `content`     text NULL COMMENT '内容',
    `create_time` datetime NULL COMMENT '创建时间',
    `update_time` datetime    NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `BIZ_NOTE_IDX1`(`note_id`) USING BTREE COMMENT '文章唯一id'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户补充信息表';
CREATE TABLE `crayon`.`test_user_note`
(
    `id`          bigint      NOT NULL AUTO_INCREMENT COMMENT '自增id',
    `note_id`     varchar(20) NOT NULL COMMENT '文章编号',
    `author`      varchar(8) NULL COMMENT '作者姓名',
    `content`     text NULL COMMENT '内容',
    `create_time` datetime NULL COMMENT '创建时间',
    `update_time` datetime    NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `BIZ_NOTE_IDX1`(`note_id`) USING BTREE COMMENT '文章唯一id'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户文章表';